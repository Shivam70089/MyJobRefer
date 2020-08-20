package com.minds3i.myjobrefer.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.minds3i.myjobrefer.constants.MjrConstants;
import com.minds3i.myjobrefer.security.jwt.MJRAuthEntryPoint;
import com.minds3i.myjobrefer.security.jwt.MJRRequestFilter;
import com.minds3i.myjobrefer.service.impl.MJRUserDetailsServiceImpl;

@Configuration
@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
public class MyJobReferSecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	MJRUserDetailsServiceImpl userDetailsService;

	@Bean
	public MjrConstants mjrConstants() {
		return new MjrConstants();
	}
	
	@Bean
	public MJRRequestFilter mjrRequestFilter() {
		return new MJRRequestFilter();
	}

	@Bean
	public MJRAuthEntryPoint authenticationEntryPoint() {
		return new MJRAuthEntryPoint();
	}

	@Override
	public void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
		authenticationManagerBuilder.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
	}

	@Bean
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		mjrConstants();
		http.cors().and().csrf().disable().exceptionHandling().authenticationEntryPoint(authenticationEntryPoint())
				.and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
				.authorizeRequests().antMatchers(MjrConstants.AUTHURLS).permitAll().anyRequest().authenticated();

		http.addFilterBefore(mjrRequestFilter(), UsernamePasswordAuthenticationFilter.class);
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		mjrConstants();
		web.ignoring().antMatchers(MjrConstants.NON_AUTHURLS);
	}

}

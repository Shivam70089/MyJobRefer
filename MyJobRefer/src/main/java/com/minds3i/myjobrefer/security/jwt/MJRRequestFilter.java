package com.minds3i.myjobrefer.security.jwt;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.minds3i.myjobrefer.service.impl.MJRUserDetailsServiceImpl;

@Component
public class MJRRequestFilter extends OncePerRequestFilter {
	
	@Autowired
    private MJRUserDetailsServiceImpl mjrUserDetailsService;

    @Autowired
    private MJR_JWTokenService mjrJWTutil;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {

		final String authorization = request.getHeader("Authorization");
		String username = null;
		String jwt = null;
		if (authorization != null && authorization.startsWith("Bearer ")) {
			jwt = authorization.substring(7);
			username = mjrJWTutil.getUsername(jwt);
		}

		if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
			UserDetails userDetails = mjrUserDetailsService.loadUserByUsername(username);
			if (mjrJWTutil.tokenValidation(jwt, userDetails)) {
				UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(
						userDetails, userDetails.getPassword(), userDetails.getAuthorities());
				usernamePasswordAuthenticationToken
						.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
				SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
			}
		}
		filterChain.doFilter(request, response);

	}

}

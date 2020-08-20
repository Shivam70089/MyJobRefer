package com.minds3i.myjobrefer.security.jwt;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class MJR_JWTokenService {
	
	private String SECRET_KEY = "132510152_secret_1856518";

    public String getUsername(String jwtToken) {
        return getClaim(jwtToken, Claims::getSubject);
    }

    public Date getTokenExpiration(String jwtToken) {
        return getClaim(jwtToken, Claims::getExpiration);
    }

    public <T> T getClaim(String jwtToken, Function<Claims, T> claimsResolver) {
        final Claims claims = getClaims(jwtToken);
        return claimsResolver.apply(claims);
    }
    private Claims getClaims(String jwtToken) {
        return Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(jwtToken).getBody();
    }

    public String generateToken(UserDetails userDetails) {
        Map<String, Object> claims = new HashMap<>();
        return createToken(claims, userDetails.getUsername());
    }

    private String createToken(Map<String, Object> claims, String subject) {

        return Jwts.builder().setClaims(claims).setSubject(subject).setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10))
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY).compact();
    }

    public Boolean tokenValidation(String jwtToken, UserDetails userDetails) {
        final String username = getUsername(jwtToken);
        return (username.equals(userDetails.getUsername()) && !isTokenExpired(jwtToken));
    }

    private Boolean isTokenExpired(String token) {
        return getTokenExpiration(token).before(new Date());
    }
}

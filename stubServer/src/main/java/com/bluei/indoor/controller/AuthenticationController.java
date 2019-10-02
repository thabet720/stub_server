package com.bluei.indoor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bluei.indoor.AuthToken;
import com.bluei.indoor.JwtTokenUtil;
import com.bluei.indoor.entities.User;
import com.bluei.indoor.service.UserService;
@RestController
public class AuthenticationController {
	 @Autowired
	    private AuthenticationManager authenticationManager;

	    @Autowired
	    private JwtTokenUtil jwtTokenUtil;

	    @Autowired
	    private UserService userService;

	    @RequestMapping(value = "/backend/1/generate-token", method = RequestMethod.POST)
	    public ResponseEntity<?> register(@RequestBody User loginUser) throws AuthenticationException {

	        final Authentication authentication = authenticationManager.authenticate(
	                new UsernamePasswordAuthenticationToken(
	                        loginUser.getUsername(),
	                        loginUser.getPassword()
	                )
	        );
	        SecurityContextHolder.getContext().setAuthentication(authentication);
	        final User user = userService.findOne(loginUser.getUsername());
	        final String token = jwtTokenUtil.generateToken(user);
	        return ResponseEntity.ok(new AuthToken(token, user));
	    }


}

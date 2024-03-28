package com.n22.infi.infinicapitals.controller.accounts;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.n22.infi.infinicapitals.constants.AppConstants;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



/**
 * Author: Nishanthan
 * Class Description: This class consists of all the APIs and functionalities responsible for user authentication and role management services
 */

@RestController
@RequestMapping("infini")
public class UserAuthenticationController {

	
	@GetMapping("welcome")
	public String welcome() {
		
		return "Welcome to "+ AppConstants.INFINICAPITALS;
	}
	
	
	@PostMapping("authenticate")
	public HttpStatus authenticateUser(@RequestBody String requestBody) {
		
		return HttpStatus.OK;
	}
	
	
	
	 
	
}

package com.lti.flipfit.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.flipfit.entity.GymFlipFitUser;
import com.lti.flipfit.services.GymFlipFitUserService;

import jakarta.jws.soap.SOAPBinding.Use;

/**
 * REST controller for managing user-related operations in the GymFlipFit application.
 *
 * <p>This controller provides endpoints for user management, including registration,
 * login, update, retrieval, and deletion of user accounts. All responses are returned
 * in JSON format.</p>
 *
 * <h2>Responsibilities:</h2>
 * <ul>
 *     <li>Expose REST endpoints for user operations</li>
 *     <li>Handle HTTP requests and delegate business logic to the service layer</li>
 * </ul>
 *
 * <h2>Endpoints:</h2>
 * <ul>
 *     <li><b>GET /user/{id}</b> - Retrieve user details by ID</li>
 *     <li><b>POST /user/register</b> - Register a new user</li>
 *     <li><b>POST /user/login</b> - Authenticate user login</li>
 *     <li><b>PUT /user/{id}</b> - Update user details</li>
 *     <li><b>DELETE /user/{id}</b> - Delete user account</li>
 * </ul>
 *
 * @author Team Bravo
 * @version v1.0.0
 * @see GymFlipFitUser
 */

@RestController
@RequestMapping("/user")
public class GymFlipFitUserController {
	
	@Autowired
	private GymFlipFitUserService userService;
	
	Logger logger = LoggerFactory.getLogger(GymFlipFitUserController.class);
	
	@GetMapping("/{id}")
	public ResponseEntity<GymFlipFitUser> getUser(@PathVariable("id") int id) {
		logger.info("Fetching user Information for id: " + id);
		GymFlipFitUser user = userService.getUser(id);
		return new ResponseEntity(user, HttpStatus.OK);
		
	}
	
	@PostMapping("/register")
	public ResponseEntity<GymFlipFitUser> registerUser(@RequestBody GymFlipFitUser user) {
		logger.info("Registering user");
		GymFlipFitUser userDb = userService.registerUser(user);
		return new ResponseEntity(userDb, HttpStatus.OK);
		
	}
	
	@PostMapping("/login")
	public ResponseEntity<GymFlipFitUser> loginUser(@RequestBody GymFlipFitUser user) {
		return null;
		
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<GymFlipFitUser> updateUser(@RequestBody GymFlipFitUser user, @PathVariable("id") int id) {
		return null;
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<GymFlipFitUser> deleteUser(@PathVariable("id") int id) {
		return null;
		
	}

}

package com.lti.flipfit.services;

import java.util.Date;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.flipfit.entity.GymFlipFitAdmin;
import com.lti.flipfit.entity.GymFlipFitUser;
import com.lti.flipfit.exception.UserNotFoundException;
import com.lti.flipfit.repository.UserRepository;


/**
 * Service implementation for managing user operations in the GymFlipFit application.
 *
 * <p>This service provides methods for user-related actions such as registration,
 * login, update, retrieval, and deletion.</p>
 */

@Service
public class GymFlipFitUserServiceImpl implements GymFlipFitUserService {

	@Autowired
	private UserRepository userRepository;

	Logger logger = LoggerFactory.getLogger(GymFlipFitUserServiceImpl.class);


	/**
	 * Retrieves a user by their unique ID.
	 *
	 * @param id the unique identifier of the user
	 * @return the {@link GymFlipFitUser} object if found, otherwise null
	 */

	@Override
	public GymFlipFitUser getUser(int id) {
		Optional<GymFlipFitUser> user = Optional.ofNullable(userRepository.findById(id).orElseThrow(() -> new UserNotFoundException(String.format("User not present with id %s", id))));
		logger.info("Fetched user details" + user.get());
		return user.get();
	}


	/**
	 * Registers a new user in the system.
	 *
	 * @param user the {@link GymFlipFitUser} object containing user details
	 * @return the registered {@link GymFlipFitUser} object
	 */

	@Override
	public GymFlipFitUser registerUser(GymFlipFitUser user) {
		logger.info("Creating user" + user);
		GymFlipFitUser userDb = userRepository.save(user);
		return userDb;
	}


	/**
	 * Authenticates a user based on provided credentials.
	 *
	 * @param user the {@link GymFlipFitUser} object containing login details
	 * @return the authenticated {@link GymFlipFitUser} object if credentials are valid, otherwise null
	 */

	@Override
	public GymFlipFitUser loginUser(GymFlipFitUser user) {
		// TODO Auto-generated method stub
		return null;
	}


	/**
	 * Updates the details of an existing user.
	 *
	 * @param user the {@link GymFlipFitUser} object containing updated details
	 * @return the updated {@link GymFlipFitUser} object
	 */
	@Override
	public GymFlipFitUser updateUser(GymFlipFitUser user) {
		GymFlipFitUser userDb = getUser(user.getId());
		userDb.setFirstName(user.getFirstName());
		userDb.setLastName(user.getLastName());
		userDb.setEmail(user.getEmail());
		userDb.setPhoneNo(user.getPhoneNo());
		userDb.setStatus(user.getStatus());
		userDb.setUpdatedAt(new Date());
		userDb.setAddress(user.getAddress());
		userRepository.save(userDb);
		logger.info("User updated successfully." + userDb);
		return userDb;
	}


	/**
	 * Deletes a user by their unique ID.
	 *
	 * @param id the unique identifier of the user to delete
	 * @return the deleted {@link GymFlipFitUser} object if found, otherwise null
	 */

	@Override
	public GymFlipFitUser deleteUser(int id) {
		GymFlipFitUser userDb = getUser(id);
		userRepository.deleteById(id);
		logger.info("User deleted successfully." + userDb);
		return userDb;
	}

}

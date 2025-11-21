package com.lti.flipfit.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.flipfit.constants.BookingStatus;
import com.lti.flipfit.entity.GymFlipFitAdmin;
import com.lti.flipfit.entity.GymFlipFitCustomer;
import com.lti.flipfit.entity.GymFlipFitSlot;
import com.lti.flipfit.exception.AdminNotFoundException;
import com.lti.flipfit.exception.CustomerNotFoundException;
import com.lti.flipfit.repository.GymFlipFitAdminRepository;
import com.lti.flipfit.rest.GymFlipFitAdminController;

@Service
/**
 * GymFlipFitAdminServiceImpl
 *
 * This class implements administrative operations for the FlipFit Gym application.
 * It provides functionality to manage customers and slots, including creation, update,
 * retrieval, and deletion.
 *
 * Responsibilities:
 * - Manage gym customers (CRUD operations).
 * - Manage gym slots (CRUD operations).
 *
 * Dependencies:
 * - GymFlipFitSlotService for slot creation and management.
 *
 * Author: [Your Name]
 * Date: [Date]
 */
public class GymFlipFitAdminServiceImpl implements GymFlipFitAdminService {
	
	@Autowired
	private GymFlipFitAdminRepository adminRepository;

	@Autowired
	private GymFlipFitSlotService slotService;

	@Autowired
	private GymFlipFitCustomerService customerService;

	private final List<GymFlipFitAdmin> admins = new ArrayList<>();

	private final AtomicLong counter = new AtomicLong();
	
	private static final Logger logger = LoggerFactory.getLogger(GymFlipFitAdminController.class);


	// Customer methods implementations 
	@Override
	/**
	 * findAllCustomers
	 *
	 * Purpose: Implements findAllCustomers functionality.
	 * @return List<GymFlipFitCustomer>
	 */
	public List<GymFlipFitCustomer> findAllCustomers() {
		return customerService.findAllCustomers(); // Return a copy to prevent external modification
	}

	@Override
	/**
	 * findCustomerById
	 *
	 * Purpose: Implements findCustomerById functionality.
	 * @param id Long
	 * @return Optional<GymFlipFitCustomer>
	 */
	public Optional<GymFlipFitCustomer> findCustomerById(Long id) {
		return customerService.findCustomerById(id);
	}

	@Override
	/**
	 * updateCustomer
	 *
	 * Purpose: Implements updateCustomer functionality.
	 * @param id Long
	 * @param customerDetails GymFlipFitCustomer
	 * @return GymFlipFitCustomer
	 */
	public GymFlipFitCustomer updateCustomer(Long id, GymFlipFitCustomer customerDetails) {
		return customerService.updateCustomer(id, customerDetails);
	}

	@Override
	public Optional<GymFlipFitAdmin> findAdminById(Integer id) {
		//return Optional.ofNullable(admins.stream().filter(c -> c.getId().equals(id)).findFirst().orElseThrow(() -> new AdminNotFoundException(String.format("Admin not found for the given id: %s", id))));
		return Optional.ofNullable(adminRepository.findById(id.intValue()).orElseThrow(() -> new AdminNotFoundException(String.format("Admin not found with id %s", id))));
	}

	@Override
	public GymFlipFitAdmin createAdmin(GymFlipFitAdmin admin) {
		//admin.setId((int)counter.incrementAndGet());
		//admins.add(admin);
		GymFlipFitAdmin adminDb = adminRepository.save(admin);
		logger.info("Admin created successfully: " + adminDb);
		return adminDb;
	}

	@Override
	public GymFlipFitAdmin updateAdmin(Integer id, GymFlipFitAdmin admin) {
		/*return findAdminById(id).map(ad -> {
			ad.setFirstName(admin.getFirstName());
			ad.setLastName(admin.getLastName());
			ad.setEmail(admin.getEmail());
			return ad;
		}).orElse(null);*/
		GymFlipFitAdmin adminDb = findAdminById(id).get();
		adminDb.setFirstName(admin.getFirstName());
		adminDb.setLastName(admin.getLastName());
		adminDb.setEmail(admin.getEmail());
		adminDb.setPhoneNo(admin.getPhoneNo());
		adminDb.setStatus(admin.getStatus());
		adminDb.setUpdatedAt(new Date());
		adminDb.setAddress(admin.getAddress());
		adminRepository.save(adminDb);
		logger.info("Admin updated successfully." + adminDb);
		return adminDb;
	}

	@Override
	public List<GymFlipFitAdmin> findAllAdmins() {
		logger.info("Finding all admins.");
		return adminRepository.findAll();
	}

	@Override
	public void deleteAdmin(Integer id) {
		//admins.removeIf(c -> c.getId().equals(id));
		adminRepository.deleteById(id);
		logger.info("Admin updated successfully." + id);
	}

	/**
	 * updateSlot
	 *
	 * Purpose: Implements updateSlot functionality.
	 * @param id Long
	 * @param slotDetails GymFlipFitSlot
	 * @return GymFlipFitSlot
	 */
	/*
	 * @Override public GymFlipFitSlot updateSlot(Long id, GymFlipFitSlot
	 * slotDetails) { slotService }
	 */

	/**
	 * deleteSlot
	 *
	 * Purpose: Implements deleteSlot functionality.
	 * @param id Long
	 */
	/*
	 * @Override public void deleteSlot(Long id) { slots.removeIf(c ->
	 * c.getId().equals(id)); }
	 */

}

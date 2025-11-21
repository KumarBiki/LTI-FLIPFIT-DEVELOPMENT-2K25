package com.lti.flipfit.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.lti.flipfit.entity.GymFlipFitAdmin;
import com.lti.flipfit.entity.GymFlipFitCustomer;
import com.lti.flipfit.entity.GymFlipFitSlot;

public interface GymFlipFitAdminService {
	
	public List<GymFlipFitCustomer> findAllCustomers();
	public Optional<GymFlipFitCustomer> findCustomerById(Long id);
	public GymFlipFitCustomer updateCustomer(Long id, GymFlipFitCustomer customerDetails);

	public Optional<GymFlipFitAdmin> findAdminById(Integer id);
	public GymFlipFitAdmin createAdmin(GymFlipFitAdmin admin);
	public GymFlipFitAdmin updateAdmin(Integer id, GymFlipFitAdmin admin);
	public List<GymFlipFitAdmin> findAllAdmins();
	public void deleteAdmin(Integer id);


}

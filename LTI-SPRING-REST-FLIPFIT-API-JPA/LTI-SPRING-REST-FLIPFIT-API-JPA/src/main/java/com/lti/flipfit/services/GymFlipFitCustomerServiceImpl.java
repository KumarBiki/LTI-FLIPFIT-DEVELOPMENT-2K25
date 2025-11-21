package com.lti.flipfit.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.lti.flipfit.entity.GymFlipFitCustomer;
import com.lti.flipfit.exception.CustomerNotFoundException;

@Service
public class GymFlipFitCustomerServiceImpl implements GymFlipFitCustomerService {

	private final List<GymFlipFitCustomer> customers = new ArrayList<>();
	private final AtomicLong counter = new AtomicLong();
	@Override
	public List<GymFlipFitCustomer> findAllCustomers() {
		return new ArrayList<>(customers); // Return a copy to prevent external modification
	}
	@Override
	public Optional<GymFlipFitCustomer> findCustomerById(Long id) {
		return Optional.ofNullable(customers.stream().filter(c -> c.getCustomerId().equals(id)).findFirst().orElseThrow(() -> new CustomerNotFoundException(String.format("Customer not found for the given id: %s", id))));
	}
	@Override
	public GymFlipFitCustomer saveCustomer(GymFlipFitCustomer customer) {
		customer.setCustomerId((int)counter.incrementAndGet());
		customers.add(customer);
		return customer;
	}
	@Override
	public GymFlipFitCustomer updateCustomer(Long id, GymFlipFitCustomer customerDetails) {
		return findCustomerById(id).map(customer -> {
			customer.setCustomerFirstName(customerDetails.getCustomerFirstName());
			customer.setCustomerLastName(customerDetails.getCustomerLastName());
			customer.setEmail(customerDetails.getEmail());
			return customer;
		}).orElse(null);
	}
	@Override
	public void deleteCustomer(Long id) {
		customers.removeIf(c -> c.getCustomerId().equals(id));
	}

}

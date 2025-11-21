package com.lti.flipfit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.flipfit.entity.GymFlipFitCustomer;

@Repository
public interface GymFlipFitCustomerRepository extends JpaRepository<GymFlipFitCustomer, Integer> {

}

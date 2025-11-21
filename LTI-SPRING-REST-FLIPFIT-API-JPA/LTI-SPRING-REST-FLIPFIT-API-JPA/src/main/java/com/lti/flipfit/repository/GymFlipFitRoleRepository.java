package com.lti.flipfit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.flipfit.entity.GymFlipFitAddress;
import com.lti.flipfit.entity.GymFlipFitRole;

@Repository
public interface GymFlipFitRoleRepository extends JpaRepository<GymFlipFitRole, Integer>{

}

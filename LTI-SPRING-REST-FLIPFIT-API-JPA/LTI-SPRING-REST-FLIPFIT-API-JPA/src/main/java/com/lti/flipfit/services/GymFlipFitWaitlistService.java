/**
 * 
 */
package com.lti.flipfit.services;

import java.util.List;
import java.util.Optional;

import com.lti.flipfit.entity.GymFlipFitWaitList;

/**
 * 
 */
public interface GymFlipFitWaitlistService {

	public GymFlipFitWaitList join(Integer userId, Integer centerId, Integer slotId);

	public Optional<GymFlipFitWaitList> promoteNext(Integer centerId, Integer slotId);

	public List<GymFlipFitWaitList> list(Integer centerId, Integer slotId);
}

package com.cg.AmusementParkTicketbooking.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.AmusementParkTicketbooking.entities.Activity;

@Repository

public interface ActivityRepository extends JpaRepository<Activity, Integer> {
	public void save(Double activity);

	public List<Activity> findByPriceGreaterThanEqual(float price);

	public List<Activity> findByPriceLessThanEqual(float price);

	public List<Activity> findByActivityName(String activityName);

	public Optional<Activity> findById(int id);

	public List<Activity> findByPrice(float price);

//	public List<Activity> findByPriceBetween(float price);

}

package com.logistics.pickupservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.logistics.pickupservices.model.Pickup;

@Repository
public interface PickupRepository extends JpaRepository<Pickup, Integer> {

}

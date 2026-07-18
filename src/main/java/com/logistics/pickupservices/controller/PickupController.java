package com.logistics.pickupservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.logistics.pickupservices.dto.ShipmentDto;
import com.logistics.pickupservices.model.Pickup;
import com.logistics.pickupservices.service.PickupService;

@RestController
@RequestMapping("/api/pickup")
public class PickupController {

	   @Autowired
	   private PickupService pickupservice;
	   
	   @PostMapping("/save")
	   public ShipmentDto save(@RequestBody Pickup pickup) {
		   
		   return pickupservice.save(pickup);
	   }
	   
	   @GetMapping("/getall")
	   public List<Pickup> getAll(){
		   return pickupservice.getAllPickups();
	   }
	   
	   @GetMapping("/{id}")
	   public Pickup getById(@PathVariable Integer id) {
		   return pickupservice.getById(id);
	   }
	   
	   @PutMapping("/{id}")
	   public Pickup update(@PathVariable int id, @RequestBody Pickup pickup) {
		   return pickupservice.update(id, pickup);
	   }
	   
	   @DeleteMapping("/{id}")
	   public String deleteById(@PathVariable int id) {
		   
		   return pickupservice.deleteById(id);
	   }
	   
}

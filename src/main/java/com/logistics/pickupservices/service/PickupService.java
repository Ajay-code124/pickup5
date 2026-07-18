package com.logistics.pickupservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.logistics.pickupservices.dto.ShipmentDto;
import com.logistics.pickupservices.model.Pickup;
import com.logistics.pickupservices.pickupdto.PickupDto;
import com.logistics.pickupservices.repository.PickupRepository;

@Service
public class PickupService {
	
	@Autowired
	private PickupRepository pickupRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public ShipmentDto save(Pickup pickup) {
		pickup.setStatus("PICKUP_CREATED");
	 Pickup savedPickup = pickupRepository.save(pickup);
	 PickupDto dto = new PickupDto();
	  dto.setPickupId(savedPickup.getPickupId());
	  dto.setCustomerName(savedPickup.getCustomerName());
	  dto.setAddress(savedPickup.getAddress());
	  dto.setPhone(savedPickup.getPhone());
	  dto.setProductName(savedPickup.getProductName());
	  dto.setQuantity(savedPickup.getQuantity());
	  
	  ShipmentDto shipment = restTemplate.postForObject("http://localhost:8097/shipment/create",dto,ShipmentDto.class);
		System.out.println("Shipment Created");
		System.out.println(shipment);
		
		return shipment;
	}
	
	public List<Pickup> getAllPickups(){
	return 	pickupRepository.findAll();
	}
	
	public Pickup getById(Integer id) {
		return pickupRepository.findById(id).orElse(null);
	}
	
	public Pickup update(Integer id, Pickup pickup) {
		
		Pickup updatedId = pickupRepository.findById(id).orElse(null);
		if(updatedId != null) {
			
			updatedId.setCustomerName(pickup.getCustomerName());
			updatedId.setAddress(pickup.getAddress());
			updatedId.setPhone(pickup.getAddress());
			updatedId.setProductName(pickup.getProductName());
			updatedId.setQuantity(pickup.getQuantity());
		}
		
		return null;
	}
	public String deleteById(Integer id) {
		pickupRepository.findById(id);
		return "Pickup request deleted successfully";
		
	}

}

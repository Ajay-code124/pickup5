package com.logistics.pickupservices.test;

import static org.mockito.Mockito.when;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.logistics.pickupservices.model.Pickup;
import com.logistics.pickupservices.repository.PickupRepository;
import com.logistics.pickupservices.service.PickupService;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Optional;

@ExtendWith(MockitoExtension.class) // Enables mockito support in junit 5
public class PickupServiceTest {
	@Mock //Creates a mock object instead of connecting to real data base
	private PickupRepository pickuprepository;
	
	@InjectMocks // creates the class under test (service object) and inject all mock dependencies automatically
	private PickupService pickupservice;
	
	@Test
	void testGetSuccess_byId() {
		Pickup p = new Pickup();
		p.setPickupId(1);
		p.setCustomerName("John");
		p.setAddress("Hyderabad");
		p.setPhone("9876543210");
		p.setProductName("Laptop");
		p.setQuantity(2);
		p.setStatus("PICKUP_CREATED");
		
		when(pickuprepository.findById(1)).thenReturn(Optional.of(p));
		
		Pickup result = pickupservice.getById(1);
		assertNotNull(result);
		assertEquals(1, result.getPickupId());
		assertEquals("John", result.getCustomerName());
		assertEquals("Hyderabad", result.getAddress());
		assertEquals("9876543210", result.getPhone());
		assertEquals("Laptop", result.getProductName());
		assertEquals(2, result.getQuantity());
		assertEquals("PICKUP_CREATED", result.getStatus());
		
		
	}
	

}

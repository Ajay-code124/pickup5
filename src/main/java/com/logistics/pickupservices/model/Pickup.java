package com.logistics.pickupservices.model;

import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.annotations.processing.Pattern;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pickup {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer pickupId;
	
	private String customerName;
	
	private String address;
	
	//@Pattern(regexp="^[0-9]{10}$", message="Phone number must be 10 digits")
	private String phone;
	
	private String productName;
	
//	/@NotNull(message = "Quantity is required")
	private Integer quantity;
	
	private String status;

	public Pickup() {
		super();
	}

	public Pickup(Integer pickupId, String customerName, String address, String phone, String productName,
			Integer quantity, String status) {
		super();
		this.pickupId = pickupId;
		this.customerName = customerName;
		this.address = address;
		this.phone = phone;
		this.productName = productName;
		this.quantity = quantity;
		this.status = status;
	}

	public Integer getPickupId() {
		return pickupId;
	}

	public void setPickupId(Integer pickupId) {
		this.pickupId = pickupId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "PickUp [pickupId=" + pickupId + ", customerName=" + customerName + ", address=" + address + ", phone="
				+ phone + ", productName=" + productName + ", quantity=" + quantity + ", status=" + status + "]";
	}
	
	
	
	
	
	
	
	
}

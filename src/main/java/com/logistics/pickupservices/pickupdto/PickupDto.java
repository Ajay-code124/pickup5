package com.logistics.pickupservices.pickupdto;

public class PickupDto {
	
	private Integer pickupId;
    private String customerName;
    private String address;
    private String phone;
    private String productName;
    private Integer quantity;
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
    
    

}

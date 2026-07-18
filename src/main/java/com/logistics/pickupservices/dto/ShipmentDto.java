package com.logistics.pickupservices.dto;

public class ShipmentDto {
	
	 private Integer shipmentId;
	    private Integer pickupId;
	    private String customerName;
	    private String productName;
	    private Integer quantity;
	    private String sourceAddress;
	    private String destinationAddress;
	    private String trackingId;
	    private String status;
	    
		public Integer getShipmentId() {
			return shipmentId;
		}
		public void setShipmentId(Integer shipmentId) {
			this.shipmentId = shipmentId;
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
		public String getSourceAddress() {
			return sourceAddress;
		}
		public void setSourceAddress(String sourceAddress) {
			this.sourceAddress = sourceAddress;
		}
		public String getDestinationAddress() {
			return destinationAddress;
		}
		public void setDestinationAddress(String destinationAddress) {
			this.destinationAddress = destinationAddress;
		}
		public String getTrackingId() {
			return trackingId;
		}
		public void setTrackingId(String trackingId) {
			this.trackingId = trackingId;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
	    
	    

}

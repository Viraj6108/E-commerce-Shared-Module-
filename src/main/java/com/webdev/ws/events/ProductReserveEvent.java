package com.webdev.ws.events;

import java.util.UUID;

public class ProductReserveEvent {

	
	private  UUID orderId;
	private UUID productId;
	private Integer quantity;
	private String productName;
	
	public ProductReserveEvent()
	{
		
	}
	public ProductReserveEvent(UUID orderId, UUID productId, Integer quantity, String productName) {
		super();
		this.orderId = orderId;
		this.productId = productId;
		this.quantity = quantity;
		this.productName = productName;
	}
	public UUID getOrderId() {
		return orderId;
	}
	public void setOrderId(UUID orderId) {
		this.orderId = orderId;
	}
	public UUID getProductId() {
		return productId;
	}
	public void setProductId(UUID productId) {
		this.productId = productId;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	
}

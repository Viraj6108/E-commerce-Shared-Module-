package com.webdev.ws.events;

import java.util.UUID;



public class OrderCreatedEvent {
	
	private  UUID orderId;
	private UUID productId;
	private Integer quantity;
	private String productName;
	private enum orderStatus{
		CREATED, ACCAPTED,FAILED
	}
	private orderStatus orderStatus;
	public OrderCreatedEvent(UUID orderId, UUID productId, Integer quantity,
			com.webdev.ws.events.OrderCreatedEvent.orderStatus orderStatus,
			String productName) {
		this.orderId = orderId;
		this.productId = productId;
		this.quantity = quantity;
		this.orderStatus = orderStatus;
		this.productName = productName;
	}
	public OrderCreatedEvent() {
		// TODO Auto-generated constructor stub
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
	public orderStatus getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(orderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	

	
}

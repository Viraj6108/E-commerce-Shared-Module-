package com.webdev.ws.events;

import java.util.UUID;

public class PaymentProcessEvent {

	
	private UUID productId;
	private UUID orderId;
	private Integer quantity;
	private double price;
	public PaymentProcessEvent(UUID productId, UUID orderId, Integer quantity, double price) {
		super();
		this.productId = productId;
		this.orderId = orderId;
		this.quantity = quantity;
		this.price = price;
	}
	public PaymentProcessEvent() {
		super();
	}
	public UUID getProductId() {
		return productId;
	}
	public void setProductId(UUID productId) {
		this.productId = productId;
	}
	public UUID getOrderId() {
		return orderId;
	}
	public void setOrderId(UUID orderId) {
		this.orderId = orderId;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}

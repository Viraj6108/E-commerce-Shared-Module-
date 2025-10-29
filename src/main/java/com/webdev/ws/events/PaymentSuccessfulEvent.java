package com.webdev.ws.events;

import java.util.UUID;

public class PaymentSuccessfulEvent {

	private UUID transactionId;
	private UUID orderId;
	private UUID productId;
	public PaymentSuccessfulEvent(UUID transactionId, UUID orderId, UUID productId) {
		super();
		this.transactionId = transactionId;
		this.orderId = orderId;
		this.productId = productId;
	}
	public PaymentSuccessfulEvent() {
		super();
	}
	public UUID getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(UUID transactionId) {
		this.transactionId = transactionId;
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
	
	
}

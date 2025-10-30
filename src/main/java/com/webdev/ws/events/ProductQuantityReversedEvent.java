package com.webdev.ws.events;

import java.util.UUID;

public class ProductQuantityReversedEvent {

	
	private UUID productId;
	private UUID orderId;
	private Integer quantity;
	
	public ProductQuantityReversedEvent()
	{
		
	}

	public ProductQuantityReversedEvent(UUID productId, UUID orderId, Integer quantity) {
		super();
		this.productId = productId;
		this.orderId = orderId;
		this.quantity = quantity;
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
	
	
}

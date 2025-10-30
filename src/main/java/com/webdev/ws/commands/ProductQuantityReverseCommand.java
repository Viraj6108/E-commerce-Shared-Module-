package com.webdev.ws.commands;

import java.util.UUID;

public class ProductQuantityReverseCommand {

	private UUID orderId;
	private Integer quantity;
	private UUID productId;
	public ProductQuantityReverseCommand(UUID orderId, Integer quantity, UUID productId) {
		super();
		this.orderId = orderId;
		this.quantity = quantity;
		this.productId = productId;
	}
	
	public ProductQuantityReverseCommand()
	{
		
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

	public UUID getProductId() {
		return productId;
	}

	public void setProductId(UUID productId) {
		this.productId = productId;
	}
	
	
}

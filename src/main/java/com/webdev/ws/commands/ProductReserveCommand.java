package com.webdev.ws.commands;

import java.util.UUID;

public class ProductReserveCommand {

	
	private UUID productId;
	 private Integer quantity;
	 private UUID orderId;
	 
	 
	 
	
	public ProductReserveCommand()
	{
		
	}
	public ProductReserveCommand(UUID productId,Integer quantity,UUID orderId)
	{
		this.productId = productId;
		this.quantity =quantity;
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
	public UUID getOrderId() {
		return orderId;
	}
	public void setOrderId(UUID orderId) {
		this.orderId = orderId;
	}



	
	
	
}

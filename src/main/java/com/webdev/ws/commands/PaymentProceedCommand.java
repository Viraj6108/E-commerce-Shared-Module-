package com.webdev.ws.commands;

import java.util.UUID;

public class PaymentProceedCommand {

	
	
	private UUID productId;
	private UUID orderId;
	private int quantity;
	private double price;
	
	
	public PaymentProceedCommand()
	{
		
	}
	

	public PaymentProceedCommand(UUID productId, UUID orderId, Integer quantity, double price) {
		super();
		this.productId = productId;
		this.orderId = orderId;
		this.quantity = quantity;
		this.price = price;
	}


	public UUID getOrderId() {
		return orderId;
	}

	public void setOrderId(UUID orderId) {
		this.orderId = orderId;
	}
	

	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public UUID getProductId() {
		return productId;
	}

	public void setProductId(UUID productId) {
		this.productId = productId;
	}
	
	
}

package com.webdev.ws.events;

import java.util.UUID;


public class ProductCreatedEvent {

	private UUID productId;
	private String productName;
	private double price;
	private Integer quantity;
	public ProductCreatedEvent(UUID productId, String productName, double price, Integer quantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	public ProductCreatedEvent() {
		super();
	}
	public UUID getProductId() {
		return productId;
	}
	public void setProductId(UUID productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	
}

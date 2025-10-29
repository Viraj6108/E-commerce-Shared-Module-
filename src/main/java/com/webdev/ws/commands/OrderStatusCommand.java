package com.webdev.ws.commands;

import java.util.UUID;

public class OrderStatusCommand {

	private UUID orderId;
	private UUID transactionId;
	
	public OrderStatusCommand(UUID orderId,UUID transactionId)
	{
		this.orderId = orderId;
		this.transactionId= transactionId;
	}

	public UUID getOrderId() {
		return orderId;
	}

	public void setOrderId(UUID orderId) {
		this.orderId = orderId;
	}

	public UUID getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(UUID transactionId) {
		this.transactionId = transactionId;
	}
	
}

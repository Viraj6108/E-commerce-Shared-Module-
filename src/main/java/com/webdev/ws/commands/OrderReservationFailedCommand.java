package com.webdev.ws.commands;

import java.util.UUID;

public class OrderReservationFailedCommand {

	private UUID orderId;

	public OrderReservationFailedCommand() {
		super();
	}

	public OrderReservationFailedCommand(UUID orderId) {
		super();
		this.orderId = orderId;
	}

	public UUID getOrderId() {
		return orderId;
	}

	public void setOrderId(UUID orderId) {
		this.orderId = orderId;
	}
	
	
}

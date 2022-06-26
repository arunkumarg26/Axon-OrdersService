package com.omnicell.example.axon.OrdersService.core.events;

import com.omnicell.example.axon.OrdersService.core.model.OrderStatus;

import lombok.Value;

@Value
public class OrderApprovedEvent {

	private final String orderId;
	private final OrderStatus orderStatus = OrderStatus.APPROVED;
	
}

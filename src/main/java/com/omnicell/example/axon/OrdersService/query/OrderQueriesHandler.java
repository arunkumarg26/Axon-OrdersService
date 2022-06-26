package com.omnicell.example.axon.OrdersService.query;

import org.axonframework.queryhandling.QueryHandler;
import org.springframework.stereotype.Component;

import com.omnicell.example.axon.OrdersService.core.data.OrderEntity;
import com.omnicell.example.axon.OrdersService.core.data.OrdersRepository;
import com.omnicell.example.axon.OrdersService.core.model.OrderSummary;

@Component
public class OrderQueriesHandler {

	OrdersRepository ordersRepository;

	public OrderQueriesHandler(OrdersRepository ordersRepository) {
		this.ordersRepository = ordersRepository;
	}

	@QueryHandler
	public OrderSummary findOrder(FindOrderQuery findOrderQuery) {
		OrderEntity orderEntity = ordersRepository.findByOrderId(findOrderQuery.getOrderId());
		return new OrderSummary(orderEntity.getOrderId(), 
				orderEntity.getOrderStatus(), "");
	}

}

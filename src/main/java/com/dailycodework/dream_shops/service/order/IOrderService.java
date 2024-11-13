package com.dailycodework.dream_shops.service.order;

import com.dailycodework.dream_shops.dto.OrderDto;
import com.dailycodework.dream_shops.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);

    List<OrderDto> getUserOrders(Long userId);

    OrderDto getOrder(Long orderId);

    OrderDto convertToDto(Order order);
}

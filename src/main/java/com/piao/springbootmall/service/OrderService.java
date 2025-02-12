package com.piao.springbootmall.service;

import com.piao.springbootmall.dto.CreateOrderRequest;
import com.piao.springbootmall.dto.OrderQueryParams;
import com.piao.springbootmall.model.Order;

import java.util.List;

public interface OrderService {
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
    Order getOrderById(Integer orderId);
    List<Order> getOrders(OrderQueryParams orderQueryParams);
    Integer countOrder(OrderQueryParams orderQueryParams);
}

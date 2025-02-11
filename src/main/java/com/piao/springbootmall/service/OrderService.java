package com.piao.springbootmall.service;

import com.piao.springbootmall.dto.CreateOrderRequest;
import com.piao.springbootmall.model.Order;

public interface OrderService {

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
    Order getOrderById(Integer orderId);
}

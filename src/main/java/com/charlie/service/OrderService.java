package com.charlie.service;

import com.charlie.entity.LoginEntity;
import com.charlie.entity.OrderEntity;
import com.charlie.entity.OrderIn;

public interface OrderService {
    OrderEntity get(OrderIn orderIn);
}

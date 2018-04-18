package com.raintea.service;

import com.raintea.entity.OrderEntity;
import com.raintea.entity.OrderIn;

public interface OrderService {
    OrderEntity get(OrderIn orderIn);
}

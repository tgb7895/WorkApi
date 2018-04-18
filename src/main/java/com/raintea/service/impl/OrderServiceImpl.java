package com.raintea.service.impl;


import com.raintea.dao.mapper.OrderMapper;
import com.raintea.entity.OrderEntity;
import com.raintea.entity.OrderIn;
import com.raintea.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;


    public OrderEntity get(OrderIn orderIn) {

        return orderMapper.get(orderIn);
    }
}

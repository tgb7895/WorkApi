package com.charlie.service.impl;


import com.charlie.dao.mapper.OrderMapper;
import com.charlie.entity.OrderEntity;
import com.charlie.entity.OrderIn;
import com.charlie.service.OrderService;
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

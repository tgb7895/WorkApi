package com.raintea.controller;

import com.raintea.entity.OrderEntity;
import com.raintea.entity.OrderIn;
import com.raintea.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/WorkerApi/Order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @ResponseBody
    @RequestMapping("/getOrder")
    public OrderEntity getOrder(@RequestParam(value = "community_id") String comid,
                                @RequestParam(value = "worker_id") String workerId){
        OrderIn orderIn = new OrderIn(comid,workerId);
        OrderEntity orderEntity = orderService.get(orderIn);

        return orderEntity;
    }
}

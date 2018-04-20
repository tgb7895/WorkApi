package com.raintea.controller;

import com.alibaba.fastjson.JSON;
import com.raintea.entity.GetUndistributedOrder;
import com.raintea.entity.GetUndistributedOrderData;
import com.raintea.entity.GetUndistributedOrderInput;
import com.raintea.service.GetUndistributedOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/WorkerApi/Order")
public class GetUndistributedOrderController {



    @Autowired
    GetUndistributedOrderService getUndistributedOrderService;

    @ResponseBody
    @RequestMapping("/getUndistributedOrder")
    public GetUndistributedOrder getData(@RequestParam(value = "community_id") String community_id,
                                             @RequestParam(value = "worker_id") int worker_id){
        GetUndistributedOrderInput input=new GetUndistributedOrderInput();
        input.setWorker_id(worker_id);
        GetUndistributedOrder getUndistributedOrder=new GetUndistributedOrder();

        List<GetUndistributedOrderData> list=new ArrayList<GetUndistributedOrderData>();
        List<String> strings = JSON.parseArray(community_id, String.class);

        getUndistributedOrder.setData(list);
        getUndistributedOrder.setErrorMsg("成功");
        getUndistributedOrder.setErrorCode("");
        getUndistributedOrder.setReturnCode("0001");

        for (String string:strings){
            input.setCommunity_id(Integer.valueOf(string));
            GetUndistributedOrderData gt= getUndistributedOrderService.getData(input);
            if (gt==null){
                getUndistributedOrder.setErrorCode("0000");
                getUndistributedOrder.setErrorMsg("错误");
                getUndistributedOrder.setReturnCode("0000");
            }
            list.add(gt);
        }


        return getUndistributedOrder;


    }


}

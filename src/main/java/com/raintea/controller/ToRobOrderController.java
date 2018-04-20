package com.raintea.controller;

import com.raintea.entity.ToRobOrder;
import com.raintea.entity.ToRobOrderData;
import com.raintea.entity.ToRobOrderIn;
import com.raintea.service.ToRobOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/WorkerApi/Order")
public class ToRobOrderController {

    @Autowired
    ToRobOrderService toRobOrderService;


    @ResponseBody
    @RequestMapping("/toRobOrder")
    public ToRobOrder toRobOrder(@RequestParam(value = "order_id") int order_id,
                                 @RequestParam(value = "worker_id") int worker_id){

        ToRobOrderIn toRobOrderIn=new ToRobOrderIn();
        toRobOrderIn.setOrder_id(order_id);
        toRobOrderIn.setWorker_id(worker_id);

        ToRobOrder toRobOrder=new ToRobOrder();
        ToRobOrderData toRobOrderData=new ToRobOrderData();

        int i = toRobOrderService.get(toRobOrderIn);

        if (i==0){
            toRobOrderData.setSuccess(0);
            toRobOrder.setErrorCode("0000");
            toRobOrder.setErrorMsg("失败");
            toRobOrder.setReturnCode("");
        }else {
            toRobOrderData.setSuccess(1);
            toRobOrder.setErrorCode("0001");
            toRobOrder.setErrorMsg("成功");
            toRobOrder.setReturnCode("");
        }
        toRobOrder.setData(toRobOrderData);
        return toRobOrder;
    }


}

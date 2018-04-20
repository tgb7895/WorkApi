package com.raintea.service.impl;

import com.raintea.dao.mapper.GetUndistributedOrderMapper;
import com.raintea.entity.GetUndistributedOrderData;
import com.raintea.entity.GetUndistributedOrderInput;
import com.raintea.service.GetUndistributedOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetUndistributedOrderImpl implements GetUndistributedOrderService {

    @Autowired
    GetUndistributedOrderMapper getUndistributedOrderMapper;

    public GetUndistributedOrderData getData(GetUndistributedOrderInput in) {
        return getUndistributedOrderMapper.getData(in);
    }
}

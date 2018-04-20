package com.raintea.service.impl;

import com.raintea.dao.mapper.ToRobOrderMapper;
import com.raintea.entity.ToRobOrderIn;
import com.raintea.service.ToRobOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToRobOrderServiceImpl implements ToRobOrderService {

    @Autowired
    ToRobOrderMapper toRobOrderMapper;

    public int get(ToRobOrderIn toRobOrderIn) {
        return toRobOrderMapper.get(toRobOrderIn);
    }
}

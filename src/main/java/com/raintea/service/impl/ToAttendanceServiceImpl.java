package com.raintea.service.impl;

import com.raintea.dao.mapper.ToAttenddanceMapper;
import com.raintea.entity.ToAttendanceData;
import com.raintea.entity.ToAttendanceIn;
import com.raintea.service.ToAttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToAttendanceServiceImpl implements ToAttendanceService{

    @Autowired
    private ToAttenddanceMapper toAttenddanceMapper;


    public boolean insertAll(ToAttendanceIn toAttendanceIn) {
        return toAttenddanceMapper.insertAll(toAttendanceIn);
    }

    public ToAttendanceData selectAll(Integer id) {
        return toAttenddanceMapper.selectAll(id);
    }
}

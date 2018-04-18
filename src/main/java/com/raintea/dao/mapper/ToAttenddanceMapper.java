package com.raintea.dao.mapper;

import com.raintea.entity.ToAttendanceData;
import com.raintea.entity.ToAttendanceIn;

public interface ToAttenddanceMapper {
    boolean insertAll(ToAttendanceIn toAttendanceIn);
    ToAttendanceData selectAll(Integer id);
}

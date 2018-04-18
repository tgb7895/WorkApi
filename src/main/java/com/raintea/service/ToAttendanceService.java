package com.raintea.service;

import com.raintea.entity.ToAttendanceData;
import com.raintea.entity.ToAttendanceIn;

public interface ToAttendanceService {
    boolean insertAll(ToAttendanceIn toAttendanceIn);
    ToAttendanceData selectAll(Integer id);
}

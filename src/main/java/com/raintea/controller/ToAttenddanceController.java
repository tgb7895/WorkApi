package com.raintea.controller;


import com.raintea.entity.ToAttendance;
import com.raintea.entity.ToAttendanceData;
import com.raintea.entity.ToAttendanceIn;
import com.raintea.service.ToAttendanceService;
import com.sun.org.glassfish.gmbal.ParameterNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/WorkerApi/Attendance")
public class ToAttenddanceController {

    @Autowired
    private ToAttendanceService toAttendanceService;

    @ResponseBody
    @RequestMapping("/toAttendance")
    public ToAttendance getToAttenddance(@RequestParam(value = "worker_id") int worker_id,
                                         @RequestParam(value = "x") String x,
                                         @RequestParam(value = "y") String y,
                                         @RequestParam(value = "flag") int flag,
                                         @RequestParam(value = "date") String date){

        ToAttendanceIn toAttendanceIn=
                new ToAttendanceIn(worker_id,x,y,flag,date);

       boolean b = toAttendanceService.insertAll(toAttendanceIn);

       ToAttendanceData toAttendanceData = toAttendanceService.selectAll(worker_id);

        ToAttendance toAttendance = new ToAttendance();

        if (flag==1){
            toAttendance.setToAttendanceData(toAttendanceData);
        }
        if (b) {
            toAttendance.setErrorCode("0001");
            toAttendance.setErrorMsg("成功");
            toAttendance.setReturnCode("");
        }else{
            toAttendance.setErrorCode("0000");
            toAttendance.setErrorMsg("失败");
            toAttendance.setReturnCode("0000");
        }
        return toAttendance;
    }

}

package com.raintea.controller;


import com.raintea.entity.LoginEntity;
import com.raintea.entity.LoginInput;
import com.raintea.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/WorkerApi/User")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @ResponseBody
    @RequestMapping(value = "/login")
    public LoginEntity Login(@RequestParam(value = "password") String password,
                             @RequestParam(value = "phonenum") String phone){
        LoginInput loginInput=new LoginInput();
        loginInput.setPassword(password);
        loginInput.setPhone(phone);
        LoginEntity loginEntity=loginService.get(loginInput);
        return loginEntity;
    }
}

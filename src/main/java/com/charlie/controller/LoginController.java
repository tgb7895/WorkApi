package com.charlie.controller;


import com.charlie.entity.LoginEntity;
import com.charlie.entity.LoginInput;
import com.charlie.service.LoginService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.InputStream;

@Controller
@RequestMapping("/WorkerApi/User")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @ResponseBody
    @RequestMapping(value = "/login")
    public LoginEntity Login(){
        LoginInput loginInput=new LoginInput();
        loginInput.setPassword("admin");
        loginInput.setPhone("1565435434");
        LoginEntity loginEntity=loginService.get(loginInput);
        return loginEntity;
    }
}

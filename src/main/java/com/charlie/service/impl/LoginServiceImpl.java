package com.charlie.service.impl;

import com.charlie.dao.mapper.LoginMapper;
import com.charlie.entity.LoginEntity;
import com.charlie.entity.LoginInput;
import com.charlie.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginMapper loginMapper;

    public LoginEntity get(LoginInput loginInput) {

        return loginMapper.get(loginInput);

    }
}

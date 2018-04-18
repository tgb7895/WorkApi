package com.raintea.service.impl;

import com.raintea.dao.mapper.LoginMapper;
import com.raintea.entity.LoginEntity;
import com.raintea.entity.LoginInput;
import com.raintea.service.LoginService;
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

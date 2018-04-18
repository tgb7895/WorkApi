package com.raintea.service;

import com.raintea.entity.LoginEntity;
import com.raintea.entity.LoginInput;

public interface LoginService {
    LoginEntity get(LoginInput loginInput);
}

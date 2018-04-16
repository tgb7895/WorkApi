package com.charlie.service;

import com.charlie.entity.LoginEntity;
import com.charlie.entity.LoginInput;

public interface LoginService {
    LoginEntity get(LoginInput loginInput);
}

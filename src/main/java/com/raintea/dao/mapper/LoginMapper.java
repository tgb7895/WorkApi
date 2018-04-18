package com.raintea.dao.mapper;

import com.raintea.entity.LoginEntity;
import com.raintea.entity.LoginInput;

public interface LoginMapper {
    LoginEntity get(LoginInput loginInput);
}

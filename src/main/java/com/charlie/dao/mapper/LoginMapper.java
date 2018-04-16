package com.charlie.dao.mapper;

import com.charlie.entity.LoginEntity;
import com.charlie.entity.LoginInput;

import java.util.List;

public interface LoginMapper {
    LoginEntity get(LoginInput loginInput);
}

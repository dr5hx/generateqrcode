package com.dr5hx.generateqrcode.repository;

import com.dr5hx.generateqrcode.entity.UserLoginLog;

public interface UserLoginLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserLoginLog record);

    int insertSelective(UserLoginLog record);

    UserLoginLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserLoginLog record);

    int updateByPrimaryKey(UserLoginLog record);
}
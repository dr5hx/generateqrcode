package com.dr5hx.generateqrcode.dao;

import com.dr5hx.generateqrcode.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Long> {
}

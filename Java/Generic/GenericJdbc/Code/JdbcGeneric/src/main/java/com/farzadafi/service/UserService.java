package com.farzadafi.service;

import com.farzadafi.base.service.BaseService;
import com.farzadafi.model.User;

public interface UserService extends BaseService<Integer, User> {

    User findByUsename(String username);
}

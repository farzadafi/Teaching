package com.farzadafi.util;

import com.farzadafi.config.DBConfig;
import com.farzadafi.repository.UserRepository;
import com.farzadafi.repository.impel.UserRepositoryImpel;
import com.farzadafi.service.UserService;
import com.farzadafi.service.impel.UserServiceImpel;

import java.sql.Connection;

public class ApplicationContext {

    private static final Connection connection;
    private static final UserRepository userRepository;
    private static final UserService userService;

    static {
        connection = DBConfig.getConnection();
        userRepository = new UserRepositoryImpel(connection);
        userService = new UserServiceImpel(userRepository);
    }

    public static UserService getUserServiceImpel() {
        return userService;
    }
}

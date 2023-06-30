package com.farzadafi.service.impel;

import com.farzadafi.base.service.impel.BaseServiceImpl;
import com.farzadafi.model.User;
import com.farzadafi.repository.UserRepository;
import com.farzadafi.service.UserService;

public class UserServiceImpel extends BaseServiceImpl<Integer, User, UserRepository>
        implements UserService {

    public UserServiceImpel(UserRepository repository) {
        super(repository);
    }

    @Override
    public User findByUsename(String username) {
        return null;
    }
}

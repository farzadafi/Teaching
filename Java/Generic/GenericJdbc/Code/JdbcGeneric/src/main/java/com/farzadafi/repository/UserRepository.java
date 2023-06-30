package com.farzadafi.repository;

import com.farzadafi.base.repository.BaseRepository;
import com.farzadafi.model.User;

import java.sql.SQLException;

public interface UserRepository extends BaseRepository<Integer, User> {

    User findByUsername(String username) throws SQLException;
}

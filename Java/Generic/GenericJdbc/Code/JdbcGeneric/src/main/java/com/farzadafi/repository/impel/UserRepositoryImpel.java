package com.farzadafi.repository.impel;

import com.farzadafi.base.repository.impel.BaseRepositoryImpl;
import com.farzadafi.model.User;
import com.farzadafi.repository.UserRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static com.farzadafi.config.DBConfig.getConnection;

public class UserRepositoryImpel
        extends BaseRepositoryImpl<Integer, User>
        implements UserRepository {

    public UserRepositoryImpel(Connection connection) {
        super(connection);
    }

    @Override
    public User findByUsername(String username) throws SQLException {
        String sql = "SELECT * FROM " + getTableName() + " WHERE username = ?";
        try (PreparedStatement preparedStatement = getConnection().prepareStatement(sql)) {
            preparedStatement.setString(1, username);
            ResultSet foundUser = preparedStatement.executeQuery();
            if (foundUser.next())
                return mapResultSetToEntity(foundUser);
        }
        return null;
    }

    @Override
    public String getTableName() {
        return "users";
    }

    @Override
    public String getColumnsName() {
        return "(firstname, lastname, username, password)";
    }

    @Override
    public String getCountOfQuestionMarkForParams() {
        return "(?, ?, ?, ?)";
    }

    @Override
    public String getUpdateQueryParams() {
        return "firstname=? , lastname=? , username=? , password=?";
    }


    @Override
    public void fillParamForStatement(PreparedStatement preparedStatement,
                                      User entity,
                                      boolean isCart) throws SQLException {
        preparedStatement.setString(1, entity.getFirstname());
        preparedStatement.setString(2, entity.getLastname());
        preparedStatement.setString(3, entity.getUsername());
        preparedStatement.setString(4, entity.getPassword());
    }

    @Override
    public User mapResultSetToEntity(ResultSet resultSet) throws SQLException {
        User customer = new User(resultSet.getInt(1),
                resultSet.getString(2),
                resultSet.getString(3),
                resultSet.getString(4),
                resultSet.getString(5));
        customer.setId(resultSet.getInt(1));
        return customer;
    }
}

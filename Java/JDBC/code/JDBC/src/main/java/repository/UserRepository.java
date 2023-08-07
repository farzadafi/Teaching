package repository;

import connection.JdbcConnection;
import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRepository {
    private final Connection connection;

    public UserRepository(Connection connection) {
        this.connection = connection;
    }

    public int save(User user) throws SQLException {
        String add = " INSERT INTO UserTable(fullname,nationalId,password) VALUES (?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(add);
        preparedStatement.setString(1, user.getFirstname());
        preparedStatement.setString(2, user.getLastname());
        preparedStatement.setString(3, user.getUsername());
        preparedStatement.setString(4, user.getPassword());
        return preparedStatement.executeUpdate();
    }

    public User login(String username) throws SQLException {
        String login = "SELECT * FROM UserTable WHERE username = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(login);
        preparedStatement.setString(1, username);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            return new User
                    (resultSet.getInt("id"),
                            resultSet.getString("firstname"),
                            resultSet.getString("lastname"),
                            username,
                            resultSet.getString("password"));
        }
        return null;
    }
}

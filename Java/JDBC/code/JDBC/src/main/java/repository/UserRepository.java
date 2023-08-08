package repository;

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
        String add = " INSERT INTO users(firstname,lastname, username,password) VALUES (?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(add);
        preparedStatement.setString(1, user.getFirstname());
        preparedStatement.setString(2, user.getLastname());
        preparedStatement.setString(3, user.getUsername());
        preparedStatement.setString(4, user.getPassword());
        return preparedStatement.executeUpdate();
    }

    public User login(String username) throws SQLException {
        String login = "SELECT * FROM users WHERE username = ?";
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

    public int updateFirstname(User user) throws SQLException {
        String login = "UPDATE users SET firstname = ? WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(login);
        preparedStatement.setString(1, user.getFirstname());
        preparedStatement.setInt(2, user.getId());
        return preparedStatement.executeUpdate();
    }

    public int delete(int id) throws SQLException {
        String login = "DELETE FROM users WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(login);
        preparedStatement.setInt(1, id);
        return preparedStatement.executeUpdate();
    }
}

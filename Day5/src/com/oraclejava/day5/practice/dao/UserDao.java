package com.oraclejava.day5.practice.dao;

import com.oraclejava.day5.practice.vo.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    public List<User> findAll() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String query = "SELECT * FROM user";
        List<User> users = new ArrayList<>();

        try {
            Class.forName("org.mariadb.jdbc.Driver");

            connection = DriverManager.getConnection(
                    "jdbc:mariadb://localhost:3306/web",
                    "oraclejava",
                    "oraclejava"
            );
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                User user = new User();

                user.setNo(resultSet.getInt("no"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                user.setNickname(resultSet.getString("nickname"));
                user.setEmail(resultSet.getString("email"));
                user.setStatus(resultSet.getString("status"));
                user.setCreatedAt(resultSet.getDate("created_at"));
                user.setUpdatedAt(resultSet.getDate("updated_at"));

                users.add(user);
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return users;
    }
}

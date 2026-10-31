package com.oraclejava.day5.practice.dao;

import com.oraclejava.day5.practice.vo.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    public List<User> findAll() {
        Connection connection = null;
        List<User> users = new ArrayList<>();

        try {
            Class.forName("org.mariadb.jdbc.Driver");

            connection = DriverManager.getConnection(
                    "jdbc:mariadb://localhost:3306/web",
                    "oraclejava",
                    "oraclejava"
            );

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return users;
    }
}

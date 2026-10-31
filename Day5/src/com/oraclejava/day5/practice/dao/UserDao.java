package com.oraclejava.day5.practice.dao;

import com.oraclejava.day5.practice.vo.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
        } finally {
            try {
                resultSet.close();
                statement.close();
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        return users;
    }

    public User findByNo(int no) {
        User user = null;
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String query = "SELECT * FROM user WHERE no = ?";

        try {
            Class.forName("org.mariadb.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/web", "oraclejava", "oraclejava");
            pstmt = connection.prepareStatement(query);

            pstmt.setInt(1, no);

            rs = pstmt.executeQuery();

            if (rs.next()) {
                user = new User();

                user.setNo(rs.getInt("no"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setNickname(rs.getString("nickname"));
                user.setEmail(rs.getString("email"));
                user.setStatus(rs.getString("status"));
                user.setCreatedAt(rs.getDate("created_at"));
                user.setUpdatedAt(rs.getDate("updated_at"));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                pstmt.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return user;
    }

    public int insert(User user) {
        int result = 0;
        Connection connection = null;
        PreparedStatement pstmt = null;
        String query = "INSERT INTO user (username, password, nickname, email) VALUES(?, ?, ?, ?)";

        try {
            Class.forName("org.mariadb.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/web", "oraclejava", "oraclejava");
            pstmt = connection.prepareStatement(query);

            pstmt.setString(1, user.getUsername());
            pstmt.setString(2, user.getPassword());
            pstmt.setString(3, user.getNickname());
            pstmt.setString(4, user.getEmail());

            result = pstmt.executeUpdate();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                pstmt.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return result;
    }

    public int update(User user) {
        int result = 0;
        Connection connection = null;
        PreparedStatement pstmt = null;
        String query = "UPDATE user " +
                "SET nickname = ?, email = ? WHERE no = ?";

        try {
            Class.forName("org.mariadb.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/web", "oraclejava", "oraclejava");
            pstmt = connection.prepareStatement(query);

            pstmt.setString(1, user.getNickname());
            pstmt.setString(2, user.getEmail());
            pstmt.setInt(3, user.getNo());

            result = pstmt.executeUpdate();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                pstmt.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return result;
    }

    public int delete(int no) {
        int result = 0;
        Connection connection = null;
        PreparedStatement pstmt = null;
        String query = "DELETE FROM user WHERE no = ?";

        try {
            Class.forName("org.mariadb.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/web", "oraclejava", "oraclejava");
            pstmt = connection.prepareStatement(query);

            pstmt.setInt(1, no);

            result = pstmt.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                pstmt.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return result;
    }

}

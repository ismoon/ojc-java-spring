package com.oraclejava.day5.practice;


import com.oraclejava.day5.practice.dao.UserDao;
import com.oraclejava.day5.practice.vo.User;

import java.util.List;

public class C_JDBC {
    public void practice1() {
        UserDao dao = new UserDao();

        List<User> users = dao.findAll();

        for (User user : users) {
            System.out.println(user);
        }

        System.out.println();

        User user = dao.findByNo(3);

        System.out.println(user);
        System.out.println();
    }

    public void practice2() {
        UserDao dao = new UserDao();
        User insertUser = new User();

        insertUser.setUsername("kim123");
        insertUser.setPassword("1234");
        insertUser.setNickname("김신");
        insertUser.setEmail("john@example.com");

        int result = dao.insert(insertUser);

        System.out.println("Result : " + result);
        System.out.println();
    }
}

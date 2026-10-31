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
    }
}

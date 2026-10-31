package com.oraclejava.day5.practice;


import com.oraclejava.day5.practice.dao.UserDao;
import com.oraclejava.day5.practice.vo.User;

import java.util.List;

public class C_JDBC {
    public void practice1() {
        UserDao dao = new UserDao();

        List<User> users = dao.findAll();

        System.out.println(users);
        System.out.println();
    }
}

package com.oraclejava.day5.practice.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class User {
    private int no;

    private String username;

    private String password;

    private String nickname;

    private String email;

    private String status;

    private Date createdAt;

    private Date updatedAt;
}

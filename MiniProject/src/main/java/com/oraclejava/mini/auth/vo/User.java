package com.oraclejava.mini.auth.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int no;

    private String username;

    private String password;

    private String role;

    private String nickname;

    private String email;

    private String status;

    private LocalDate createdAt;

    private LocalDate updatedAt;
}

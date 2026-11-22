package com.oraclejava.mini.auth.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements UserDetails {
    private int no;

    private String username;

    private String password;

    private String role;

    private String nickname;

    private String email;

    private String status;

    private LocalDate createdAt;

    private LocalDate updatedAt;

    // 사용자가 가지고 있는 권한의 목록을 반환한다.
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();

        authorities.add(new SimpleGrantedAuthority(role));

        return authorities;
    }

    // 사용자를 식별할 수 있는 사용자의 이름을 반환한다.
    @Override
    public String getUsername() {
        return this.username;
    }

    // 사용자의 비밀번호를 반환한다.
    @Override
    public String getPassword() {
        return this.password;
    }

    // 계정 만료 여부
    @Override
    public boolean isAccountNonExpired() {

        return true;
    }

    // 계정 잠김 여부
    @Override
    public boolean isAccountNonLocked() {

        return true;
    }

    // 패스워드 만료 여부
    @Override
    public boolean isCredentialsNonExpired() {

        return true;
    }

    // 계정 활성화 여부
    @Override
    public boolean isEnabled() {

        return this.status.equals("Y");
    }
}

package com.oraclejava.mini.auth.service;

import com.oraclejava.mini.auth.mapper.AuthMapper;
import com.oraclejava.mini.auth.vo.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {
    private final AuthMapper authMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = authMapper.selectUserByUsername(username);

        if (user == null) {
            throw new UsernameNotFoundException(
                    String.format("%s not found",  username)
            );
        }

        return user;
    }
}

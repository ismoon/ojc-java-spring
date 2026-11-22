package com.oraclejava.mini.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    // 1. SecurityFilterChain 설정
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) {
        // CSRF(Cross-Site Request Forgery)
        //   - 공격자가 사용자의 브라우저를 악용하여 인증된 세션을 가진 사용자의 권한으로 악의적인 요청을 보내는 공격이다.
        //   - 스프링 시큐리티는 기본적으로 CSRF 보호 기능을 활성화하며 GET 요청을 제외한 요청에 대해 CSRF 토큰을 검증한다.
        http
                // CSRF 기본 설정 활성화
                .csrf(Customizer.withDefaults())
                // HTTP 인증 활성화
                .httpBasic(Customizer.withDefaults())
                // 폼 로그인 활성화
                .formLogin(Customizer.withDefaults())
                // 접근 제어 설정
                .authorizeHttpRequests(requests ->
                        requests.anyRequest().authenticated()
                );

        return http.build();
    }

    // 2. UserDetailsService 설정 (인 메모리 방식)
    @Bean
    public UserDetailsService userDetailsService(BCryptPasswordEncoder passwordEncoder) {
        UserDetails user = User.builder()
                .username("user")
                .password(passwordEncoder.encode("1234"))
                .roles("USER")
                .build();

        UserDetails admin = User.builder()
                .username("admin")
                .password(passwordEncoder.encode("5678"))
                .roles("USER", "ADMIN")
                .build();

        return new InMemoryUserDetailsManager(user, admin);
    }

    // 3. PasswordEncoder 설정 (BCrypt 적용)
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}

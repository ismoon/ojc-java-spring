package com.oraclejava.mini.config;

import com.oraclejava.mini.auth.handler.AuthenticationFailureHandlerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    // 1. SecurityFilterChain 설정
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http,
                   AuthenticationFailureHandler authenticationFailureHandler) {
        // CSRF(Cross-Site Request Forgery)
        //   - 공격자가 사용자의 브라우저를 악용하여 인증된 세션을 가진 사용자의 권한으로 악의적인 요청을 보내는 공격이다.
        //   - 스프링 시큐리티는 기본적으로 CSRF 보호 기능을 활성화하며 GET 요청을 제외한 요청에 대해 CSRF 토큰을 검증한다.
        http
                // CSRF 기본 설정 활성화
                .csrf(Customizer.withDefaults())
                // HTTP 인증 활성화
                .httpBasic(Customizer.withDefaults())
                // 폼 로그인 활성화
                .formLogin(formLogin ->
                        formLogin
                                .loginPage("/login")
                                .failureHandler(authenticationFailureHandler)
                )
                // 로그아웃 설정
                .logout(logout ->
                        logout
                                .logoutUrl("/logout")
                                .logoutSuccessUrl("/login?logout")
                                .invalidateHttpSession(true)
                                .deleteCookies("JSESSIONID")
                )
                // 기억하기 기능
                .rememberMe(rememberMe ->
                        rememberMe
                                .key("oraclejava") // 토큰 생성 시 서명에 사용되는 키 설정
                                .tokenValiditySeconds(1209600) // 쿠키의 유효시간을 지정(초)
                )
                // 세션 관리 기능
                // 로그인 세션 1개만 유지
                .sessionManagement(sessionManagement ->
                        sessionManagement
                                .invalidSessionUrl("/login?invalid") // 세션이 만료되었을 때 이동할 경로
                                .maximumSessions(1) // 최대 세션의 수
                                .expiredUrl("/login?expired") // 마지막 연결된 세션이 끊겼을 때 이동할 경로
                )
                // 에러 핸들러 설정
                .exceptionHandling(exceptionHandling ->
                        // 권한이 없는 계정에서 잘못된 접근 시 이동할 URL을 지정한다.
                        exceptionHandling
                                .accessDeniedHandler((request, response, exception) -> {
                                    response.sendRedirect(request.getContextPath() + "/access-denied");
                                })
                )
                // 접근 제어 설정
                .authorizeHttpRequests(requests ->
                        requests
                                // 정적 리소스 허용
                                .requestMatchers("/js/**", "/css/**", "/images/**").permitAll()
                                .requestMatchers("/login").permitAll()
                                .requestMatchers(HttpMethod.POST, "/todos/*/delete").hasRole("ADMIN")
                                .anyRequest().authenticated()
                );

        return http.build();
    }

    // 2. UserDetailsService 설정 (인 메모리 방식)
    //    @Bean
    //    public UserDetailsService userDetailsService(BCryptPasswordEncoder passwordEncoder) {
    //        UserDetails user = User.builder()
    //                .username("user")
    //                .password(passwordEncoder.encode("1234"))
    //                .roles("USER")
    //                .build();
    //
    //        UserDetails admin = User.builder()
    //                .username("admin")
    //                .password(passwordEncoder.encode("5678"))
    //                .roles("USER", "ADMIN")
    //                .build();
    //
    //        return new InMemoryUserDetailsManager(user, admin);
    //    }

    // 3. PasswordEncoder 설정 (BCrypt 적용)
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    // AuthenticationFailureHandler 생성
    @Bean
    public AuthenticationFailureHandler authenticationFailureHandler() {

        return new AuthenticationFailureHandlerImpl();
    }
}

package com.oraclejava.day7.owner;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@ToString
@Component
public class Owner {
    @Value("홍길동")
    private String name;

    @Value("24")
    private int age;
}
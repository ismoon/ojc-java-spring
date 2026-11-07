package com.oraclejava.day7.owner;

import com.oraclejava.day7.pet.Pet;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@ToString
@Component
public class Owner {
    @Value("홍길동")
    private String name;

    @Value("24")
    private int age;

    @Autowired
    @Qualifier("kitty")
    private Pet pet;
}
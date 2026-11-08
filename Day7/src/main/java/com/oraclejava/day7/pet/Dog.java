package com.oraclejava.day7.pet;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Dog extends Pet {
    public Dog(@Value("${pet.dog.name}") String name) {
        super(name);
    }

    @Override
    public void makeSound() {
//        if (true) {
//            throw new RuntimeException("에러 발생");
//        }

        System.out.println("멍멍~");
    }

    @Override
    public String toString() {
        return "Dog(" +
                "name='" + name + '\'' +
                ')';
    }
}

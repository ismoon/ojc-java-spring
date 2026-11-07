package com.oraclejava.day7.pet;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Dog extends Pet {
    public Dog(@Value("멍멍이") String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("멍멍~");
    }

    @Override
    public String toString() {
        return "Dog(" +
                "name='" + name + '\'' +
                ')';
    }
}

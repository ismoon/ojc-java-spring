package com.oraclejava.day7.pet;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("kitty")
public class Cat extends Pet {
    public Cat(@Value("${pet.cat.name}") String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("야옹~");
    }

    @Override
    public String toString() {
        return "Cat(" +
                "name='" + name + '\'' +
                ')';
    }
}

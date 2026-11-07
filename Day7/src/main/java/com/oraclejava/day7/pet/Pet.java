package com.oraclejava.day7.pet;

public abstract class Pet {
    protected final String name;

    public Pet(String name) {
        this.name = name;
    }

    public abstract void makeSound();
}

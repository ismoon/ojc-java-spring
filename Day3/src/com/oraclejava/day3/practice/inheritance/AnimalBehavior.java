package com.oraclejava.day3.practice.inheritance;

public interface AnimalBehavior {
    int MIN_ENERGY = 0; // public static final 생략 가능
    int MAX_ENERGY = 100;

    void eat(); // public abstract 생략 가능
}

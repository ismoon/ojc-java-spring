package com.oraclejava.day3.practice.inheritance;

// 인터페이스도 상속이 가능하다. (다중 상속도 가능)
public interface AnimalBehavior extends Runnable, Swimmable {
    int MIN_ENERGY = 0; // public static final 생략 가능
    int MAX_ENERGY = 100;

    void eat(); // public abstract 생략 가능
}

package com.oraclejava.day3;

import com.oraclejava.day3.practice.A_Static;
import com.oraclejava.day3.practice.B_InheritanceAndPolymorphism;

public class Application {
    public static void main(String[] args) {
        // 1. 정적(Static) 멤버
        A_Static staticMember = new A_Static();

        // staticMember.practice();

        // 2. 상속과 다형성
        B_InheritanceAndPolymorphism inheritance =
                new B_InheritanceAndPolymorphism();

        inheritance.practice1();
    }
}

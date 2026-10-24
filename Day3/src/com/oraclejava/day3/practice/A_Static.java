package com.oraclejava.day3.practice;

import com.oraclejava.day3.practice.staticmember.Counter;

public class A_Static {
    public void practice() {
        // 정적 필드 접근
        System.out.println(Counter.count);
        System.out.println();

        // 정적 메소드 호출
        Counter.increment();

        System.out.println(Counter.count);
        System.out.println();

        // 정적 필드는 객체들이 공유한다.
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();

        System.out.println(counter1.count);
        System.out.println(counter2.count);
        System.out.println();

        Counter.decrement();

        System.out.println(counter1.count);
        System.out.println(counter2.count);
        System.out.println();



    }
}

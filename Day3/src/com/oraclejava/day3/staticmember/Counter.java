package com.oraclejava.day3.staticmember;

public class Counter {
    // 정적 필드
    // 정적 필드는 프로그램이 실행될 때 해당 클래스가 로드되면서
    // 생성되고 프로그램이 종료될 때 소멸된다.
    public static int count;

    private static int step;

    // private int value;

    // 정적 초기화 블록
    // 정적 필드를 초기화하는 블록으로 클래스가 로드될 때 한번만 실행된다.
    static {
        count = 100;
        step = 2;

        System.out.println("Counter 클래스 초기화");
    }

    // 정적 메소드
    // 정적 필드에 접근하는 메소드 또한 static 키워드를 사용해야 한다.
    public static void increment() {
        // this 키워드를 사용할 수 없음
        // count += this.step;
        // 필드에 접근할 수 없음
        // value += step;
        count += step;
    }

    public static void decrement() {
        count -= step;
    }
}

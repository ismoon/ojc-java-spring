package com.oraclejava.day4.practice;

public class C_Exception {
    public void practice1() {
        try {
            // 예외가 발생할 가능성이 있는 코드
            int result = 10 / 0; // ArithmeticException 발생

            if (true) {
                // throw new NullPointerException();
                // throw new IOException();
            }

            System.out.println(result);
        } catch (ArithmeticException e) {
            // try에서 발생한 예외를 처리하는 코드 작성
            System.out.printf("ArithmeticException(%s)가 발생했습니다.\n", e.getMessage());
        } finally {
            // 예외 발생 여부와 상관없이 무조건 실행
            System.out.println("finally 블록 실행");
        }
    }
}

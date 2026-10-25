package com.oraclejava.day4.practice;

import java.io.IOException;

public class C_Exception {
    public void practice1() {
        try {
            // 예외가 발생할 가능성이 있는 코드
            int result = 10 / 2; // ArithmeticException 발생

            // if (true) {
                // throw new NullPointerException();
                // throw new ClassCastException();
                // throw new IOException();
            // }

            System.out.println(result);
        } catch (ArithmeticException e) {
            // try에서 발생한 예외를 처리하는 코드 작성
            System.out.printf("ArithmeticException(%s)가 발생했습니다.\n", e.getMessage());
        } catch (NullPointerException | ClassCastException e) {
            System.out.println("NullPointerException 또는 ClassCastException이 발생했습니다.");
        } catch (Exception e) {
            System.out.println("예외가 발생했습니다.");
        } finally {
            // 예외 발생 여부와 상관없이 무조건 실행
            System.out.println("finally 블록 실행");
        }
    }

    public void practice2() throws IOException, ClassNotFoundException {
        System.out.println("practice2() 호출");

        method1();

        System.out.println("practice2() 종료");
    }

    private void method1() throws IOException, ClassNotFoundException {
        System.out.println("method1() 호출");

        method2();

        System.out.println("method1() 종료");
    }

    private void method2() throws IOException, ClassNotFoundException {
        System.out.println("method2() 호출");

        int random = (int) (Math.random() * 3 + 1);

        if (random == 1) {
            throw new ClassNotFoundException();
        } else if(random == 2) {
            throw new IOException();
        }

        System.out.println("method2() 종료");
    }
}

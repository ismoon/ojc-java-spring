package com.oraclejava.day1.practice;

import java.util.Scanner;

public class B_Operators {
    public void practice1() {
        // 산술 연산
        int number1 = 10;
        int number2 = 3;

        System.out.println(number1 / number2);
        System.out.println(number1 % number2);
        System.out.println();

        // 증감 연산
        System.out.println(++number1); // 전위 연산
        System.out.println(number1++); // 후위 연산
        System.out.println(number1);
        System.out.println(--number1); // 전위 연산
        System.out.println(number1--); // 후위 연산
        System.out.println(number1);
        System.out.println();

        // 관계 연산자
        number1 = 10;
        number2 = 25;

        System.out.println(number1 == number2);
        System.out.println(number1 != number2);
        System.out.println(number1 >= number2);
        System.out.println(number1 <= number2);
        System.out.println('A' == 65);
        System.out.println(3.0 == 3);
        // 단 예외가 있다.
        // 부동 소수점 방식은 오차 생길 수 있기 때문에
        // 대부분의 비교 연산에서는 정수 타입을 사용한다.
        System.out.println(0.1f == 0.1);
        System.out.println();
    }

    public void practice2() {
        // 조건 연산자
        int number = 10;
        // String result = (number > 0) ? "양수입니다." : "음수입니다.";
        String  result =
                (number > 0) ? "양수입니다." : (number == 0) ? "0 입니다." : "음수입니다.";

        System.out.println(result);
        System.out.println();
    }

    public void practice3() {
        int number;
        boolean result;
        Scanner scanner = new Scanner(System.in);

        System.out.print("임의의 정수를 입력해 주세요. > ");
        number = scanner.nextInt();

        // 1 <= number <= 100
        // result = 1 <= number <= 100;
        result = ((number >= 1) && (number <= 100));

        System.out.printf("%d은(는) 1부터 100 사이의 값인가요? %b\n", number, result);
    }
}
package com.oraclejava.day1.practice;

import java.util.Scanner;

public class C_Control {
    public void practice1() {
        int number;
        String result = "";
        Scanner scanner = new Scanner(System.in);

        System.out.print("임의의 정수를 입력해 주세요. > ");
        number = scanner.nextInt();

        if (number > 0) {
            result = "양수입니다.";
        } else if (number == 0) {
            result = "0 입니다.";
        } else {
            result = "음수입니다.";
        }

        System.out.printf("%d은(는) %s\n", number, result);
    }
}

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

    public void practice2() {
        int month;
        Scanner scanner = new Scanner(System.in);

        System.out.print("1 ~ 12월까지 중 하나를 입력하세요. > ");
        month = scanner.nextInt();

        /*
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.printf("%d월은 31일까지 입니다.\n", month);

                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.printf("%d월은 30일까지 입니다.\n", month);

                break;
            case 2:
                System.out.printf("%d월은 28일까지 입니다.\n", month);

                break;
            default:
                System.out.println("1 ~ 12월까지 입력하셔야 합니다.");
        }

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.printf("%d월은 31일까지 입니다.\n", month);

                break;
            case 4, 6, 9, 11:
                System.out.printf("%d월은 30일까지 입니다.\n", month);

                break;
            case 2:
                System.out.printf("%d월은 28일까지 입니다.\n", month);

                break;
            default:
                System.out.println("1 ~ 12월까지 입력하셔야 합니다.");
        }
        */

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.printf("%d월은 31일까지 입니다.\n", month);
            case 4, 6, 9, 11 -> System.out.printf("%d월은 30일까지 입니다.\n", month);
            case 2 -> System.out.printf("%d월은 28일 또는 29일까지 입니다.\n", month);
            default -> System.out.println("1 ~ 12월까지 입력하셔야 합니다.");
        }
    }

    public void practice3() {
        String str = "";
        Scanner scanner = new Scanner(System.in);

        // System.out.println("홍길동");
        // System.out.println(new String("홍길동"));
        // System.out.println("홍길동" == new String("홍길동"));
        // 문자열 리터럴이 동일하면 String 객체를 공유하도록 되어있다.
        // System.out.println("홍길동" == "홍길동");
        // 문자열을 비교할 때는 equals() 메소드를 사용해야 한다.
        // System.out.println("홍길동".equals(new String("홍길동")));

        // while(!str.equals("exit")) {
        //     System.out.print("문자열을 입력해 주세요. > ");
        //     str = scanner.nextLine();
        //
        //     System.out.println(str);
        // }

        do {
            System.out.print("문자열을 입력해 주세요. > ");
            str = scanner.nextLine();

            System.out.println(str);
        } while (!str.equals("exit"));

        System.out.println("프로그램을 종료합니다.");
    }

    public void practice4() {
        int sum  = 0;
        int random = (int) ((Math.random() * 10) + 1);

        for (int i = 1; i <= random ; i++) {
            sum += i; // sum = sum + i
        }

        System.out.printf("1부터 %d까지의 합 : %d\n", random, sum);
    }
}

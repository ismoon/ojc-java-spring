package com.oraclejava.day1.practice;

import java.util.Scanner;

public class A_Variable {
    // 상수 선언
    public static final double PI = 3.14;

    public void practice1() {
        // 논리형
        boolean isTrue = true;

        // 정수형
        // byte bNum = 128;
        byte bNum = 127;
        short sNum = 32767;
        int iNum = 2147483647;
        // long lNum = 2147483648;
        long lNum = 21474836484567890L;

        // 실수형
        float fNum = 3.141592f;
        double dNum = 3.141592;

        // 문자형
        char ch;

        ch = 'A';
        // ch = 97;
        // ch = -97;
        // ch = ''; // 에러 발생
        // ch = '\u0000';
        // ch = 0;

        System.out.println(isTrue);
        System.out.println(bNum);
        System.out.println(sNum);
        System.out.println(iNum);
        System.out.println(lNum);
        System.out.println(fNum);
        System.out.println(dNum);
        System.out.println(ch);
        System.out.println();

        // 문자열
        String name = "홍길동";
        // String name = new String("홍길동");
        // String name = "";
        // String name = null; // 아무것도 참조하지 않는다는 의미이다.

        System.out.println(name);
        System.out.println();

        // final 변수
        // 특정 변수의 값이 변경되는 걸 원하지 않을 때 사용한다.
        final char gender = '남';

        // gender = '여';

        System.out.println(gender);
        System.out.println();
    }

    public void practice2() {
        byte bNum = 10;
        short sNum = 12;
        int iNum = sNum;
        long lNum = iNum;
        float fNum = lNum;
        double dNum = fNum;

        System.out.println(iNum);
        System.out.println(dNum);
        System.out.println();

        char ch = 'A';

        iNum = ch;

        System.out.println(ch);
        System.out.println(iNum);
        System.out.println();

        // 자동 형 변환 예시
        double result1 = 12 + 3.3; // 12.0 + 3.3 = 15.3
        // byte, short 타입의 연산 시 무조건 int 타입으로 변환 후 처리한다.
        int result2 = bNum + sNum;
        // byte result = 10 + 20;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println();

        // 명시적 형 변환
        dNum = 4.2345678903456789;
        // fNum = dNum;
        fNum = (float) dNum;
        iNum = (int) fNum;

        System.out.println(dNum);
        System.out.println(fNum);
        System.out.println(iNum);
        System.out.println();

    }

    public void practice3() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름을 입력해 주세요. > ");
        String name = scanner.nextLine();

        System.out.print("나이를 입력해 주세요. > ");
        int age = scanner.nextInt();

        System.out.print("키를 입력해 주세요. > ");
        double height = scanner.nextDouble();

            /*
    정해져 있는 서식에 맞춰서 그 서식에 맞는 값을 줄바꿈하지 않고 출력해 주는 메소드이다.
        서식 지정자
            %d : 정수형, %o : 8진수, %x : 16진수
            %c : 문자, %s : 문자열
            %f : 실수(소수점 아래 6자리), %e : 지수형태표현
            %A : 16진수 실수
            %b : 논리형
        정렬방법
            %5d : 5칸을 확보하고 오른쪽 정렬
            %-5d : 5칸을 확보하고 왼쪽 정렬
            %.2f : 소수점 아래 2자리까지만 표시
        escape 문자
            원래의 의미를 벗어나는 문자들을 이스케이프 문자라고 한다.
            \t : 수평 탭
            \n : 줄 바꿈
            \r : 리턴
            \" : 큰 따옴표 출력
            \' : 작은 따옴표 출력
            \\ : 역슬래쉬 출력
            \\u 16진수 : 16진수에 해당하는 유니코드
    */
        System.out.printf("이름: %s, 나이: %d, 키: %.2f\n", name, age, height);
    }

}

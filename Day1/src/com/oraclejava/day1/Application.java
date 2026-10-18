/*
    주석(Comment)
      - 소스 코드와 무관하고 코드로 인식되지 않는다.
      - 주로 코드에 대한 설명을 작성할 때 사용한다.
 */

// 패키지(Package)
// - 자바에서 클래스를 관리하기 위해 패키지를 사용한다.
// - 폴더를 만들어서 파일을 저장하고 관리하듯이 패키지를 만들어 클래스를 저장하고 관리한다.
package com.oraclejava.day1;

// 임포트(Import)
// - 클래스를 사용하기 위해 선언하는 구문으로 import 문을 사용하면
//   클래스를 사용할 때 패키지 명을 생략할 수 있다.
// - java.lang 패키지의 클래스는 import 하지 않고 사용 가능하다.
import com.oraclejava.day1.practice.A_Variable;
import com.oraclejava.day1.practice.B_Operators;
import com.oraclejava.day1.practice.C_Control;

// 클래스 선언(정의)
// 클래스 안에는 여러 개의 메소드를 가질 수 있고 메소드 안에 소스코드를 작성한다.
// 클래스의 이름은 자바 파일의 이름과 동일해야 한다.
public class Application {

    // main 메소드
    // 프로그램의 시작점으로 java.exe가 Application.class를 실행시킬 때
    // 제일 먼저 실행하는 메소드이다.
    public static void main(String[] args) {
        // 1. 데이터 타입 & 변수
        A_Variable variable = new A_Variable();

        // variable.practice1();
        // System.out.println(A_Variable.PI);
        // variable.practice2();
        // variable.practice3();

        // 2. 연산자
        B_Operators operators = new B_Operators();

        // operators.practice1();
        // operators.practice2();
        // operators.practice3();

        // 3. 제어문
        C_Control control = new C_Control();

        // control.practice1();
        // control.practice2();
        control.practice3();
    }
}





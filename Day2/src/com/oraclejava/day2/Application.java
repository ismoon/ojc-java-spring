package com.oraclejava.day2;

import com.oraclejava.day2.practice.A_Array;
import com.oraclejava.day2.practice.B_String;
import com.oraclejava.day2.practice.C_Object;

public class Application {
    public static void main(String[] args) {
        // 1. 배열
        A_Array array = new A_Array();

        // array.practice1();
        // array.practice2();

        // 2. 문자열
        B_String string = new B_String();

        // string.practice1();
        // string.practice2();

        // 3. 클래스
        C_Object object = new C_Object();

        object.practice();
    }
}

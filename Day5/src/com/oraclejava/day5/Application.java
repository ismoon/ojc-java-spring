package com.oraclejava.day5;

import com.oraclejava.day5.practice.A_InputOutput;
import com.oraclejava.day5.practice.B_AssistStream;
import com.oraclejava.day5.practice.C_JDBC;

public class Application {
    public static void main(String[] args) {
        // 1. IO
        A_InputOutput inputOutput = new A_InputOutput();

        // inputOutput.practice1();
        // inputOutput.practice2();

        // 2. 보조 스트림
        B_AssistStream assistStream = new B_AssistStream();

        // assistStream.practice1();
        // assistStream.practice2();

        // 3. JDBC(Java DataBase Connectivity)
        C_JDBC jdbc = new C_JDBC();

        // jdbc.practice1();
        // jdbc.practice2();
        // jdbc.practice3();
        jdbc.practice4();
    }
}

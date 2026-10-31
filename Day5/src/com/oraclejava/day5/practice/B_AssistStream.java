package com.oraclejava.day5.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B_AssistStream {
    public void practice1() {
        fileSave();
        fileRead();
    }

    private void fileSave() {
        // try ~ with ~ resource
        // try ~ catch 안에서 사용하는 리소스를 자동으로 close() 한다.
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("b_buffer.txt"))) {
            bw.write('한');
            bw.newLine(); // BufferedWriter 클래스가 제공하는 메소드, 개행할 때 사용한다.
            bw.write("안녕하세요");
            bw.flush(); // 버퍼를 비워주는 역할을 한다.
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void fileRead() {
        try (BufferedReader br = new BufferedReader(new FileReader("b_buffer.txt"))) {

            String line = null;

            // readLine()
            // BufferedReader 클래스가 제공하는 메소드로 파일에서 한 줄을 읽어올 때 사용한다.
            // 더 이상 읽어올 데이터가 없으면 null을 리턴한다.
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void practice2() {
        // keyBoardInput();
        consoleOutput();
    }

    private void keyBoardInput() {
        try {
            BufferedReader br =
                    new BufferedReader(new InputStreamReader(System.in));

            System.out.print("문자열 입력 > ");
            String line = br.readLine();

            System.out.println(line);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void consoleOutput() {
        try {
            BufferedWriter bw =
                    new BufferedWriter(new OutputStreamWriter(System.out));

            bw.write("안녕하세요.");
            bw.newLine();
            bw.write("만나서 반갑습니다.");
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
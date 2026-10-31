package com.oraclejava.day5.practice;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class A_InputOutput {
    public void practice1() {
        try {
            File file = new File("test.txt");

            System.out.println(file.getName());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.length());
            System.out.println(file.isFile());
            System.out.println(file.isDirectory());

            // 파일 존재 여부 확인
            if (file.exists()) {
                file.delete(); // 파일 삭제
            } else {
                file.createNewFile(); // 파일 생성
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void practice2() {
        fileSave();
    }

    private void fileSave() {
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("a_byte.dat");

            fos.write(97);
            fos.write('b');
            fos.write(10);
            fos.write('한');
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

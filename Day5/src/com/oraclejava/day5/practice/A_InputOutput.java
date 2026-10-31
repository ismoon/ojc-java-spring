package com.oraclejava.day5.practice;

import java.io.File;
import java.io.FileInputStream;
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
        fileRead();
    }

    private void fileSave() {
        FileOutputStream fos = null;
        byte[] values = {99, 100, 101, 102, 103};

        try {
            // fos = new FileOutputStream("a_byte.dat");
            fos = new FileOutputStream("a_byte.dat", true);

            fos.write(97);
            fos.write('b');
            fos.write(10); // 줄바꿈 문자
            fos.write('한'); // 한글은 2byte로 표현되기 때문에 출력에 제한이 있다.
            fos.write(10); // 줄바꿈 문자
            fos.write(values);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fos != null) {
                    // 스트림을 사용했으면 반드시 닫아주어야 한다.
                    fos.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void fileRead() {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("a_byte.dat");

            int value = 0;

            // read() 메소드는 더 이상 읽어올 데이터가 없으면 -1을 리턴한다.
            while((value = fis.read()) != -1) {
                System.out.print((char) value);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
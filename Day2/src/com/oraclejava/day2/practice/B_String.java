package com.oraclejava.day2.practice;

public class B_String {
    public void practice1() {
        String str = "Hello World";

        // 문자열 연결 연산
        System.out.println(str + "!!!");
        System.out.println(str + 123456789);
        System.out.println("128" + 123);
        System.out.println();

        // substring()
        String substring1 = str.substring(6);
        String substring2 = str.substring(2, 6);

        System.out.println(substring1);
        System.out.println(substring2);
        System.out.println(str);
        System.out.println();

        // indexOf()
        // int index = str.indexOf("World");
        // int index = str.indexOf("World", 7);
        // int index = str.indexOf('o');
        // int index = str.indexOf('o', 6);
        int index = str.indexOf('o', 8);

        System.out.println(index);
        System.out.println();

        // replace()
        // String replace = str.replace('l', 'c');
        String replace = str.replace("World", "Java");

        System.out.println(replace);
        System.out.println(str);
        System.out.println();


    }
}

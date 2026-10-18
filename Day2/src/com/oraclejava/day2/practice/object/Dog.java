package com.oraclejava.day2.practice.object;

public class Dog {
    // 필드 정의
    private String name;

    private int age;

    private String kinds;

    // 생성자 정의
    // 기본 생성자는 생략 가능하지만 매개변수가 있는 생성자를 만들면
    // 자동으로 생성되지 않는다.
    public Dog() {
    }

    public Dog(String name) {
        // this.name = name;
        // this.age = 0;
        // this.kinds = "알 수 없음";
        this(name, 0, "알 수 없음");
    }

    public Dog(String name, int age, String kinds) {
        this.name = name;
        this.age = age;
        this.kinds = kinds;
    }

    // 메소드 정의
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 메소드 오버로딩
    public void setName(char[] name) {
        this.name = new String(name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public String getKinds() {
        return kinds;
    }

    public void setKinds(String kinds) {
        this.kinds = kinds;
    }
}

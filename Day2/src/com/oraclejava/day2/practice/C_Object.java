package com.oraclejava.day2.practice;

import com.oraclejava.day2.practice.object.Dog;

public class C_Object {
    public void practice() {
        Dog dog = new Dog();

        // dog.name = "멍멍이";
        // dog.setName("멍멍이");
        dog.setName(new char[] {'댕', '댕', '이'});
        dog.setAge(2);
        dog.setKinds("진돗개");

        System.out.println(dog.getName());
        System.out.println(dog.getAge());
        System.out.println(dog.getKinds());
        System.out.println();

        dog = new Dog("초코");

        System.out.println(dog.getName());
        System.out.println(dog.getAge());
        System.out.println(dog.getKinds());
        System.out.println();

        dog = new Dog("초코", 2, "시츄");

        System.out.println(dog.getName());
        System.out.println(dog.getAge());
        System.out.println(dog.getKinds());
        System.out.println();
    }
}

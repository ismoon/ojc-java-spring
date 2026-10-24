package com.oraclejava.day3.practice.inheritance;

public abstract class Animal
        implements AnimalBehavior, Runnable, Swimmable {
    // private 접근 제한자를 가지고 있으면 상속되지 않는다.
    // private String name;
    // protected 접근 제한자는 하위 클래스에서 상속이 가능하다.
    protected String name;

    // private String kinds;
    protected String kinds;

    public Animal() {
        System.out.println("Animal 생성자 호출");
    }

    public Animal(String name, String kinds) {
        this.name = name;
        this.kinds = kinds;
    }

    // public void makeSound() {
    //     System.out.println("소리를 낸다.");
    // }

    public abstract void makeSound();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKinds() {
        return kinds;
    }

    public void setKinds(String kinds) {
        this.kinds = kinds;
    }
}
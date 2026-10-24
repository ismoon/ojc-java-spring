package com.oraclejava.day3.practice.inheritance;

public class Cat extends Animal {
    private boolean isIndoor = false;

    public Cat(String name, String kinds, boolean isIndoor) {
        // 부모 클래스의 필드를 protected 접근 제한자로 선언 후 직접 접근
        this.name = name;
        this.kinds = kinds;

        this.isIndoor = isIndoor;
    }

    public boolean isIndoor() {
        return isIndoor;
    }

    public void setIndoor(boolean indoor) {
        isIndoor = indoor;
    }

    @Override
    public void makeSound() {
        System.out.println("야옹");
    }

    @Override
    public void eat() {
        System.out.println("얌전히 먹는다.");
    }

    @Override
    public void run() {
        System.out.println("우아하게 달린다.");
    }

    @Override
    public void swim() {
        System.out.println("헤엄치지 못한다.");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", kinds='" + kinds + '\'' +
                ", isIndoor=" + isIndoor +
                '}';
    }
}

package com.oraclejava.day3.practice.inheritance;

public class Dog extends Animal {
    private boolean isTrained = false;

    public Dog() {
        // super();
        System.out.println("Dog 생성자 호출");
    }

    public Dog(String name, String kinds, boolean isTrained) {
        // 부모 클래스의 Setter 메소드 호출
        // super.setName(name);
        // super.setKinds(kinds);

        // 부모 클래스의 생성자 호출
        super(name, kinds);

        this.isTrained = isTrained;
    }

    public boolean isTrained() {
        return isTrained;
    }

    public void setTrained(boolean trained) {
        isTrained = trained;
    }

    @Override
    public void makeSound() {
        System.out.println("멍멍");
    }

    @Override
    public void eat() {
        System.out.println("빠르게 먹는다.");
    }

    // toString() 메소드는 객체를 문자열로 표현하는 메소드이다.
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + super.getName() + "'" +
                ", kinds='" + super.getKinds() + "'" +
                ", isTrained=" + isTrained +
                '}';
    }
}

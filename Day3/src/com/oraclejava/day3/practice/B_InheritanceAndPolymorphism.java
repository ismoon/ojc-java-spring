package com.oraclejava.day3.practice;

import com.oraclejava.day3.practice.inheritance.Animal;
import com.oraclejava.day3.practice.inheritance.AnimalBehavior;
import com.oraclejava.day3.practice.inheritance.Cat;
import com.oraclejava.day3.practice.inheritance.Dog;

public class B_InheritanceAndPolymorphism {
    public void practice1() {
        // Dog dog = new Dog();
        Dog dog = new Dog("멍멍이", "진돗개", true);

        System.out.println(dog);
        dog.makeSound();
        System.out.println();

        Cat cat = new Cat("야옹이", "페르시안", true);

        System.out.println(cat);
        cat.makeSound();
        System.out.println();
    }

    public void practice2() {
        // 추상 클래스는 객체 생성이 불가능하다.
        // Animal animal = new Animal();

        // 추상 클래스는 상속하는 하위 클래스를 통해서만 객체 생성이 가능하다.
        // 자식 타입의 객체가 부모 타입의 객체로 형 변환되는 것을 업 캐스팅이라고 한다.
        Animal animal = new Dog("멍멍이", "진돗개", true);
        // Animal animal = new Cat("야옹이", "페르시안", true);

        System.out.println(animal);
        animal.makeSound();
        System.out.println();

        // animal이 참조하는 객체가 Dog 클래스로 생성된 객체이면 true 아니면 false
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;

            System.out.println("강아지입니다.");
            System.out.println("훈련 여부 : " + dog.isTrained());
        } else if (animal instanceof Cat) {
            Cat cat = (Cat) animal;

            System.out.println("고양이입니다.");
            System.out.println("실내 생활 여부 : " + cat.isIndoor());
        }

        System.out.println();
    }

    public void practice3() {
        // 인터페이스는 객체 생성이 불가능하다.
        // AnimalBehavior behavior = new AnimalBehavior();

        // 인터페이스는 참조 변수로 사용이 가능하다.
        // 즉, 다형성을 적용해서 인터페이스를 구현하는 객체들을 참조할 수 있다.
        AnimalBehavior behavior =
                // new Dog("멍멍이", "진돗개", true);
                new Cat("나비", "페르시안", false);

        behavior.eat();
    }
}

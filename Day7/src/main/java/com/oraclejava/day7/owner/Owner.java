package com.oraclejava.day7.owner;

import com.oraclejava.day7.pet.Pet;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@ToString
@Component
@RequiredArgsConstructor
public class Owner {
    @Value("홍길동")
    private String name;

    @Value("24")
    private int age;

    // 1. 필드에 빈을 주입받는 방법
    // @Autowired
    // @Qualifier("kitty")
    // private Pet pet;

    // 2. Setter 메소드로 빈을 주입받는 방법
    // 2.1. 직접 Setter 메소드 생성
    // private Pet pet;

    // @Autowired
    // public void setPet(Pet pet) {
    //     this.pet = pet;
    // }

    // 2.2. Lombok 어노테이션 사용
    // @Setter(onMethod_ = {@Autowired, @Qualifier("kitty")})
    // private Pet pet;

    // 3. 생성자로 빈을 주입받는 방법
    // 3.1. 직접 생성자 생성
    // private final Pet pet;

    // public Owner(/* @Autowired */ Pet pet) {
    //     this.pet = pet;
    // }

    // 3.2. Lombok 어노테이션 사용
    private final Pet pet;
}
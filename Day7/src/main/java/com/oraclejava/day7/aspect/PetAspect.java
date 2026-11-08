package com.oraclejava.day7.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PetAspect {
    /*
    포인트 커트 표현식
      - 스프링 AOP에서 포인트 커트는 AspectJ의 포인트 커트 표현식을 이용해서 정의한다.
      - execution([접근제한자] 리턴타입 클래스이름.메소드이름([파라미터, ...]))
        - 메소드 실행에 대한 표현식이다.
        - * : 모든 값을 표현한다.
        - .. : 0개 이상을 의미한다.
    */

    @Pointcut("execution(* com.oraclejava.day7.pet.*.makeSound(..))")
    public void makeSoundPointcut() {
    }

    // @Before("execution(* com.oraclejava.day7.pet.Pet.makeSound(..))")
    // @Before("makeSoundPointcut()")
    public void before() {
        // makeSound() 실행 전에 필요한 작업들을 작성한다.
        System.out.println("makeSound 준비 중..");
    }

    // @After("makeSoundPointcut()")
    public void after() {
        // makeSound() 실행 결과에 상관없이 필요한 작업들을 작성한다.
        System.out.println("makeSound 수행 완료..");
    }

    // @AfterReturning("makeSoundPointcut()")
    public void success() {
        // makeSound()가 정상적으로 완료된 후 필요한 작업들을 작성한다.
        System.out.println("makeSound 수행 완료..");
    }

    // @AfterThrowing(value = "makeSoundPointcut()", throwing = "exception")
    public void fail(Exception exception) {
        // makeSound()에서 에러가 발생했을 때 필요한 작업들을 작성한다.
        System.out.println(exception.getMessage());
        System.out.println("makeSound 수행 중 에러 발생..");
    }

    @Around("makeSoundPointcut()")
    public void around(ProceedingJoinPoint jp) {
        try {
            // before 어드바이스에 대한 기능을 수행
            System.out.println("makeSound 준비 중..");

            // 타켓 객체의 메소드 호출
            jp.proceed();

            // after-returning 어드바이스에 대한 기능을 수행
            System.out.println("makeSound 수행 완료..");
        } catch (Throwable e) {
            // after-throwing 어드바이스에 대한 기능을 수행
            System.out.println(e.getMessage());
            System.out.println("makeSound 수행 중 에러 발생..");
        }
    }
}

package com.oraclejava.day4.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class B_StreamAPI {
    public void practice1() {
        List<String> names =
                Arrays.asList("홍길동", "김철수", "김영희", "홍길동", "이몽룡");

        Stream<String> stream = names.stream();

        // stream.forEach((String name) -> { System.out.println(name); });
        stream.forEach(name -> System.out.println(name));

        // 이미 사용이 완료된 스트림은 다시 사용할 수 없다.
        // stream.distinct().forEach(name -> System.out.println(name));

        System.out.println();

        names.stream()
                .distinct()
                // .filter((String name) -> { return name.startsWith("김"); })
                .filter(name -> name.startsWith("김"))
                .forEach(name -> System.out.println(name));


    }
}

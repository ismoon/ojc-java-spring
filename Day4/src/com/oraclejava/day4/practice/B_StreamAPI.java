package com.oraclejava.day4.practice;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
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

        System.out.println();

        // 숫자의 정렬
        IntStream.of(3, 5, 1, 4, 2)
                .sorted()
                .forEach(value -> System.out.print(value + " "));

        System.out.println();

        List<String> students =
                Arrays.asList("김신", "김철수", "김숙", "홍길동", "이몽룡");

        long count = students.stream()
                            .map(student -> student.length())
                            .filter(value -> value == 2)
                            .count();

        System.out.println("count : " + count);
    }

    public void practice2() {
        int sum = IntStream.of(3, 5, 1, 4, 2).sum();

        System.out.println(sum);
        System.out.println();

        /*
        Optional 클래스
        스트림의 최종 결과 값을 저장하는 객체이다.
        값의 존재 여부를 확인하고 값이 존재하지 않을 경우 처리할 코드를 작성할 수 있다.
         */
        OptionalInt optionalInt = IntStream.of(3, 5, 1, 4, 2)
                                .filter(value -> value % 2 == 0)
                                .min();

        // System.out.println(optionalInt.getAsInt());
        // optionalInt.ifPresent(value -> System.out.println(value));
        System.out.println(optionalInt.orElse(0));
        System.out.println();

        OptionalDouble optionalDouble =
                IntStream.of(3, 5, 1, 4, 2)
                        .filter(value -> value % 2 == 0)
                        .average();

        // System.out.println(optionalDouble.getAsDouble());
        System.out.println(optionalDouble.orElse(0.0));
        System.out.println();
    }

    public void practice3() {
        List<String> names =
                Arrays.asList("홍길동", "김철수", "김영희", "홍길동", "이몽룡");

        List<String> uniqueNames = names.stream()
                                        .distinct()
                                        // .collect(Collectors.toList());
                                        .toList();

        System.out.println(names);
        System.out.println(uniqueNames);
        System.out.println();

        Set<String> selectedNames = names.stream()
                        .filter(name -> name.startsWith("김"))
                        .collect(Collectors.toSet());

        System.out.println(names);
        System.out.println(selectedNames);
        System.out.println();
    }
}

package com.oraclejava.day3.practice;

import java.time.LocalDateTime;

public class C_APIs {
    public void practice1() {
        // 1. Boxing(기본 타입 -> Wrapper 타입)
        // Integer integer = new Integer(10);
        // Double double1 = new Double(3.14);
        // Double double2 = new Double(3.14);
        // Character character = new Character('a');

        // Integer integer = Integer.valueOf(10);
        // Double double1 = Double.valueOf(3.14);
        // Double double2 = Double.valueOf(3.14);
        // Character character = Character.valueOf('a');

        // Auto Boxing
        Integer integer = 10;
        Double double1 = 3.14;
        Double double2 = 3.14;
        Character character = 'a';

        System.out.println(integer);
        System.out.println(double1);
        System.out.println(double2);
        System.out.println(character);
        // System.out.println(double1 == double2);
        // 두 객체가 가지고 있는 값이 동일하면 true를 반환하도록 재정의되어 있다.
        System.out.println(double1.equals(double2));
        // 두 값을 비교해서 double1이 크면 1을 반환,
        // double2가 크면 -1을 반환, 같으면 0을 반환한다.
        System.out.println(double1.compareTo(double2));
        System.out.println();

        // 2. Unboxing (Wrapper 객체 -> 기본 타입)
        // int number = integer.intValue();
        // double dNumber1 = double1.doubleValue();
        // double dNumber2 = double2.doubleValue();

        // Auto Unboxing
        int number = integer;
        double dNumber1 = double1;
        double dNumber2 = double2;

        System.out.println(number);
        System.out.println(dNumber1);
        System.out.println(dNumber2);
        System.out.println(dNumber1 == dNumber2);
        System.out.println();
    }

    public void practice2() {
        // 1. LocalDateTime 객체 생성
        LocalDateTime now = LocalDateTime.now();
        // LocalDateTime when = LocalDateTime.of(2026, 10, 25, 12, 30, 25);
        LocalDateTime when =
                LocalDateTime.parse("2026-10-25T10:05:02.368395");

        System.out.println(now);
        System.out.println(when);
        System.out.println();

        // 2. 날짜와 시간 정보를 출력하는 메소드
        System.out.println(now.getYear());
        System.out.println(now.getMonth());
        System.out.println(now.getMonthValue());
        System.out.println(now.getDayOfMonth());
        System.out.println(now.getDayOfWeek());
        System.out.println(now.getDayOfYear());
        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());
        System.out.println(now.getNano());
        System.out.println();

        // 3. 날짜와 시간을 조작하는 메소드
        // LocalDateTime plusDays = now.plusDays(1);
        LocalDateTime plusDays =
                now.plusDays(1).plusMonths(1).plusYears(1);

        System.out.println(plusDays);
        System.out.println();




    }
}

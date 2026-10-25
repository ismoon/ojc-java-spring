package com.oraclejava.day4.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class A_Collection {
    public void practice1() {
        Set<String> set = new HashSet<>();

        set.add(null);
        set.add("반갑습니다.");
        set.add(new String("반갑습니다."));
        set.add("안녕하세요.");
        set.add(null);

        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println();

        // Set에 저장된 객체에 접근하는 방법
        // 1. 향상된 for 문을 사용하는 방법
        for (String str : set) {
            System.out.println(str);
        }

        System.out.println();

        // 2. Iterator 반복자를 사용하는 방법
        // 가져올 객체가 있는지 확인할 때는 hasNext() 메소드를 사용한다.
        // 하나의 객체를 가져올 때는 next() 메소드를 사용한다.
        Iterator<String> iterator = set.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();

        set.remove("안녕하세요.");

        System.out.println(set);
        System.out.println();

        set.clear();

        System.out.println(set);
        System.out.println(set.isEmpty());
        System.out.println();
    }

    public void practice2() {
        List<String> list = new ArrayList<>();

        list.add("반갑습니다.");
        list.add("안녕하세요.");
        list.add("안녕하세요.");
        list.add(null);
        list.add(null);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println();
    }
}

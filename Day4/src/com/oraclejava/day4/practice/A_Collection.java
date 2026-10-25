package com.oraclejava.day4.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class A_Collection {
    public void practice1() {
        // Set<String> set = new HashSet<>();
        Set<String> set = new LinkedHashSet<>();

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
        // List<String> list = new ArrayList<>();
        List<String> list = new LinkedList<>();

        list.add("반갑습니다.");
        list.add("안녕하세요.");
        list.add("안녕하세요.");
        list.add(null);
        list.add(null);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println();

        String str = list.get(0);

        System.out.println(str);
        System.out.println();

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println();

        // 원하는 인덱스 위치에 객체를 추가한다.
        list.add(2, "만나서 반갑습니다.");

        System.out.println(list);

        // 원하는 인덱스 위치에 객체를 변경한다.
        list.set(2, "홍길동");

        System.out.println(list);
        System.out.println();

        list.remove(2);
        list.remove("안녕하세요.");

        System.out.println(list);
        System.out.println();
    }

    public void practice3() {
        Map<String, String> map = new HashMap<>();

        map.put("다이제", "초코맛");
        map.put("칸쵸", "바나나맛");
        map.put("프링글스", "어니언맛");
        map.put("프링글스", "오리지널");
        map.put("먹태깡", "청양마요");

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println();

        String flavor = map.get("먹태깡");

        System.out.println(flavor);
        System.out.println();

        map.remove("칸쵸");

        System.out.println(map);
        System.out.println(map.size());
        System.out.println();

        // 1. keySet() 메소드를 이용하는 방법
        //    Map 컬렉션에 있는 키값들만 Set 컬렉션에 담아서 반환한다.
        Set<String> set = map.keySet();

        for (String key : set) {
            System.out.printf("key: %s, value: %s\n", key, map.get(key));
        }

        System.out.println();

        // 2. entrySet() 메소드를 이용하는 방법
        //    Map 컬렉션에 있는 Entry 객체를 Set 컬렉션에 담아서 반환한다.
        Set<Map.Entry<String, String>> entrySet = map.entrySet();

        for (Map.Entry<String, String> entry : entrySet) {
            System.out.printf(
                    "key: %s, value: %s\n", entry.getKey(), entry.getValue());
        }


    }
}

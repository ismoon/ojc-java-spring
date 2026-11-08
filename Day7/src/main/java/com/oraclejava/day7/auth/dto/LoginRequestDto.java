package com.oraclejava.day7.auth.dto;

import java.util.List;

/*
 * 레코드(record)
 *   - 자바 16부터 추가된 타입으로 불변 클래스를 간단히 정의할 수 있다.
 *   - 불변 객체를 만들기 위해 모든 필드는 final로 선언한다.
 *   - final 필드를 초기화할 수 있는 매개변수가 있는 생성자를 자동으로 생성한다.
 *   - 필드에 대한 Getter 메소드를 자동으로 생성한다.
 *   - equals(), hashCode(), toString() 메소드를 자동으로 생성한다.
 */
public record LoginRequestDto(String username, String password, List<String> hobby) {
}

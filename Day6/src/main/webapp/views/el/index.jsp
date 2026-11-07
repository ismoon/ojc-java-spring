<%@ page import="com.oraclejava.day6.servlet.Student" %>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%
    // Request 영역에 데이터를 저장
    request.setAttribute("classRoom", 1);
    request.setAttribute("student", new Student("홍길동", 24, 80, 80));

    // Session 영역에 데이터를 저장
    session.setAttribute("classRoom", 2);
    session.setAttribute("student", new Student("성춘향", 20, 90, 90));

    // Application 영역에 데이터를 저장
    application.setAttribute("classRoom", 3);
    application.setAttribute("student", new Student("이몽룡", 20, 80, 70));
%>
<html>
<head>
    <title>EL (Expression Language)</title>
</head>
<body>
    <h2>1. 데이터 출력</h2>
    <!--
        1. EL은 영역 객체에 저장된 속성명을 검색해서 존재하는 경우 속성값을 가져온다.
        - Page 영역 -> Request 영역 -> Session 영역 -> Application 영역 순으로 해당 속성을 찾아서 값을 가져온다.

        2. EL은 객체의 필드에 직접 접근하는 것처럼 보이지만 내부적으로는 해당 객체의 Getter 메소드로 접근해서 값을 읽어온다.
    -->
    강의장: ${ classRoom }
    <br>
    수강생: ${ student.name }, ${ student.age }

    <br><br>

    강의장: ${ sessionScope.classRoom }
    <br>
    수강생: ${ sessionScope.student.name }, ${ sessionScope.student.age }

    <br><br>

    강의장: ${ applicationScope.classRoom }
    <br>
    수강생: ${ applicationScope.student.name }, ${ applicationScope.student.age }
</body>
</html>

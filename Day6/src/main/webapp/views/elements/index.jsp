<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>JSP 요소 (Elements)</title>
</head>
<body>
    <main>
        <h2>JSP 요소 (Elements)</h2>
        <!-- HTML 주석 -->
        <%-- JSP 주석 --%>

        <%-- 선언문 태그 --%>
        <%!
            // 필드 선언
            private String name = "홍길동";

            // 메소드 선언
            private String getName () {
                return this.name;
            }
        %>

        <%-- 스크립트 릿 --%>
        <%
            // 자바 코드 기술
            int sum = 0;

            for (int i = 1; i <= 5; i++) {
                sum += i;
        %>
        <h5>안녕하세요.</h5>
        <%
            }

            System.out.println(sum);
        %>

        <%-- 표현식 태그 --%>
        저의 이름은 <%= name %>입니다.
        <br>
        1부터 5까지의 합은 <%= sum %>입니다.
</main>
</body>
</html>

<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>

<html>
<head>
    <title>JSTL(JSP Standard Tag Library)</title>
</head>
<body>
    <h2>1. set 액션 태그</h2>
    <p>
        변수를 선언하고 초기값을 대입하는 액션 태그이다.
    </p>

    <c:set var="num1" value="10"/>
    <c:set var="num2" value="20" scope="request"/>
    <c:set var="result" value="${ num1 + num2 }" scope="session"/>
    <c:set var="colors" scope="application">
        red, blue, yellow, pink, green
    </c:set>

    num1: ${ num1 } 또는 ${ pageScope.num1 }
    <br>
    num2: ${ num2 } 또는 ${ requestScope.num2 }
    <br>
    result: ${ result } 또는 ${ sessionScope.result }
    <br>
    colors: ${ colors } 또는 ${ applicationScope.colors }

    <h2>2. remove 액션 태그</h2>
    <p>
        set 액션 태그로 선언한 변수를 삭제할 때 사용하는 액션 태그이다.
    </p>

    <c:set var="result" value="99999"/>
    <c:set var="result" value="10000" scope="request"/>

    삭제 전: ${ result }<br>

    <!-- 특정 scope에서 삭제 -->
    <c:remove var="result" scope="page"/>

    삭제 후: ${ result }<br>

    <!-- 모든 scope에서 삭제 -->
    <c:remove var="result"/>

    삭제 후: ${ result }<br>

    <h2>3. if 액션 태그</h2>
    <p>
        자바의 if 구문과 같은 역할을 하는 액션 태그이다.
    </p>

    <c:if test="${ num1 > num2 }">
        num1이 num2보다 크다.
    </c:if>

    <c:if test="${ num1 < num2 }">
        num2가 num1보다 크다.
    </c:if>

    <h2>4. choose 액션 태그</h2>
    <p>
        자바의 if 구문 또는 switch 구문과 같은 역할을 하는 액션 태그이다.
    </p>

    <c:choose>
        <c:when test="${ num1 > num2 }">
            num1이 num2보다 크다.
        </c:when>
        <c:when test="${ num1 < num2 }">
            num2가 num1보다 크다.
        </c:when>
        <c:otherwise>
            num1과 num2는 같다.
        </c:otherwise>
    </c:choose>

    <h2>5. forEach 액션 태그</h2>
    <p>
        자바의 for 구문에 해당하는 역할을 하는 액션 태그이다.
    </p>

    <h3>5.1. 자바의 for 구문처럼 사용하기</h3>
    <c:forEach var="i" begin="1" end="5">
        ${ i }<br>
    </c:forEach>

    <h3>5.2. 자바의 향상된 for 구문처럼 사용하기</h3>
    <c:forEach var="color" items="${ colors }">
        <h5 style="color: ${ color }">${ color }</h5>
    </c:forEach>

    <br><br><br><br><br>
    <br><br><br><br><br>
    <br><br><br><br><br>
    <br><br><br><br><br>
    <br><br><br><br><br>
    <br><br><br><br><br>
</body>
</html>

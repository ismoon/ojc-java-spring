<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
  <head>
    <title>자바 웹 (Java Web)</title>
  </head>
  <body>
    <h2>1. 서블릿(Servlet)</h2>
    <p>
      서블릿은 웹 브라우저로부터 요청을 받아 처리하고
      결과를 다시 웹 브라우저로 전송하는 역할을 한다.
    </p>

    <a href="https://www.naver.com">네이버로</a>
    <br>
    <a href="http://localhost:8080/day6/first.do">View Details</a>

    <h2>2. HTTP 요청 방식</h2>
    <p>
      1) GET 방식은 URL에 데이터를 포함시켜 요청하는 방식으로 보안 유지가 불가능하다.
      <br>
      2) POST 방식은 데이터를 요청 Body에 담아서 요청하는 방식으로 보안 유지가 가능하다.
    </p>

    <%-- <form action="/day6/method.do" method="get"> --%>
    <form action="/day6/method.do" method="post">
      <label for="name">이름 : </label>
      <input type="text" id="name" name="userName"/>

      <br>

      <label for="age">나이 : </label>
      <input type="text" id="age" name="userAge"/>

      <br>

      <label>성별 : </label>
      <input type="radio" name="gender" id="male" value="남자" checked>
      <label for="male">남자</label>
      <input type="radio" name="gender" id="female" value="여자">
      <label for="female">여자</label>

      <br><br>

      <input type="submit" value="전송"/>
      <input type="reset" value="취소">
    </form>

    <h2>3. JSP (Java Server Page)</h2>
    <p>
      JSP는 HTML 코드 안에서 스크립트 형태로 자바 언어를 사용하여 동적인 페이지를 생성한다.
    </p>

    <h3>3.1. JSP 요소(Elements)</h3>
    <p>
      JSP 페이지에서 자바 코드를 직접 기술할 수 있게 해주는 요소들이다.
    </p>

    <a href="/day6/views/elements">View Details</a>

    <h3>3.2. JSP 내장 객체</h3>
    <p>
      JSP가 서블릿으로 변환될 때 자바 파일에 자동으로 추가되는 객체들을 내장 객체라고 한다.
      <br>
      즉, JSP 페이지 내부에서 개발자가 직접 선언하지 않고 바로 사용이 가능한 객체이다.
    </p>

    userId: <%= session.getAttribute("userId") %>

    <br>

    <a href="/day6/views/objects">View Details</a>

    <h2>4. EL(Expression Language)</h2>
    <p>
      표현식 태그를 대신하여 클라이언트에 출력하고자 하는 값들을 좀 더 간결하게 사용하는 방법이다.
    </p>

    <a href="/day6/views/el">View Details</a>

    <br><br><br><br><br><br>
    <br><br><br><br><br><br>
    <br><br><br><br><br><br>
    <br><br><br><br><br><br>
    <br><br><br><br><br><br>
    <br><br><br><br><br><br>
    <br><br><br><br><br><br>
  </body>
</html>
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


    <br><br><br><br><br><br>
    <br><br><br><br><br><br>
    <br><br><br><br><br><br>
    <br><br><br><br><br><br>
    <br><br><br><br><br><br>
    <br><br><br><br><br><br>
    <br><br><br><br><br><br>
  </body>
</html>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>JSP 내장 객체</title>
</head>
<body>
    <h2>1. 리다이렉트(Redirect)</h2>
    <p>
        response 객체는 웹 브라우저의 요청에 대한 응답 객체이다.
        <br>
        리다이렉트는 지정한 경로로 클라이언트에게 다시 요청하도록 응답한다.
    </p>
    <a href="redirect.jsp">View Details</a>

    <h2>2. 포워드(Forward)</h2>
    <p>
        포워드는 지정한 경로로 서버 내부에서 요청을 전달한다.
    </p>
    <a href="forward.jsp">View Details</a>

    <h2>3. 세션(session)</h2>
    <p>
        웹 브라우저의 정보를 유지하기 위한 세션 정보를 저장하고 있는 객체이다.
    </p>
    <ol>
        <li>세션이란 서버 측의 컨테이너에서 관리되는 정보를 의미한다.</li>
        <li>세션은 클라이언트와 서버 간의 상태를 유지시켜주는 역할을 한다.</li>
        <li>세션의 정보는 클라이언트에서 접속해서 브라우저를 종료할 때까지 유지된다.</li>
        <li>설명 : 세션은 하나의 브라우저와 서버간의 상태를 유지하기 위한 기술이다.</li>
    </ol>

    <%
        session.setAttribute("userId", "hong123");
        // 클라이언트의 요청이 없더라도 세션을 유지할 시간을 초 단위로 설정한다.
        session.setMaxInactiveInterval(10);
    %>

    세션 ID : <%= session.getId() %><br>
    isNew : <%= session.isNew() %><br>
    생성 시간 : <%= new Date(session.getCreationTime()) %><br>
    최종 접속 시간 : <%= new Date(session.getLastAccessedTime()) %><br>
    세션 유지 시간 : <%= session.getMaxInactiveInterval() %>초<br>
    userId : <%= session.getAttribute("userId") %>

    <h2>4. 쿠키(Cookie)</h2>
    <ol>
        <li>쿠키란 클라이언트 측에서 관리되는 정보를 의미한다.</li>
        <li>쿠키는 클라이언트와 서버 간의 상태를 유지시켜주는 역할을 한다.</li>
    </ol>

    <%
        // 서버에서 쿠키 생성 후 클라이언트로 전송하는 방법

        // 1) 쿠키를 생성한다.
        Cookie cookie = new Cookie("user-name", "GilDongHong");

        // 2) 쿠키의 만료 시간을 지정한다.
        // cookie.setMaxAge(10);
        cookie.setMaxAge(-1);

        // 3) 쿠키를 모든 경로에서 사용하도록 설정한다.
        // 설명: /jsp로 시작하는 요청에만 쿠키가 포함된다.
        cookie.setPath("/jsp");

        // 4) 생성한 쿠키를 클라이언트로 전송하기 위해 HttpServletResponse 객체에 저장한다.
        response.addCookie(cookie);

        // 클라이언트에서 서버로 전송한 쿠키를 얻어오는 방법
        // 1) HttpServletRequest 객체에서 클라이언트로부터 전송된 모든 쿠키를 배열로 받아온다.
        Cookie[] cookies = request.getCookies();

        // 2) 반복을 통해 쿠키 배열의 내용을 출력한다.
        for (Cookie c : cookies) {
            out.print(c.getName() + " = " + c.getValue());
            out.print("<br>");
        }
    %>

    <br><br><br><br><br><br>
    <br><br><br><br><br><br>
    <br><br><br><br><br><br>
    <br><br><br><br><br><br>
    <br><br><br><br><br><br>
    <br><br><br><br><br><br>
    <br><br><br><br><br><br>
</body>
</html>

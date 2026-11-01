
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>영역 객체</title>
</head>
<body>
    <h2>Session 영역과 Application 영역의 비교</h2>

    Session 영역에 저장된 데이터 : <%= session.getAttribute("address") %>
    <br>
    Application 영역에 저장된 데이터 : <%= application.getAttribute("name") %>
</body>
</html>

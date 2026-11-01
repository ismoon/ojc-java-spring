
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>영역 객체</title>
</head>
<body>
    <h2>Page 영역과 Request 영역의 비교</h2>

    Page 영역에 저장된 데이터 : <%= pageContext.getAttribute("age") %>
    <br>
    Request 영역에 저장된 데이터 : <%= request.getAttribute("gender") %>
</body>
</html>

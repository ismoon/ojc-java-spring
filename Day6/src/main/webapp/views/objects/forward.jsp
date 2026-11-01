<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%
    // forward(String path)
    // 매개값으로 지정한 경로로 서버 내부에서 요청을 전달한다.
    pageContext.forward("forward_target.jsp");
%>


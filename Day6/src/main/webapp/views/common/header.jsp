<%@ page import="java.time.LocalDateTime" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%
    LocalDateTime now = LocalDateTime.now();
    String today = now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일"));
%>
<header>
    <h2>지시자 태그</h2>
    오늘은 <%= today %>입니다.
</header>
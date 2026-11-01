package com.oraclejava.day6.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

@WebServlet("/first.do")
public class FirstServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1. 한글이 깨지는 것을 방지하기 위해서 응답 헤더를 설정한다.
        response.setContentType("text/html;charset=utf8");

        // 2. 응답 화면을 출력하기 위한 출력 스트림을 얻어온다.
        PrintWriter out = response.getWriter();

        // 3. 자바 코드로 응답 화면을 작성한다.
        out.println("<!DOCTYPE html>");
        out.println("<html lang=\"ko\">");
        out.println("<head>");
        out.println("<title>FirstServlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h2>첫 번째 서블릿이 반환 내용</h2>");
        out.println("<p>현재 시간 : " + LocalDateTime.now() + "</p>");
        out.println("</body>");
        out.println("</html>");
    }
}

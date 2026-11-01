package com.oraclejava.day6.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/method.do")
public class MethodServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 사용자가 보낸 데이터들은 HttpServletRequest 객체를 통해서 얻어올 수 있다.
        String userName = request.getParameter("userName");
        String userAge = request.getParameter("userAge");
        String gender = request.getParameter("gender");

        System.out.println(userName);
        System.out.println(userAge);
        System.out.println(gender);

        // 응답 화면 출력
        response.setContentType("text/html;charset=utf-8");

        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html lang=\"ko\">");
        out.println("<head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<title>개인 정보 출력</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h2>개인 정보 출력</h2>");
        out.printf("%s님은 %s세 %s입니다.<br>", userName, userAge, gender);
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
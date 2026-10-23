package com.korai.servletstudy;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FirstServlet extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("FirstServlet 초기화");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // GET만 호출
        System.out.println("GET요청 들어옴.");

        resp.setStatus(400);
        resp.setContentType("text/plain");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().println("응답 데이터");
    }


//    @Override 우선 순위가 가장 높으나 모든 요청을 다받기때문에 잘 사용되지 않는다.
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("서비스 호출");
//        System.out.println(req.getMethod());
//        if (req.getMethod().equalsIgnoreCase("GET")) {
//            System.out.println("GET요청 들어옴.");
//        }
//    }

}

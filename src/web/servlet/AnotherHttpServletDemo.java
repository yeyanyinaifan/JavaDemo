package web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/AnotherHttpServlet")
public class AnotherHttpServletDemo extends HttpServletDemo{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("AnotherHttpServlet doGet");
        System.out.println("========================");
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("AnotherHttpServlet doPost");
        //获取数据
        Object msg = req.getAttribute("msg");
        System.out.println("msg:" + msg);
    }
}

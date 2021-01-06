package web.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

@WebServlet("/HttpServlet")
public class HttpServletDemo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("HttpServlet doGet");
        /*
            1. 获取请求方式 ：GET
                * String getMethod()
            2. (*)获取虚拟目录：/HttpServlet
                * String getContextPath()
            3. 获取Servlet路径:
                * String getServletPath()
            4. 获取get方式请求参数：
                * String getQueryString()
            5. (*)获取请求URI：/HttpServlet
                * String getRequestURI():		/HttpServlet
                * StringBuffer getRequestURL()  :http://localhost/HttpServlet
            6. 获取协议及版本：HTTP/1.1
                * String getProtocol()
            7. 获取客户机的IP地址：
                * String getRemoteAddr()
         */
        //1. 获取请求方式 ：GET
        String method = req.getMethod();
        System.out.println("获取请求方式：" + method);
        //2.(*)获取虚拟目录：
        String contextPath = req.getContextPath();
        System.out.println("获取虚拟目录：" + contextPath);
        //3. 获取Servlet路径：/HttpServlet
        String servletPath = req.getServletPath();
        System.out.println("获取Servlet路径：" + servletPath);
        //4. 获取get方式请求参数
        String queryString = req.getQueryString();
        System.out.println("请求参数：" + queryString);
        //5.(*)获取请求URI：/HttpServlet
        String requestURI = req.getRequestURI();
        StringBuffer requestURL = req.getRequestURL();
        System.out.println("获取请求URI：" + requestURI);
        System.out.println("获取请求URL：" + requestURL);
        //6. 获取协议及版本：HTTP/1.1
        String protocol = req.getProtocol();
        System.out.println("获取协议及版本：" + protocol);
        //7. 获取客户机的IP地址：
        String remoteAddr = req.getRemoteAddr();
        System.out.println("获取客户机的IP地址：" + remoteAddr);

        //1.获取所有请求头名称
        Enumeration<String> headerNames = req.getHeaderNames();
        //2.遍历
        while(headerNames.hasMoreElements()){
            String name = headerNames.nextElement();
            //根据名称获取请求头的值
            String value = req.getHeader(name);
            System.out.println("请求头：" + name+"---"+value);
        }
        String agent = req.getHeader("user-agent");
        //判断agent的浏览器版本
        if(agent.contains("Chrome")){
            //谷歌
            System.out.println("谷歌浏览器");
        }else if(agent.contains("Firefox")){
            //火狐
            System.out.println("火狐浏览器");
        }

        //演示获取请求头数据:referer

        String referer = req.getHeader("referer");
        System.out.println("请求referer数据" + referer);//http://localhost/demo/index.html

        //防盗链
        if(referer != null ){
            if(referer.contains("/demo")){
                //正常访问
                // System.out.println("播放电影....");
                resp.setContentType("text/html;charset=utf-8");
                resp.getWriter().write("播放电影....");
            }else{
                //盗链
                //System.out.println("想看电影吗？来优酷吧...");
                resp.setContentType("text/html;charset=utf-8");
                resp.getWriter().write("想看电影吗？来优酷吧...");
            }
        }

        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("HttpServlet doPost");
        //设置流的编码
        req.setCharacterEncoding("utf-8");

        ////1.获取字符流
        //BufferedReader br = req.getReader();
        ////2.读取数据
        //String line = null;
        //while((line = br.readLine()) != null){
        //    System.out.println(line);
        //}

        //根据参数名称获取参数值
        String username = req.getParameter("username");
        System.out.println("post");
        System.out.println(username);

        //根据参数名称获取参数值的数组
        String[] passwords = req.getParameterValues("password");
        for (String password : passwords) {
            System.out.println(password);
        }

        //获取所有请求的参数名称
        Enumeration<String> parameterNames = req.getParameterNames();
        while(parameterNames.hasMoreElements()){
            String name = parameterNames.nextElement();
            System.out.println(name);
            String value = req.getParameter(name);
            System.out.println(value);
            System.out.println("----------------");
        }

        // 获取所有参数的map集合
        Map<String, String[]> parameterMap = req.getParameterMap();
        //遍历
        Set<String> keyset = parameterMap.keySet();
        for (String name : keyset) {
            //获取键获取值
            String[] values = parameterMap.get(name);
            System.out.println(name);
            for (String value : values) {
                System.out.println(value);
            }
            System.out.println("-----------------");
        }

        //存储数据到request域中
        req.setAttribute("msg", "success");
        //转发到AnotherHttpServletDemo
        req.getRequestDispatcher("/AnotherHttpServlet").forward(req, resp);

        ServletContext servletContext = req.getServletContext();
        System.out.println("servletContext:" + servletContext);
    }
}

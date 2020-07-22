<%--
  Created by IntelliJ IDEA.
  User: irv
  Date: 2020/7/15
  Time: 11:44 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>TomcatDemo</title>
  </head>
  <body>
  Hello Tomcat!
  <form action="/demo/HttpServlet" method="post">
    <input type="text" name="username" placeholder="请输入用户名">
    <input type="password" name="password" placeholder="请输入密码">
    <input type="submit" value="提交">
  </form>

  <a href="/demo/HttpServlet">跳转播放电影</a>
  </body>
</html>

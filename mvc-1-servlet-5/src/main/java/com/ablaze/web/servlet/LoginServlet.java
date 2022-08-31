package com.ablaze.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Lenovo
 */
@WebServlet("/helloServlet")
public class LoginServlet extends HttpServlet {
/*
    private final UserService service = new UserServiceImpl();
*/

    /**
     * 记住用户名密码
     */
/*
    public static final String REMEMBERER = "1";
*/

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        //1. 获取用户名和密码
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        //获取复选框数据
        String remember = request.getParameter("remember");

        request.getRequestDispatcher("/result.jsp").forward(request, response);
/*

        //2.调用service查询
        User user = service.login(username, password);

        //3.判断
        if (user != null) {
            //登陆成功,跳转到查询所有的BrandServlet

            //判断用户是否勾选记住我
            if (REMEMBERER.equals(remember)) {

                //勾选了，发送Cookie

                //1. 创建Cookie对象
                Cookie c_username = new Cookie("username", username);
                Cookie c_password = new Cookie("password", password);

                //设置Cookie的存活时间
                c_username.setMaxAge(60 * 60 * 24 * 7);
                c_password.setMaxAge(60 * 60 * 24 * 7);

                //2.发送
                response.addCookie(c_username);
                response.addCookie(c_password);
            }
            //将登陆成功后的user对象，存储到session
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            String contextPath = request.getContextPath();
            response.sendRedirect(contextPath + "/brand.html");
        } else {
            //登陆失败

            //存储错误信息到request
            request.setAttribute("login_msg", "用户名或密码错误");

            //跳转到login.jsp
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
*/

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}

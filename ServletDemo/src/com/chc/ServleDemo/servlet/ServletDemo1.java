package com.chc.ServleDemo.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletDemo1",value="/ServletDemo1")
public class ServletDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try{
            String number=request.getParameter("number");
            String password=request.getParameter("password");

//            //设置学号cookie
//            Cookie numCookie=new Cookie("num",number);
//            //设置密码cookie
//            Cookie pwdCookie=new Cookie("pwd",password);
//
//            //设置cookie过期时间为一周：7*24*60*60s
//            numCookie.setMaxAge(7*24*60*60);
//            pwdCookie.setMaxAge(7*24*60*60);
//
//            //把cookie添加到对应的响应体中
//            response.addCookie(numCookie);
//            response.addCookie(pwdCookie);
//
//            //浏览器中的cookie通过请求体发送到服务器，存入数组以便后续操作
//            Cookie[] cookies=request.getCookies();
//
//            //做非空判断，因为第一次登录时没有cookie
//            if(cookies!=null){
//                //第二次请求直接找cookie，不用从表单中获取参数
//                for(Cookie cookie:cookies){
//                    //保存学号
//                    if(cookie.getName().equals("num")){
//                        number=cookie.getValue();
//                    }
//                    //保存密码
//                    if(cookie.getName().equals("pwd")){
//                        password=cookie.getValue();
//                    }
//                }
//            }

            HttpSession session=request.getSession();
            //String num=(String) session.getAttribute("number");
            PrintWriter out=response.getWriter();
            if(number!=null&&password!=null){
                session.setAttribute("number",number);
                
                if(number.equals("06") && password.equals("123")){
                    out.print("success");
                }else{
                    out.print("fail");
                }
            }




        }catch (Exception e){
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
}

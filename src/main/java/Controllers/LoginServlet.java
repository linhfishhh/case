package Controllers;

import Services.CheckLogin;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String check=req.getParameter("check");
        RequestDispatcher requestDispatcher=null;
        String username=req.getParameter("username");
        String passwd=req.getParameter("password");
        System.out.println(username+passwd);
        if(check != null){
            try {
                if(CheckLogin.CheckAdminLogin(username,passwd)){
                    resp.sendRedirect("/adminpage.jsp");
                }else{
                    String alerterror="error";
                    req.setAttribute("error",alerterror);
                    requestDispatcher=req.getRequestDispatcher("/views/login.jsp");
                    requestDispatcher.forward(req,resp);
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        } else {
            try {
                if(CheckLogin.CheckUserLogin(username,passwd)){
                    resp.sendRedirect("/profile.jsp");
                }else{
                    String alerterror="error";
                    req.setAttribute("error",alerterror);
                    requestDispatcher=req.getRequestDispatcher("/views/login.jsp");
                    requestDispatcher.forward(req,resp);
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}

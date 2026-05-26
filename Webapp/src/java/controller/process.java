
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name="process", urlPatterns={"/process"})
public class process extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
    } 

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String user = request.getParameter("account");
        String pass = request.getParameter("password");
        
        PrintWriter pw = response.getWriter();
        
        if ("Admin".equals(user) && "123".equals(pass)) {
            pw.println("Login Succescfullly!!!");
        } else {
            pw.println("Login Failed!!");
        }
        
    }
}
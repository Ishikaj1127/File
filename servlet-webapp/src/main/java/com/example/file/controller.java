package com.example.file;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/signin")
public class controller extends HttpServlet {
    String loginUser;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String fname = req.getParameter("fname");
        String lname = req.getParameter("lname");
        String dob = req.getParameter("dob");
        String gender = req.getParameter("gender");

        try {
            DatabaseUtil.addUser(fname, lname, username, dob, gender, password);
            req.setAttribute("fname", fname);
            req.setAttribute("lname", lname);
            req.setAttribute("username", username);
            req.setAttribute("dob", dob);
            req.setAttribute("gender", gender);
            req.setAttribute("password", password);
            req.getRequestDispatcher("course.jsp").forward(req, resp);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            loginUser = DatabaseUtil.userLogin(username, password);
            req.setAttribute("username", username);
            req.setAttribute("password", password);
            if (username.equals(loginUser)) {
                req.getRequestDispatcher("course.jsp").forward(req, resp);
            } else {
                req.getRequestDispatcher("index.jsp").forward(req, resp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

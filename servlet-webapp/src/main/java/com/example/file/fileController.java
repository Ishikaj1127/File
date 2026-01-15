package com.example.file;

import java.io.BufferedWriter;
import java.io.FileWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/submit")
public class fileController extends HttpServlet {
    String filedata;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String age = req.getParameter("age");
        try {
            String path = System.getProperty("java.io.tmpdir") + "/file.txt";
            FileWriter fw = new FileWriter(path, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Name: " + name + "\nAge: " + age + "\n");
            bw.close();
            req.getRequestDispatcher("result.jsp").forward(req, resp);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
    }
}

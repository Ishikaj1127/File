package com.example.file;

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

        String course = req.getParameter("course");
        try {
            filedata = fileRead.readFile(course);
            String videoPath = "video?filename=" + course + ".mp4";
            req.setAttribute("filedata", filedata);
            req.setAttribute("videoPath", videoPath);
            req.getRequestDispatcher("result.jsp").forward(req, resp);

        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
    }
}

package com.example.file;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import java.io.File;
import java.io.IOException;

@WebServlet("/upload")
@MultipartConfig
public class admin extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Part filePart = req.getPart("video");
        String fileName = filePart.getSubmittedFileName();
        String uploadPath = System.getProperty("java.io.tmpdir") + File.separator + fileName;
        for (Part part : req.getParts()) {
            part.write(uploadPath);
        }
        String message = "Video uploaded successfully";
        req.setAttribute("message", message);
        req.getRequestDispatcher("admin.jsp").forward(req, resp);
    }
}

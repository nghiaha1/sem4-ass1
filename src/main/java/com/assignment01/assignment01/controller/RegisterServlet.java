package com.assignment01.assignment01.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/register.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String username = req.getParameter("username");
        String email = req.getParameter("email");
        String phoneNumber = req.getParameter("phoneNumber");
        String password = req.getParameter("password");

        req.setAttribute("name", name);
        req.setAttribute("username", username);
        req.setAttribute("email", email);
        req.setAttribute("phoneNumber", phoneNumber);
        req.setAttribute("password", password);

        req.getRequestDispatcher("/register-success.jsp").forward(req, resp);
    }
}

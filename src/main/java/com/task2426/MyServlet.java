package com.task2426;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyServlet extends HttpServlet {

    private static int countDoGet = 0;
    private static int countDoPost = 0;

    @Override
    protected  void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException {

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/jsp/page.jsp");

        request.setAttribute("countDoGet", countDoGet);
        request.setAttribute("countDoPost", countDoPost);

        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        }
        countDoGet++;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        doGet(request, response);

        countDoPost++;
    }

}

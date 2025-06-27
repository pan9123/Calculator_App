package com.pankaj.servlet;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.*;

@WebServlet("/calculate")
public class CalculatorServlet extends HttpServlet {
    // your servlet logic goes here
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Step 1: Get inputs from form
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        String operation = request.getParameter("operation");

        // Step 2: Perform calculation
        int result = switch (operation) {
            case "add" -> num1 + num2;
            case "subtract" -> num1 - num2;
            case "multiply" -> num1 * num2;
            case "divide" -> (num2 != 0) ? num1 / num2 : 0;
            default -> 0;
        };

        // Step 3: Send result to browser
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>Result: " + result + "</h2>");
    }
}
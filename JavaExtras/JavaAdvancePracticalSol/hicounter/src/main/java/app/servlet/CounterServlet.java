package app.servlet;

import java.io.IOException;

import app.model.CounterModel;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/counter")
public class CounterServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CounterModel model = new CounterModel();
        int count=model.increaseCounter();

        req.setAttribute("count", count);
        req.getRequestDispatcher("counter.jsp").forward(req, resp);
    }
    
}

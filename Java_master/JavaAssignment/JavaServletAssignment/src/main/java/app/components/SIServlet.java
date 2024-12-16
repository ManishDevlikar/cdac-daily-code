package app.components;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/si")
public class SIServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/si.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double principle=Double.parseDouble(req.getParameter("principle"));
        double rate=Double.parseDouble(req.getParameter("rate"));
        int time=Integer.parseInt(req.getParameter("time"));

        double simpleInterest = (principle*rate*time)/1200;

        req.setAttribute("simpleInterest", simpleInterest);
        req.getRequestDispatcher("/si.jsp").forward(req, resp);
    }

    
    
}

package app.controller;

import java.io.IOException;

import app.entity.Books;
import app.model.BookModel;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/search")
public class Search extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        Books book = BookModel.getBookById(id);
        
       req.setAttribute("book", book);
       req.getRequestDispatcher("book.jsp").forward(req, resp);  // Redirect to book.jsp with book details
       
    }
    
}

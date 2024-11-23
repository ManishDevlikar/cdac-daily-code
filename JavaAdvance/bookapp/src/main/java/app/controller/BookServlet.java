package app.controller;

import java.io.IOException;
import java.util.List;

import app.entity.Books;
import app.model.BookModel;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/books")

public class BookServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       List<Books> books =  BookModel.getBooks();
       req.setAttribute("books", books);
       req.getRequestDispatcher("/books.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        double price = Double.parseDouble(req.getParameter("price"));
        String author = req.getParameter("author");
        
        Books book = new Books();
        book.setName(name);
        book.setPrice(price);
        book.setAuthor(author);
        
        BookModel.addBook(book);
        
        resp.sendRedirect("/books");
    }
    
}

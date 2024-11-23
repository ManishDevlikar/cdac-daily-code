package app.model;

import java.util.List;

import app.entity.Books;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class BookModel {
    
    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("app.data");
    private static EntityManager manager = factory.createEntityManager();
    private static EntityTransaction transaction = manager.getTransaction();


    public static List<Books> getBooks(){
        return manager.createQuery("SELECT b FROM Books b", Books.class).getResultList();

    }

    public static void addBook(Books book){
        transaction.begin();
        manager.persist(book);
        transaction.commit();
    }

    public static Books getBookById(int id){
        var book= (Books) manager.find(Books.class, id);

        if(book!=null){
            return book;
        }else{
            return null;
        }
    }
}

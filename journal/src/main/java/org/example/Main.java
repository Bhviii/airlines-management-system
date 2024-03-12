
package org.example;
import org.example.entities.Author;
import org.example.entities.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Configuration config = new Configuration();
        config.addAnnotatedClass(org.example.entities.Book.class);
        config.addAnnotatedClass(org.example.entities.Author.class);
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();

        try {
            session.beginTransaction();


            Book b1 = new Book();
            b1.setBookName("The 5 AM Club");

            Book b2 = new Book();
            b2.setBookName("It Starts With US");

            Book b3 = new Book();
            b3.setBookName("It Ends With US");


            Author a1 = new Author();
            a1.setAuthorName("Robin Sharma");

            Author a2 = new Author();
            a2.setAuthorName("Colleen Hoover");


            b1.setAuthor(a1);
            b2.setAuthor(a2);
            b3.setAuthor(a2);

            // Create lists for students for colleges
            List collenbooks = new ArrayList();
            collenbooks.add(b2);
            collenbooks.add(b3);

            List sharmabooks = new ArrayList();
            sharmabooks.add(b1);

            // Set lists of students for colleges
            a1.setBooks(sharmabooks);
            a2.setBooks(collenbooks);

            // Store the colleges
            session.persist(a1);
            session.persist(a2);

            session.getTransaction().commit();

        } finally{
            session.close();
            sessionFactory.close();
        }
    }
}

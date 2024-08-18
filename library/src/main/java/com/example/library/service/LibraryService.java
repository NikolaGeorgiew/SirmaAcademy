package com.example.library.service;

import com.example.library.model.Book;
import com.example.library.model.Magazine;
import com.example.library.repository.BookRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class LibraryService {

    @Autowired
    BookRepository bookRepository;

    //    @Autowired
//    public CsvService csvService;
    public List<Book> getBooks() {
        return bookRepository.findAll();

    }
//        return csvService.readBooks();
//        try (Connection connection = DriverManager.getConnection(url, user, password);
//        Statement statement = connection.createStatement()) {
//            String getBooksSQL = "SELECT * FROM books";
//            ResultSet result = statement.executeQuery(getBooksSQL);
//            List<Book> books = new ArrayList<>();
//            while (result.next()) {
//                Book book = new Book
//                        (result.getString("title")
//                                ,result.getString("author")
//                                ,Integer.parseInt(result.getString("year"))
//                                ,result.getString("isbn"));
//                books.add(book);
//            }
//            return books;
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }


    public void addBook(Book book) {
        bookRepository.save(book);
        //The old way
//        EntityManagerFactory manFactory = Persistence.createEntityManagerFactory("LibraryUnit");
//        EntityManager manager = manFactory.createEntityManager();

//        manager.getTransaction().begin();
//        manager.persist(book);
//        manager.getTransaction().commit();

        //The first way
//        try (Connection connection = DriverManager.getConnection(url, user, password);
//             Statement statement = connection.createStatement();) {
//            String createTable =
//                    "CREATE TABLE IF NOT EXISTS books (isbn INTEGER, title VARCHAR(50), author VARCHAR(50), year INTEGER, PRIMARY KEY (isbn))";
//            statement.execute(createTable);
//
//            String insertBook = "INSERT INTO books (isbn, title, author, year) VALUES ('" +
//                    book.getIsbn() + "', '" + book.getTitle() + "', '" + book.getAuthor() + "', " + book.getYear() + " )";
//            statement.execute(insertBook);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//        csvService.saveBook(book);
    }

    public void addMagazine(Magazine magazine) {
//        csvService.saveMagazine(magazine);
    }
    public List<Magazine> getMagazines() {
        return null;
//        return csvService.readMagazines();
    }
}

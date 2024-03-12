package org.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue @Column(name = "BOOK_ID")
    private int bookId;

    @Column(name = "BOOK_NAME")
    private String bookName;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "AUTHOR_FK")
    private Author author;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
package com.mabud.service;

import com.mabud.repository.BookRepository;
public class BookService {
    private BookRepository bookRepository;

    BookService(BookRepository bookRepository){
        System.out.println("Constructor Injection");
        this.bookRepository=bookRepository;
    }

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("Setter Injection");
    }

    public void display(){
        System.out.println("Hello from BookService");
    }

    public BookRepository getBookRepository() {
        return bookRepository;
    }
}

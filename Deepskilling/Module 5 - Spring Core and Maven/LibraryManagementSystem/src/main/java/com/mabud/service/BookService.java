package com.mabud.service;

import com.mabud.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class BookService {
    private BookRepository hygy;

    public void setHygy(BookRepository hygy) {
        this.hygy = hygy;
    }
}

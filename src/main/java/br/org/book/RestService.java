package br.org.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.UUID;

@Service
public class RestService {

    private BookRepository bookRepository;

    @Autowired
    public RestService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public BookEntity getBookStats(Long id){
        return bookRepository.findById(id);
    }
}
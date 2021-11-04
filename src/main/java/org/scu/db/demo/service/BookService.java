package org.scu.db.demo.service;


import org.scu.db.demo.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


public interface BookService {
    List<Book> findAllBooks();
    List<Map> query_call_and_count();

    List<Integer> findAllBorrowedBooksId();

    int countCall123Book();

    List<String> findCountNotExceed2Callnumber();

    void insertBook(Book book);

    Book findBookById(Integer bookId);

    Boolean updateBook(Book book);

    void deleteBookById(Integer bookId);


}

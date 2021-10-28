package org.scu.db.demo.service;


import org.scu.db.demo.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface BookService {
    List<Book> findAllBooks();
    List<Map> query_call_and_count();
}

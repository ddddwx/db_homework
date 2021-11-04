package org.scu.db.demo.service.impl;

import org.scu.db.demo.mapper.BookMapper;
import org.scu.db.demo.model.Book;
import org.scu.db.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

    public List<Book> findAllBooks()
    {
        return bookMapper.queryBook();
    }

    public List<Map> query_call_and_count(){
        return bookMapper.query_call_and_count();
    }

    public List<Integer> findAllBorrowedBooksId(){
        return bookMapper.findAllBorrowedBooksId();
    }

    public int countCall123Book(){
        return bookMapper.countCall123Book();
    }

    public List<String> findCountNotExceed2Callnumber(){
        return bookMapper.findCountNotExceed2Callnumber();
    }

    public void insertBook(Book book){
        bookMapper.insertBook(book);
    }

    public Book findBookById(Integer bookId){
        return bookMapper.findBookById(bookId);
    }

    public Boolean updateBook(Book book){
        return bookMapper.updateBook(book);
    }

    public void deleteBookById(Integer bookId){
        bookMapper.deleteBookById(bookId);
    }




}

package org.scu.db.demo.controller;

import org.scu.db.demo.model.Book;
import org.scu.db.demo.service.BookService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/example")
public class ExampleController {
    @Resource
    private BookService bookService;

    @RequestMapping("/1")
    public List<Book> example1(){
        List<Book> book = bookService.findAllBooks();
        return book;
    }

    @RequestMapping("/2")
    public String example2() {
        return "hello";
    }

    @RequestMapping("/3")
    public List<Map> example3(){
        List<Map> result = bookService.query_call_and_count();
        return result;
    }
}

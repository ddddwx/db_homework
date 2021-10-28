package org.scu.db.demo.controller;

import org.scu.db.demo.model.Title;
import org.scu.db.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/homework")
public class HomeworkController {


    @Autowired
    private BookService bookService;


    @RequestMapping("/1")
    public List<Integer> homework1(){
        //TODO:请完成相关代码实现下述查询要求：
        //查询所有被借走图书的Book_ID。(对应第2题)
        // 接口名：findAllBorrowedBooksId()
        List<Integer> bookId;

        //------------在此之下写下执行代码--------------



        //-----------在此之上写下执行代码---------------
        return bookId;//TODO:修改返回值为bookId
    }

    @RequestMapping("/2")
    public List<Title> homework2(){
        //TODO:请完成相关代码实现下述查询要求：
        //查询书名为”Iliad”或”Odyssey”的书目信息。(对应第4题)
        // 接口名：findIliadOrOdysseyTitle
        List<Title> titles;

        //------------在此之下写下执行代码--------------



        //-----------在此之上写下执行代码---------------
        return titles;//TODO:修改返回值为titles
    }


    @RequestMapping("/3")
    public Integer homework3(){
        //TODO:请完成相关代码实现下述查询要求：
        //查询callnumber为”Call123”的图书有多少本。(对应第5题)
        //接口名：countCall123Book()
        Integer count;

        //------------在此之下写下执行代码--------------



        //-----------在此之上写下执行代码---------------
        return count;//TODO:修改返回值为books
    }

    @RequestMapping("/4")
    public List<String> homework4(){
        //TODO:请完成相关代码实现下述查询要求：
        //查询本数不超过2本的图书的callnumber号。(对应第7题)
        // 接口名：findCountNotExceed2Callnumber
        List<String> callnumbers;
        //------------在此之下写下执行代码--------------


        //-----------在此之上写下执行代码---------------
        return callnumbers;//TODO:修改返回值为books
    }


}

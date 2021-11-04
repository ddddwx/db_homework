package org.scu.db.demo.controller;


import org.scu.db.demo.model.Book;
import org.scu.db.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(path = "/")
public class ThymeleafController {

    @Autowired
    BookService bookService;

    @RequestMapping(path = "/index" , method = RequestMethod.GET)
    public String getHtml(Model model){
        model.addAttribute("books" ,bookService.findAllBooks());
        return "index";
    }

    //链接到添加页面
    @RequestMapping(path = "/add" , method = RequestMethod.GET)
    public String add(ModelMap modelMap){
        Book book=new Book();
        modelMap.addAttribute("book",book);
        return "add";
    }

    //向数据库中插入数据
    @RequestMapping(path = "/insert", method = RequestMethod.POST)
    public ModelAndView insert(@ModelAttribute Book book){
        bookService.insertBook(book);
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("books" ,bookService.findAllBooks());
        return mav;
    }

    //链接到编辑页面
    @RequestMapping(path="/edit", method = RequestMethod.GET)
    public String edit(ModelMap modelMap ,@RequestParam(name = "id") Integer id){

        modelMap.addAttribute("book",bookService.findBookById(id));
        return "update";
    }
    //更新数据库中的数据
    @RequestMapping(path = "/update" ,method = RequestMethod.POST)
    public ModelAndView update(@ModelAttribute Book book){
        Boolean result;
        result = bookService.updateBook(book);
        ModelAndView mav=new ModelAndView("index");
        mav.addObject("books" ,bookService.findAllBooks());
        return mav;
    }

    //搜索指定数据
    @RequestMapping(path = "/search" , method = RequestMethod.GET)
    public ModelAndView getIndex(@RequestParam("id") Integer id){
        ModelAndView mav=new ModelAndView("index");
        mav.addObject("books",bookService.findBookById(id));
        mav.addObject("keyValue",id);
        return mav;
    }

    //删除指定数据
    @RequestMapping(path = "/del")
    public String del(@RequestParam(name = "bookId") Integer bookId){
        bookService.deleteBookById(bookId);
        return "redirect:/index";
    }
}

package com.ybs.ssm.controller.book;

import com.ybs.ssm.custom.parameter.reslover.TestObj;
import com.ybs.ssm.service.book.BookService;
import com.ybs.ssm.vo.book.BookVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/book/")
public class BookController {

    private static Logger logger = LoggerFactory.getLogger(BookController.class);

    @Autowired
    private BookService bookService;

    @RequestMapping("/list")
    public String queryBookList(Model model,BookVO bookvo) {
        List<BookVO> bookVOS = bookService.queryBookList();
        logger.info("BookController using test info level");
        model.addAttribute("list",bookVOS);
        return "book";
    }

    @RequestMapping("/update/{id}")
    public String updateBookById(@PathVariable("id") Long id, ModelAndView model){
        bookService.updateBookById(id);
        model.addObject("message","update success");
        return "book";
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    @ResponseBody
    public BookVO saveBook(@Valid @RequestBody BookVO bookVO, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            System.out.println(bindingResult.getFieldError().getDefaultMessage());
            return null;
        }
        bookService.saveBook(bookVO);
        return bookVO;
    }

    @RequestMapping(value = "/save2",method = RequestMethod.POST)
    @ResponseBody
    public BookVO saveBook2( @TestObj BookVO bookVO){
        bookService.saveBook(bookVO);
        return bookVO;
    }


}

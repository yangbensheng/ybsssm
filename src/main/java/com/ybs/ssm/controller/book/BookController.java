package com.ybs.ssm.controller.book;

import com.ybs.ssm.service.book.BookService;
import com.ybs.ssm.vo.book.BookVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book/")
public class BookController {

    private static Logger logger = LoggerFactory.getLogger(BookController.class);

    @Autowired
    private BookService bookService;

    @RequestMapping("/list")
    public String queryBookList(Model model) {
        List<BookVO> bookVOS = bookService.queryBookList();
        logger.info("BookController using test info level");
        model.addAttribute("list",bookVOS);
        return "book";
    }
}

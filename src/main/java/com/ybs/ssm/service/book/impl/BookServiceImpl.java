package com.ybs.ssm.service.book.impl;

import com.ybs.ssm.dao.book.BookDao;
import com.ybs.ssm.service.book.BookService;
import com.ybs.ssm.vo.book.BookVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private static Logger logger = LoggerFactory.getLogger(BookServiceImpl.class);

    @Autowired
    private BookDao bookDao;

    @Override
    public List<BookVO> queryBookList() {
        logger.error("BookServiceImpl using test error level");
        return bookDao.queryBookList();
    }
}

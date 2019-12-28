package com.ybs.ssm.service.book;

import com.ybs.ssm.vo.book.BookVO;

import java.util.List;

public interface BookService {

    List<BookVO> queryBookList();

    void updateBookById(Long id);

    void saveBook(BookVO bookVO);
}

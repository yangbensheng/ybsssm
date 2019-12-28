package com.ybs.ssm.dao.book;

import com.ybs.ssm.vo.book.BookVO;

import java.util.List;

public interface BookDao {

    List<BookVO> queryBookList();

    void updateBookById(Long bookId);

    void saveBook(BookVO bookVO);
}

package com.ybs.ssm.vo.book;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Min;
import java.util.Date;

public class BookVO {
    private Long bookId;

    @NotEmpty(message = "请输入有效值")
    private String name;
    @Min(value = 1,message = "最小值不能为1")
    private int number;

    private Date createTime;

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "BookVO{" +
                "bookId=" + bookId +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", creatTime=" + createTime +
                '}';
    }
}

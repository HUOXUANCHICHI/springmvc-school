package com.ablaze.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Author: ablaze
 * @Date: 2022/09/21/10:29
 */
@Getter
@Setter
@ToString
public class Book {

    private Integer bookId;

    private String bookName;

    private Double price;
    private String isbn;
    private String writer;
    /**
     * 库存
     */
    private String total;

    /**
     * 出版社
     */
    private String pubName;

    /**
     * 适用人群
     */
    private String nature;

}

package com.ablaze.pojo;

import lombok.*;

import java.util.List;

/**
 * @Author: ablaze
 * @Date: 2022/09/21/10:29
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
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
    private String pub;

    /**
     * 适用人群
     */
    private String nature;
    /**
     * 适用人群 school
     */
    private List<String> group;
    /**
     * 库存 school
     */
    private String has;

    /**
     * 图书类型
     */
    private int type;

}

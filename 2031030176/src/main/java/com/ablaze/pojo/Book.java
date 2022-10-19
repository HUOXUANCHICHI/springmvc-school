package com.ablaze.pojo;

import lombok.*;

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

    private String bookType;

    private String author;

    private Integer price;

    private String isbn;

    /**
     * 现存量
     */
    private Integer nowNumber;

    /**
     * 总库存
     */
    private Integer total;

    /**
     * 出版社
     */
    private String pubName;

    /**
     * 书架
     */
    private String caseName;

}

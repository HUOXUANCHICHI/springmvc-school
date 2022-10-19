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
public class User {

    private Integer userId;

    /**
     * 昵称
     */
    private String userName;

    /**
     * 性别 单选
     */
    private String gender;

    /**
     * 真实姓名
     */
    private String name;

    private String telephone;

    /**
     * 学历 下拉
     */
    private String degree;
    /**
     * 爱好 多选
     */
    private List<String> hobby;

    /**
     * 备注
     */
    private String comments;

    /**
     * 状态
     */
    private String state;
}

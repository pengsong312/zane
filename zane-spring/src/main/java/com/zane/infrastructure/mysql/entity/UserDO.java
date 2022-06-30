package com.zane.infrastructure.mysql.entity;

import lombok.Data;

/**
 * @author: ps
 * @since: 2022/6/30  3:36 PM
 * @version: 1.0.0
 */
@Data
public class UserDO {
    private Integer id;
    private String name;
    private Integer age;
}

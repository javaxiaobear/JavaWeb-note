package com.xiaobear.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author XiaoBear
 * @version 1.0
 * @date 2020/4/30 0030
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Integer id;
    private String username;
    private String password;
    private Integer age;
    private String phone;
}

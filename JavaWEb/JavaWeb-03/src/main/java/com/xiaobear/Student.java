package com.xiaobear;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author XiaoBear
 * @version 1.0
 * @date 2020/4/26 0026
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String name;
    private Integer id;
    private Integer age;
    private String phone;
}

package com.xiaobear.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

/**
 * @author XiaoBear
 * @version 1.0
 * @date 2020/4/27 0027
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private Integer id;
    private String[] phone;
    private List<String> city;
    private Map<String,Object> map;
}

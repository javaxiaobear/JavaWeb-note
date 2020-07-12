package com.xiaobear.test;

import com.google.gson.Gson;
import com.xiaobear.pojo.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author XiaoBear
 * @version 1.0
 * @date 2020/5/6 0006 22:17
 */
public class JsonTest {
    @Test
    public void test1(){
        Person person = new Person();
        Gson gson = new Gson();
        // toJson 方法可以把java 对象转换成为json 字符串
        String json = gson.toJson(person);
        System.out.println(json);
        // fromJson 把json 字符串转换回Java 对象
        // 第一个参数是json 字符串
        // 第二个参数是转换回去的Java 对象类型
        Person person1 = gson.fromJson(json, Person.class);
        System.out.println(person1);
    }

    @Test
    public void test2(){
        List<Person> list = new ArrayList<Person>();
        list.add(new Person(1,"yhx"));
        list.add(new Person(2,"lwh"));
        Gson gson = new Gson();
        String json = gson.toJson(list);
        System.out.println(json);
    }

    @Test
    public void test3(){
        Map<Integer, Person> map = new HashMap<Integer, Person>();
        map.put(1,new Person(3,"333"));
        map.put(2,new Person(4,"444"));
        Gson gson = new Gson();
        // 把map 集合转换成为json 字符串
        String s = gson.toJson(map);
        System.out.println(s);
    }
}

package com.xiaobear.test;

import org.junit.Test;

import java.util.UUID;

/**
 * @author xiaobear
 * @version 1.0
 * @date 2020/6/4 0004 18:53
 */
public class MyTest {

    @Test
    public void test(){
        UUID uuid = UUID.randomUUID();
        String s = uuid.toString();
        String replace = s.replace("-", "");
        String s1 = replace.toUpperCase();
        System.out.println(s1);

    }
}

package com.xiaobear.test;

import org.junit.Test;

import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;


/**
 * @author XiaoBear
 * @version 1.0
 * @Description
 * @date 2020/5/22 0022 12:11
 */
public class URLEncoderTest {

    @Test
    public void Test(){
        try{
            String str = "鄢汉雄";
            String encode = URLEncoder.encode(str,"UTF-8");
            System.out.println("编码为："+encode);
            String decode = URLDecoder.decode(encode, "UTF-8");
            System.out.println("解码为："+decode);
        }catch (IOException e){
            e.printStackTrace();
        }


    }

}

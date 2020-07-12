package com.xiaobear.test;

import org.junit.Test;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author XiaoBear
 * @version 1.0
 * @date 2020/5/8 0008 11:10
 */
public class I18nTest {

    @Test
    public void LocaleTest(){
        Locale locale = Locale.getDefault();
        System.out.println(locale);
        //遍历不同国家的locale
        for (Locale availableLocale : Locale.getAvailableLocales()) {
            System.out.println(availableLocale);
        }
        // 获取中文，中文的常量的Locale 对象
        System.out.println(Locale.CHINA);
        // 获取英文，英文的常量的Locale 对象
        System.out.println(Locale.US);
    }
    @Test
    public void testI18n(){
        // 得到我们需要的Locale 对象
        Locale locale = Locale.CHINA;
        // 通过指定的basename 和Locale 对象，读取相应的配置文件
        ResourceBundle resourceBundle = ResourceBundle.getBundle("i18n", locale);
        System.out.println("username: "+resourceBundle.getString("username"));
        System.out.println("password: "+resourceBundle.getString("password"));
        System.out.println("girl: "+resourceBundle.getString("girl"));
        System.out.println("boy: "+resourceBundle.getString("boy"));
    }
}

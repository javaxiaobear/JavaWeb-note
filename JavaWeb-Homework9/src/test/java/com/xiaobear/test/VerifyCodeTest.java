package com.xiaobear.test;
import	java.awt.Color;

import org.junit.Test;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

/**
 * @author xiaobear
 * @version 1.0
 * @date 2020/6/4 0004 19:19
 */
public class VerifyCodeTest {
    @Test
    public void fun() throws IOException {
        BufferedImage image = new BufferedImage(70,35,BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics = (Graphics2D) image.getGraphics();
        graphics.setColor(Color.WHITE);
        graphics.fillRect(0,0,70,35);
        graphics.setColor(Color.pink);
        graphics.drawString("Hello,xiaobear!",2,35-2);
        ImageIO.write(image,"JPEG",new FileOutputStream("D:/xiaobear.jpg"));
    }


}

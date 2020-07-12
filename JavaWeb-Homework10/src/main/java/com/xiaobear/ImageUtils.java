package com.xiaobear;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import	java.util.Random;

import java.awt.*;

/**
 * @author xiaobear
 * @version 1.0
 * @date 2020/6/5 0005 15:57
 */
public class ImageUtils {

    /**
     * 随机对象
     */
    private Random random = new Random();
    /**
     * 验证码宽度
     */
    private static int WIDTH = 100;
    /***
     * 验证码高度
     */
    private static int HEIGHT = 50;
    /**
     * 背景颜色
     */
    Color bk = new Color(255,255,255);
    /**
     * 存储文本
     */
    private String text;
    /**
     * 可选字符串
     */
    String chars = "23456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    /**
     * 随机颜色
     * @return color
     */
    private Color randomColor() {
        int r = random.nextInt(256);
        int g = random.nextInt(256);
        int b = random.nextInt(256);
        return new Color(r, g, b);
    }

    /**
     * 随机字体
     * @return font
     */
    private static Font getRandomFont() {
        String[] fonts = {"Georgia", "Verdana", "Arial", "Tahoma", "Time News Roman", "Courier New", "Arial Black", "Quantzite"};
        int fontIndex = (int)Math.round(Math.random() * (fonts.length - 1));
        int fontSize = (int) Math.round(Math.random() * 4 + 16);
        return new Font(fonts[fontIndex], Font.PLAIN, fontSize);
    }

    /**
     * 干扰线
     * @param img
     */
    public void threeLine(BufferedImage img){
        Graphics2D g = (Graphics2D) img.getGraphics();
        for (int i = 0; i < 10; i++) {
            int x = random.nextInt(WIDTH);
            int y = random.nextInt(HEIGHT);
            int x1 = random.nextInt(WIDTH);
            int y1 = random.nextInt(HEIGHT);
            g.setColor(randomColor());
            g.drawLine(x, y, x1, y1);
        }
    }

    /**
     * 生成随机字符串
     * @return
     */
    private char randomChar(){
        int len = chars.length();
        int index = random.nextInt(len);
        char c = chars.charAt(index);
        return c;
    }

    /**
     * 创建画布
     * @return
     */
    public BufferedImage createImage(){
        BufferedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics = (Graphics2D) image.getGraphics();
        graphics.setColor(bk);
        graphics.fillRect(0,0,WIDTH,HEIGHT);
        return image;
    }


    /**
     * 获取画布
     * @return
     */
    public BufferedImage getImage(HttpServletRequest request, HttpServletResponse response) {
        BufferedImage image = createImage();
        Graphics2D g = (Graphics2D) image.getGraphics();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            String s = randomChar() + "";
            builder.append(s);
            float v = i * 1.0f * WIDTH / 4;
            g.setFont(getRandomFont());
            g.setColor(randomColor());
            g.drawString(s,v,HEIGHT-2);
        }
        text = builder.toString();
        /**
         * request.getSession().setAttribute("value",text);
         * 将text的值存入session()
         */
        request.getSession().setAttribute("value",text);
        threeLine(image);
        return image;
    }
    public String getText() {
        return text;
    }

    /**
     *显示画布
     * @param img
     * @param out
     */
    public static void output(BufferedImage img, OutputStream out) throws IOException {
        ImageIO.write(img,"JPEG",out);
    }
}

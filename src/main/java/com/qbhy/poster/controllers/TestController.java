package com.qbhy.poster.controllers;

import com.qbhy.poster.drawable.Image;
import com.qbhy.poster.drawable.Poster;
import com.qbhy.poster.drawable.Text;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.ArrayList;

/**
 * @author: jingteng
 * @date: 2019/7/9 17:17
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestController {

    @Test
    public void test(){
        Poster poster = new Poster();
        poster.setWidth(200);
        poster.setHeight(200);
        poster.setBackgroundColor("#ffffff");
        ArrayList<Text> text = new ArrayList<>();
        Text text1 = new Text();
        text1.setX(100);
        text1.setY(100);
        text1.setWidth(100);
        text1.setLineHeight(100);
        text1.setColor("#F66");
        text1.setText("测试文本测试文本");
        text1.setOpacity(3);
        text.add(text1);

        poster.setTexts(text);
        ArrayList<Image> imgs = new ArrayList<>();
        Image image = new Image();
        image.setX(0);
        image.setY(0);
        image.setWidth(200);
        image.setHeight(200);
        image.setBorderRadius(5);
        image.setUrl("https://zk-backend.oss-cn-beijing.aliyuncs.com/dichan/partner/1562552976059.png");

        imgs.add(image);
        poster.setImages(imgs);
//        poster.setBlocks();
//        poster.setLines();


        try {
            poster.draw();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

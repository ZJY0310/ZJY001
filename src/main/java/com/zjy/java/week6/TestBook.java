package com.zjy.java.week6;

import javax.naming.Name;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 */
import java.time.temporal.ValueRange;
import java.util.Date;
import java.util.SimpleTimeZone;

/**
 * @ClassName TestBook
 * @Description TODO
 * @Author Z
 * @Date 2020/10/15
 **/

public class TestBook {
    public static void main(String[] args) {
        Book book = new Book();
        //book.setBookName("Java");
        // book.setPrice(100);
        // book.getPublishDate(new Date());

        System.out.println(book);
    }
}

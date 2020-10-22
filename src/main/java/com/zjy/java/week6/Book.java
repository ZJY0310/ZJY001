package com.zjy.java.week6;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName Book
 * @Description 图书类
 * @Author Z
 * @Date 2020/10/15
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private String bookName;
    private Integer price;
    private Date publishDate;
/*
    @Override
    public String toString() {
      //  DateFormat df = new SimpleDateFormat(Pattern:"yyyy-MM-dd HH:MM:SS");
       // String now = df.format(this.publishDate);
        // String s1 = "book{name:%s,date:%s}";
        // return this.bookName,this.price,now;
    }*/
}

package com.zjy.java.week6;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * @ClassName TestOop
 * @Description TODO
 * @Author Z
 * @Date 2020/10/15
 **/

public class TestOop {
        public static void main(String[] args) {

            Student student = Student.builder()
                    .id("10001101")
                    .studentName("Amy")
                    .gender("female")
                    .phone(Phone.builder().brand("iPhone").price(1234).build())
                    .build();
            Book[] books = new Book[]{
                    Book.builder().bookName("Java").build(),
                    Book.builder().bookName("JavaWeb").build(),
                    Book.builder().bookName("JavaScript").build()
            };
            List<Book> bookList = new ArrayList<>(Arrays.asList(books));
            student.setBooks(books);
            for (Book book : student.getBooks()) {
                System.out.println(book.getBookName());
            }


        }
    }
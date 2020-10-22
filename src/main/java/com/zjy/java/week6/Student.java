package com.zjy.java.week6;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName student
 * @Description TODO
 * @Author Z
 * @Date 2020/10/15
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String studentName;
    private String gender;
    private String id;
    private Phone phone;
    private Book[] books;
}


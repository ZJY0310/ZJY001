package com.zjy.java.week6;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Phone:手机类
 * @Author 张纪媛
 * @Date 2020/10/15
 **/

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Phone {
    private String brand;
    private Integer price;
}

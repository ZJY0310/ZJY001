//package com.week7;
//
//import javax.jws.soap.SOAPMessageHandlers;
//import java.util.Scanner;
//
///**
// * @ClassName Overload重载练习, 方法的重载
// * @Description TODO
// * @Author Z
// * @Date 2020/10/22
// **/
//
//public class OverloadTest {
//    public static int sum(int a, int b) {
//
//        return a + b;
//
//
//    }
//    public static String add(int a, int b) {
//        a = a + b;
//        int s, m, hour;
//        m = a / 60;
//        s = a % 60;
//        hour = m / 60;
//        m = m % 60;
//        return hour + "时" + m + "分" + s + "秒";
//
//    }
//
//    public static String sum(String s1, String s2, String s3) {
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append(s1);
//        stringBuilder.append(s2);
//        stringBuilder.append(s3);
//        return stringBuilder.toString();
//        //return s1 + s2 + s3;
//    }
//
//    //课堂练习，计算两个秒数相加的结果
//
//
//    public static void main(String[] args) {
//        //System.out.println(sum(a:4, b:5));
//        //System.out.println(sum("aaa", "bb", "ccc"));
//        Scanner input = new Scanner(System.in);
//        System.out.println("输入第一个秒数：");
//        int a1 = input.nextInt();
//        System.out.println("输入第二个秒数：");
//        int a2 = input.nextInt();
//
//        //System.out.println(OverloadTest.sum(a1, a2));
//
//            System.out.println(add(a1,a2));
//
//
//    }
//}

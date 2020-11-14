package week9;

import javax.lang.model.util.ElementScanner6;
import javax.swing.*;
import java.util.Scanner;

/**
 * @ClassName RuntimeExpection 运行时异常
 * @Description TODO
 * @Author Z
 * @Date 2020/11/5
 **/

public class RuntimeExpection {
    public static void main(String[] args) {
//        //1.算数异常  ArithmeticException
//        try {
//            System.out.println(3 / 0);
//        } catch (ArithmeticException e) {
////            e.printStackTrace();
//            System.err.println("除数不能为0！");
////            System.err.println(e.getMessage());
////            System.err.println(e.getCause());
////            System.err.println(e);
////            e.printStackTrace();
////            JOptionPane.showMessageDialog(null,"除数不能为0！");
//        }
//        System.out.println("************");
//
        //2.从键盘输入一串字符，将其转为整型输出:NumberFormatException
        System.out.println("Please input:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int result = 0;
        try {
            result = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.err.println("数字格式化异常");
        }finally {
            //应用场景：关闭数据库连接，线程资源的释放
            System.out.println("finish");
        //    Scanner.close();
        }
        //int result = Integer.parseInt(str);
        System.out.println(result);
        System.out.println("************");
        //  System.out.println("其他段代码");
    }

        //3.仿照完成ArrayIndexPutOfBoundsExpection的异常处理


        //4.关于空指针异常NullPointerExpection（NPE）的问题
        // String s = null;
//    if(s.equals("admin")){
//        System.out.println("success");
//    }esle{
//        System.out.println("failure");
//    }
//        String s = null;
//        if (s == null || s.equals("")) {
//            System.out.println("对象为空");
//        }
//    }
}

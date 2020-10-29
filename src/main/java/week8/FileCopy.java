package week8;

import java.io.*;
import java.util.Arrays;
import java.util.UUID;

/**
 * @ClassName FileCopy使用IO流实现文件的复制
 * @Description TODO
 * @Author Z
 * @Date 2020/10/29
 **/

public class FileCopy {
    public static void main(String[] args)throws IOException {
        //编写代码，使用Reader、Writer抽象类以及它们的实现子类FileReader、FileWriter实现文本文件的复制
        //1 将源文件读入内存数组
        File file1=new File("E:/乱/小媛的照片/1.txt");
        try (Reader is = new FileReader(file1)) {
            char[] ff=new char[(char)file1.length()];
            int readResult=is.read(ff);
            String s=new String(ff,0,readResult);
            System.out.println(s);

        //2 将内存数组中的值写到目标文件
        File file2=new File("E:/乱/小媛的照片"+ UUID.randomUUID().toString()+".txt");
        Writer os=new FileWriter(file2);
        os.write(ff);

        os.close();
        is.close();
    }
}}

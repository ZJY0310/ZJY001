package week9;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @ClassName CheckedExceptionTest 编译时(kec
 * @Description TODO
 * @Author Z
 * @Date 2020/11/5
 **/

public class CheckedExceptionTest {
    public static void main(String[] args) {
        //以下两种方式可以得到服务器端long类型的时间戳
        //System.out.println(new Date().gettime);
        //System.out.println(System.currentTimeMillis());
        long timeStamp = System.currentTimeMillis();
        //将其转为yyyy-MM-dd HH:mm:ss格式
        //-----------使用Date和SimpleDateFormat实现：线程不安全------------
        //1.格式化对象
        // long seconds = timeStamp / 1000;
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //2.传入时间戳，创建Date对象
        Date date = new Date(timeStamp);
        //3.格式化date对象
        String str = df.format(date);
        System.out.println(str);
        System.out.println("*****************");

        //-----------使用Date和SimpleDateFormat实现：线程安全------------
        Instant instant= Instant.ofEpochMilli(timeStamp);
        ZoneId zone=ZoneId.systemDefault();
        LocalDateTime localDateTime=LocalDateTime.ofInstant(instant,zone);
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String result=localDateTime.format(formatter);
        System.out.println(result);

        //1.InterruptendException
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.err.println("中断异常");
            //e.printStackTrace();
        }
        System.out.println(System.currentTimeMillis());

//        //每隔3秒产生一个100以内的随机整数
//        try{
//            Thread.sleep(1800);
//        }catch(InterruptedException e){
//            System.out.println(Math.random()*100);
//        }
//        System.out.println(System.currentTimeMillis());
//    }
   }
}

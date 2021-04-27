package cn.itcast_03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @auther Star_River
 * @date 2021/2/19-15:56
 *
 * 在try里面发现问题后，jvm会帮我们生成一个异常对象，然后把这个对象抛出，和catch里面的类进行匹配。
 * 如果该对象时某个类型的，就会执行该catch里面的处理信息
 * 异常中要了解的几个方法：
 * public String getMessage():异常的消息字符串
 * public String toString():返回异常的简单信息描述
 *       此对象的类的name（全路径名）
 *       “：”冒号和一个空格
 *       调用此对象getLocalizedMessage()方法的结果（默认返回的是getMessage()的内容）
 * printStackTrace()
 * 获取异常类名和异常信息，以及异常出现在程序中的位置。返回值void。把信息输出在控制台
 *
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        String s = "2014-11-20";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try{
            Date d = sdf.parse(s);
            System.out.println(d);
        }catch(ParseException e ){
            //e.printStackTrace();

            //getMessage()
            //System.out.println(e.getMessage());
            //Unparseable date: "2014-11-20"

            //toString()
            //System.out.println(e.toString());

            //
        }
        System.out.println("over");
    }
}

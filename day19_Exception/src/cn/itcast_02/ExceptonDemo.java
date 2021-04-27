package cn.itcast_02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @auther Star_River
 * @date 2021/2/19-11:22
 * 编译时期和运行时期的区别
 * 编译时期异常：Java程序必须显示处理，否则程序就会发生错误，无法通过编译
 * 运行时期异常：无需显示处理，也可以和编译时一样处理
 */
public class ExceptonDemo {
    public static void main(String[] args) {
        String s = "2021-11-20";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try{
            Date d = sdf.parse(s);
            System.out.println(d);
        }catch (ParseException e){
            e.printStackTrace();
        }
    }
}

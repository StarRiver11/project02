package cn.itcast_01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @auther Star_River
 * @date 2021/3/3-10:20
 * 加入异常处理的字节输出流操作
 */
public class FileOutputStreamDemo4 {
    public static void main(String[] args) {
//        //创建字节输出流对象
//        FileOutputStream fos = null;
//        try {
//            fos = new FileOutputStream("fos4.txt");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        //写数据
//        try {
//            fos.write("java".getBytes());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        //关闭连接
//        try {
//            fos.close ();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        //一起处理异常
//        try{
//            FileOutputStream fos = new FileOutputStream("fos4.txt");
//            fos.write("java11".getBytes());
//            fos.close();
//        }catch(FileNotFoundException e){
//            e.printStackTrace();
//        }catch (IOException e){
//            e.printStackTrace();
//        }

        //最终版
        //为了在finally里面能够看到该对象就必须定义在外面，为了访问不出问题，还必须给初始值
        FileOutputStream fos = null;
        try{
            fos = new FileOutputStream("fos4.txt");
            fos.write("java11".getBytes());
            fos.close();
        }catch(FileNotFoundException e){
        e.printStackTrace();
        }catch (IOException e){
        e.printStackTrace();
        }finally{
            if(fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}

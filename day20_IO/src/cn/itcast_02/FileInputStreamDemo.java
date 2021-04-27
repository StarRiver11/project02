package cn.itcast_02;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @auther Star_River
 * @date 2021/3/3-11:34
 * 字节输入流的操作步骤：
 *  A：创建字节输入流对象
 *  B：调用read()方法读取数据，并把数据显示在控制台上
 *  C：释放资源
 *
 *  读取数据的方式：
 *  A：int read():一次读取一个字节
 *  B：int read(byte[] b)一次读取一个字节数组
 */
public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("fos.txt");
        //调用read方法读取数据，并把数据显示在控制台上
//        //第一次读取
//        int by = fis.read();
//        System.out.println(by);
//        System.out.println((char)by);
//
//        //第二次读取
//        by = fis.read();
//        System.out.println(by);
//        System.out.println((char)by);

        //循环改进
//        int by = fis.read();
//        while(by!=-1){
//            System.out.print((char)by);
//            by = fis.read();
//        }

        //最终版代码
        int by = 0;
        //读取、赋值、判断
        while((by = fis.read()) !=-1){
            System.out.print((char)by);
        }
        //释放资源
        fis.close();

}


}

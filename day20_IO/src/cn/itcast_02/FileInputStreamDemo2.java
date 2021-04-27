package cn.itcast_02;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @auther Star_River
 * @date 2021/3/3-11:52
 * 一次性读取一个字节数组：int read(byte[] b)
 */
public class FileInputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        //创建字节输入流对象
        FileInputStream fis = new FileInputStream("fos.txt");
        //读取数据
        //定义一个字节数组
        //第一次读取
//        byte[] bys = new byte[5];
//        int len = fis.read(bys);
////        System.out.println(len);
////        System.out.println(new String(bys));
//        System.out.println(new String(bys,0,len));

//        byte[] bys = new byte[1024];
//        int len = 0;
//        while((len = fis.read(bys))!=-1){
//            System.out.println(new String(bys,0,len));
//        }
//        fis.close();


        byte[] bys = new byte[1024];
        int len = 0;
        while((len = fis.read(bys)) != -1){
            System.out.println(new String(bys,0,len));
        }
    }

}

package cn.itcast_06;

import java.io.*;

/**
 * @auther Star_River
 * @date 2021/3/4-11:09
 * 需求：把D:\demo\总结.avi 复制到当前目录下的copy.mp4中
 * 字节流四种方式复制文件：
 * 基本字节流一次读取一个字节：//89498毫秒
 * 基本字节流一次读取一个字节数组：共耗时39369毫秒
 * 高效字节流一次读取一个字节：共耗时623毫秒
 * 高效字节流一次读取一个字节数组：共耗时34毫秒
 */
public class CopyMp4Demo {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
//        method1("D:\\demo\\总结.avi","copy1.avi");
//        method2("D:\\demo\\总结.avi","copy1.avi");
//        method3("D:\\demo\\总结.avi","copy1.avi");
        method4("D:\\demo\\总结.avi","copy1.avi");
        long end = System.currentTimeMillis();
        System.out.println("共耗时"+(end-start)+"毫秒");
    }
    //高效字节流一次读取一个字节数组：
    public static void method4(String srcString,String destString) throws IOException{
        //获取数据源
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcString));
        //获取目的地
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destString));
        //复制
        byte[] bys = new byte[1024];
        int len = 0;
        while((len=bis.read(bys))!=-1){
            bos.write(bys);
        }
        //关闭
        bos.close();
        bis.close();
    }

    //高效字节流一次读取一个字节：
    public static void method3(String srcString,String destString)throws IOException{
        //获取数据源
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcString));
        //获取目的地
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destString));

        //复制
        int by = 0;
        while((by = bis.read())!=-1){
            bos.write(by);
        }
        //关闭
        bos.close();
        bis.close();

    }

    //基本字节流一次读取一个字节数组：
    public static void method2(String srcString,String destString)throws IOException{
        //获取数据源
        FileInputStream fis = new FileInputStream(srcString);
        FileOutputStream fos = new FileOutputStream(destString);
        //复制
        byte[] bys = new byte[1024];
        int len = 0;
        while((fis.read())!=-1){
            fos.write(bys,0 ,len);
        }
        //关闭数据源
        fos.close();
        fis.close();
    }
    //基本字节流一次读取一个字节：
    public static void method1(String srcString, String destString) throws IOException {

        //获取数据源
        FileInputStream fis = new FileInputStream(srcString);
        //目的地：
        FileOutputStream fos = new FileOutputStream(destString);

        //复制视频
        int by = 0;
        while((by = fis.read())!=-1){
            fos.write(by);
        }
        //关闭流
        fos.close();
        fis.close();
    }

}

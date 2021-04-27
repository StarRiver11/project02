package cn.test;

import java.io.*;

/**
 * @auther Star_River
 * @date 2021/4/25-15:42
 *
 * 复制图片
 *    分析：
 *         复制数据，如果我们知道用记事本打开并能够读懂，就用字符流，否则用字节流
 *         通过该原理，我们知道我们该用字节流。
 *         而字节流有4种方式，所以做这个题目我们有4种方式，推荐掌握第4种
 *    数据源：
 *           c:\\a.jpg -- FileInputStream -- BufferedInputStream
 *    目的地：
 *           d:\\b.jpg -- FileOutputStream -- BufferedOutputStream
 *
 *  */
public class CopyImageDemo {
    public static void main(String[] args) throws IOException {
        //使用字符串作为路径
        //String srcString = "c:\\a.jpg"
        //String destString = "d:\\b.jpg"
        //使用File对象作为参数
        File srcFile = new File("c:\\a.jpg");
        File destFile = new File("d:\\b.jpg");

//        method1(srcFile,destFile);
//        method2(srcFile,destFile);
//        method3(srcFile,destFile);
        method4(srcFile,destFile);
    }
    //字符缓冲流一次读写一个字节数组
    private static void method4(File srcFile,File destFile) throws IOException{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));
        byte[] bys = new byte[1024];
        int len = 0;
        while((len = bis.read(bys))!=-1) {
            bos.write(bys,0,len);
        }
        bos.close();
        bis.close();

    }
    //字节缓冲流一次读写一个字节
    private static void method3(File srcFile, File destFile) throws IOException{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));
        int by = 0;
        while((by = bis.read())!=-1){
            bos.write(by);
        }
        bos.close();
        bis.close();
    }
    //基本字节流一次读取一个字节数组
    private static void method2(File srcFile,File destFile) throws IOException{
        FileInputStream fis = new FileInputStream(srcFile);
        FileOutputStream fos = new FileOutputStream(destFile);

        byte[] bys = new byte[1024];
        int len = 0;
        while((len = fis.read(bys))!=-1){
            fos.write(bys,0,len);
        }
        fos.close();
        fis.close();
    }
    //基本字节流一次读写一个字节
    private static void method1(File srcFile, File destFile) throws IOException {
        FileInputStream fis = new FileInputStream(srcFile);
        FileOutputStream fos = new FileOutputStream(destFile);
        int by = 0;
        while((by = fis.read())!=-1){
            fos.write(by);
        }
        fos.close();
        fis.close();
    }


}

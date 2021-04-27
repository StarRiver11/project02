package cn.itcast_01;

import java.io.*;

/**
 * @auther Star_River
 * @date 2021/3/19-15:32
 *
 * 复制文本文件：
 *  分析：
 *      复制数据，如果我们知道用记事本打开就能读懂，就用字符流，否则就用字节流
 *      通过该原理，我们知道我们应该采用字符流更方便一些。
 *      而字符流有5种方式，所以做这个题目我们有5种方式。推荐掌握第5种
 *
 *      数据源：c:\\a.txt -- FileReader -- BufferedReader
 *      目的地：d:\\b.txt -- FileWriter -- BufferedWriter
 */
public class CopyFileDemo {
    public static void main(String[] args) throws IOException {
        String srcString = "c:\\a.txt";
        String destString = "d:\\b.txt";
//        method1(srcString,destString);
        method2(srcString,destString);
//        method3(srcString,destString);
//        method4(srcString,destString);
//        method5(srcString,destString);
    }

    private static void method5(String srcString, String destString) throws IOException {
        //数据源
        BufferedReader br = new BufferedReader(new FileReader(srcString));
        //目的地
        BufferedWriter bw = new BufferedWriter(new FileWriter(destString));
        String line = null;
        while((line = br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        bw.close();
    }
    //字符缓冲流一次读取一个字符数组
    private  static void method4(String srcString,String destString) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(srcString));
        BufferedWriter bw = new BufferedWriter(new FileWriter(destString));
        char[] chs = new char[1024];
        int len = 0;
        while ((len = br.read(chs))!=-1){
            bw.write(chs,0,len);
        }
        bw.close();
        br.close();

    }
    //字符缓冲流一次读写一个字符
    private static void method3 (String srcString,String destString) throws IOException{
        //数据源
        BufferedReader br = new BufferedReader(new FileReader(srcString));
        //目的地
        BufferedWriter bw = new BufferedWriter(new FileWriter(destString));
        int ch = 0;
        while((ch = br.read())!=-1){
            bw.write(ch);
        }
        bw.close();
        br.close();
    }
    //基本字符流一次读写一个字符数组
    private static void method2(String srcString,String destString) throws IOException{
        //数据源
        FileReader fr = new FileReader(srcString);
        //目的地
        FileWriter fw = new FileWriter(destString);
        //一次读取一个字符数组
        char[] chs = new char[1024];
        int len = 0;
        while((fr.read(chs))!=-1){
            fw.write(chs,0,len);
        }
        //释放连接
        fw.close();
        fr.close();
    }
    //基本字符流一次读写一个字符
    private static void method1 (String srcString,String destString)throws IOException{
        //数据源
        FileReader fr = new FileReader(srcString);
        //目的地
        FileWriter fw = new FileWriter(destString);
        //一次读取一个字符
        int ch = 0;
        while((ch = fr.read())!=-1){
            fw.write(ch);
        }
        fw.close();
        fr.close();

    }
}

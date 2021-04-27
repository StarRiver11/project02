package cn.itcast_03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @auther Star_River
 * @date 2021/3/10-9:35
 * OutputStreamWriter的方法：
 * public void wirte(int c)：写一个字符
 * public void write(char[] cbuf):写一个字符数组
 * public void write(char[] cbuf,int off,int len):写一个字符数组的一部分
 * public void write(String str):写一个字符串
 * public void write(String str, int off, int len)：写一个字符串的一部分
 * 面试题：
 * close()和fluse()的区别
 * A：close():关闭流对象，但是先刷新一次缓冲区。关闭之后，流对象不可以继续使用
 * B：fluse()；仅仅刷新缓冲区，刷新以后，流对象还可以继续使用
 */
public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        //创建对象
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\demo\\osw2.txt"));

        //写数据
        //public void write(int c):写一个字符
        //osw.write('a');
//        osw.write(97);
        //数据没有写进去？
        //原因是：1字符 = 2字节，文件中数据存储的基本单位是字节

        //public void write(char[] cbuf):写一个字符数组
        char[] chs = {'a','b','c','d','e'};
        osw.write(chs);

        //public void write(char[] cbuf,int off,int len):写一个字符数组的一部分
        osw.write(chs,1,3);

        //public void write(String str):写一个字符串
        osw.write("我爱林青霞");
        //public void write(String str, int off, int len)：写一个字符串的一部分
        osw.write("我爱林青霞",2,3);


        //刷新缓冲区
        osw.flush();

        //释放资源
        osw.close();

    }
}

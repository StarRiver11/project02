package cn.itcast_04;

import java.io.IOException;
import java.io.PrintStream;

/**
 * @auther Star_River
 * @date 2021/4/30-9:31
 * 标准输入输出流：
 *    System类中的两个成员变量
 *       public static final InputStream in "标准"输入流。
 *       public static final OutputStream out "标准"输出流
 *
 *       InputStream is = System.in;
 *       PrintStream ps = System.out;
 */
public class SystemOutDemo {
    public static void main(String[] args) throws IOException {
        //从这里的讲解我们知道，这个输出语句器本质就是IO流操作，把数据输出到控制台
        System.out.println("helloworld");
        //获取标准输出流对象
        PrintStream ps = System.out;
        ps.println("helloworld");

        ps.println();
    }
}

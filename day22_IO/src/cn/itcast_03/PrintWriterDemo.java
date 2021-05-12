package cn.itcast_03;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * @auther Star_River
 * @date 2021/4/29-15:43
 *
 * 打印流
 * 字节流打印流 PrintStream
 * 字符打印流   PrintWriter
 *
 * 打印流的特点：
 *         A：只有写数据的，没有读取数据的。只能操作目的地，不能操作数据源
 *         B：可以操作任意类型的数据
 *         C：如果启动了自动刷新，能够自动刷新
 *         D:该流是可以直接操作文本文件的。
 *            哪些流是可以直接操作文本文件的呢
 *            FileInputStream
 *            FileOutputStream
 *            FileReader
 *            FileWriter
 *            PrintStream
 *            PrintWriter
 *            看API,查流对象的构造方法，如果同时有File类型和String类型的参数，一般来说是可以操作文件的
 */
public class PrintWriterDemo {
    public static void main(String[] args) throws IOException {
        //作为Writer的子类使用
        PrintWriter pw = new PrintWriter("pw.txt");

        pw.write("hello");
        pw.write("world");
        pw.write("java");
        pw.close();
    }
}

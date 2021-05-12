package cn.itcast_04;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 * @auther Star_River
 * @date 2021/4/30-9:50
 * 转换流的应用
 *
 */
public class SystemOutDemo2 {
    public static void main(String[] args) throws IOException {
        //获取标准输入流
        //PrintStream ps = System.out;
        //OutputStream os = ps;
        OutputStream os = System.out;
        //我能不能按照刚才使用标准输入流的方式一样把数据输出到控制台上呢？
//        OutputStream osw = new OutputStreamWriter(os);
//      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("hello");
        bw.newLine();
        bw.write("world");
        bw.newLine();
        bw.write("java");
        bw.newLine();
        bw.flush();

        bw.close();
    }
}

package cn.itcast_06;

import java.io.*;

/**
 * @auther Star_River
 * @date 2021/3/19-14:24
 *
 * 需求：把当前项目下的a.txt内容复制到当前目录下的b.txt中
 *
 * 数据源：
 *      a.txt  -- 读取数据  -- 字符转换流  -- InputStreamReader  -- FileRead --BufferedReader
 * 目的地：
 *      b.txt --  写出数据 --  字符转换流  -- OutputStreamWriter -- FileWriter -- BufferedWriter
 */
public class CopyFileDemo {
    public static void main(String[] args) throws IOException {
        //封装数据源
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));
        //封装目的地
        BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));

        //两种方式其中的一种一次读取一个字符数组
        char[] chs = new char[1024];
        int len = 0;
        while((len = br.read(chs))!= -1){
            bw.write(chs,0,len);
            bw.flush();
        }
    }

}

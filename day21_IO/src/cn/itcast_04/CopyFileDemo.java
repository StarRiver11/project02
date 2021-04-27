package cn.itcast_04;

import java.io.*;

/**
 * @auther Star_River
 * @date 2021/3/10-11:21
 * 需求：把当前项目目录下的a.txt复制到当前项目下的b.txt中
 * 数据源：
 *       a.txt -- 读取数据  -- 字符转换流  -- InputStreamReader
 * 目的地：
 *       b.txt -- 写出数据  -- 字符转换流  -- OutputStreamWriter
 */
public class CopyFileDemo {
    public static void main(String[] args) throws IOException {
        //封装数据源
        InputStreamReader isr = new InputStreamReader(new FileInputStream("a.txt"));
        //封装目的地
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("b.txt"));

        //读写数据
        //方式1
//        int ch = 0;
//        while((ch = isr.read())!=-1){
//            osw.write(ch);
//        }

        //方式2
        char[] chs = new char[1024];
        int len = 0;
        while((len = isr.read(chs))!=-1){
            osw.write(chs,0,len);
        }

        //释放资源
        osw.close();
        isr.close();
    }


}

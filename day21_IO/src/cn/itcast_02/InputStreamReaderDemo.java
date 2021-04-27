package cn.itcast_02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @auther Star_River
 * @date 2021/3/9-16:15
 * InputStreamReader(InputStream is):用默认的编码读取数据
 * InputStreamReader(InputStream is,String charsetName)：用指定的编码读取数据
 */
public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("a.txt"),"UTF-8");
        //读取数据
        //一次读取一个字符
        int ch = 0;
        while((ch = isr.read())!=-1){
            System.out.print((char)ch);
        }
    }
}

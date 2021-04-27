package cn.itcast_02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @auther Star_River
 * @date 2021/3/10-9:12
 * OutputStreamWriter(OutputStream out):根据默认编码把字节流的数据转换为字符流
 * OutputStreamWriter(OutputStream out,String charsetName):根据指定编码把字节流数据转换为字符流
 * 把字节流转换位字符流
 * 字符流 = 字节流 + 编码表
 */
public class OutPutStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        //创建对象
//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw.txt"));//默认GBK编码
//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw.txt"),"GBK");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw.txt"),"UTF-8");


        //写数据
        osw.write("中国");
        //释放资源
        osw.close();


    }
}

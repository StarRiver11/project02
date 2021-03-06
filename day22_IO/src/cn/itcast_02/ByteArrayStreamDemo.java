package cn.itcast_02;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * @auther Star_River
 * @date 2021/4/29-14:52
 *
 * 内存操作流：用于处理临时存储信息的，程序结束，数据就从内存中消失
 * 字节数组：
 *      ByteArrayInputStream
 *      ByteArrayOutputStream
 * 字符数组：
 *      CharArrayReader
 *      CharArrayWriter
 * 字符串：
 *       StringReader
 *       StringWriter
 *
 */
public class ByteArrayStreamDemo {
    public static void main(String[] args) throws IOException {
        //写数据
        //ByteArrayOutputStream
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        //写数据
        for(int x = 0; x < 10; x++){
            baos.write(("hello"+ x).getBytes());
        }
        //释放资源
        //通过查看源码我们知道这里什么都没有做，所以不需要关闭

        byte[] bys = baos.toByteArray();
        //读数据
        //ByteArrayInputStream(byte[] buf)
        ByteArrayInputStream bais = new ByteArrayInputStream(bys);
        int by =0;
        while((by = bais.read())!=-1){
            System.out.print((char)by);
        }
    }


}

package cn.itcast_01;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @auther Star_River
 * @date 2021/3/3-9:49
 * 如何实现数据换行？
 *     现在没有换行，是因为只写了字节数据，并没有写入换行符号。
 *     如何实现呢？写入换行符号即可
 *     刚才看到有写文本文件打开时可以的，通过windows自带的不行，是因为不同的系统针对不同的换行符号识别不一样
 *     windows:\r\n
 *     linux:\n
 *     Mac:\r
 *    一些高级记事本可以识别任何换行符号
 *   如何实现数据的追加写入？
 *      用构造方法带第二个参数是true的情况即可
 *
 */
public class FileOutputStreamDemo3 {
    public static void main(String[] args) throws IOException {
        //创建字节输出流对象
//        FileOutputStream fos = new FileOutputStream("fos3.txt");//此方法只能从头写
        //创建一个向具有指定name的文件中写入数据的输出文件流。如果第二个参数为true，则将字节写入文件末尾处，而不是写入文件开始处
        FileOutputStream fos = new FileOutputStream("fos.txt",true);

        //写数据
        for (int i = 0; i < 10; i++) {
            fos.write(("hello"+i).getBytes());
            fos.write("\r\n".getBytes());
        }

    }


}

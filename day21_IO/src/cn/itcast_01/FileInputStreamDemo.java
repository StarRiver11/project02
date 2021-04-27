package cn.itcast_01;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @auther Star_River
 * @date 2021/3/9-15:03
 */
public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        //创建字节输入流对象
        FileInputStream fis = new FileInputStream("a.txt");

        //读取数据
        byte[] bys = new byte[1024];
        int len = 0;
        while((len = fis.read(bys))!=-1){
            System.out.print(new String(bys,0,len));
        }
        //释放资源
        fis.close();
    }
}

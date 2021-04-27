package cn.itcast_05;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @auther Star_River
 * @date 2021/3/4-10:33
 * 注意：虽然有两种方式可以读取，但是注意，这两种方式针对同一个对象在一个代码中只能使用一个
 */
public class BufferedInputStreamDemo  {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("fos.txt"));

        //读取数据
        byte[] bys = new byte[1024];
        int len = 0;
        while((len=bis.read(bys))!=-1){
            System.out.println(new String(bys,0,len));
        }
        //释放资源
        bis.close();
    }
}

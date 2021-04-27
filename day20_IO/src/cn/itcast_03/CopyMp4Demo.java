package cn.itcast_03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @auther Star_River
 * @date 2021/3/3-15:29
 * 需求：把D:\\demo\\测试.avi复制到当前目录下的copy.avi中
 *
 * 数据源
 *      D:\\demo\\测试.avi --读取数据 -FileInputStream
 * 目的地：
 *      copy.avi    --写入数据   -FileOutputStream
 */
public class CopyMp4Demo {
    public static void main(String[] args) throws IOException {
        //封装数据源
        FileInputStream fis = new FileInputStream("D:\\demo\\测试.avi");

        //封装目的地
        FileOutputStream fos = new FileOutputStream("copy.avi");

        //复制数据
        int by = 0;
        while((by = fis.read())!=-1){
            fos.write(by);
        }
        //释放资源
        fos.close();
        fis.close();
    }
}

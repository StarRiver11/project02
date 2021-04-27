package cn.itcast_04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @auther Star_River
 * @date 2021/3/4-9:45
 * 需求：把D：\demo\总结.avi复制到当前项目目录下的copy.mp4中
 * 数据源：
 *    D:\demo\总结.avi  --读取数据  --FileInputStream
 * 目的地:
 * copy.avi --写出数据--FileOutputStream
 */
public class CopyMp4Demo {
    public static void main(String[] args) throws IOException{
        //封装数据源
        FileInputStream fis = new FileInputStream("D:\\demo\\总结.avi ");
        //封装目的地
        FileOutputStream fos = new FileOutputStream("copy.avi");

        //复制数据
        byte[] bys = new byte[1024];
        int len = 0;
        while((len=fis.read(bys))!=-1){
            fos.write(bys,0,len);
        }

        fos.close();
        fis.close();

    }

}

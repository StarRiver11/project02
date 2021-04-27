package cn.itcast_02;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @auther Star_River
 * @date 2021/3/3-18:44
 */
public class FileInputStreamDemo3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("a.txt");
        byte[] bys = new byte[5];
        int len = 0;
        while((len = fis.read(bys))!=-1){
            System.out.println(new String(bys, 0, len));
        }
        //释放资源
        fis.close();


    }

}

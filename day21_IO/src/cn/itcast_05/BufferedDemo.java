package cn.itcast_05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @auther Star_River
 * @date 2021/3/13-19:32
 * 字符缓冲流的特殊方法：
 * BufferedWriter:
 *       public void newLine():根据系统来决定换行符
 * BufferedReader:
 *       public String readLine():一次读取一行数据
 *       包含该行内容的字符串，不包含任何行终止符，如果已到达流末尾，则返回null
 */
public class BufferedDemo {
    public static void main(String[] args) throws IOException {
        read();
    }

    private static void read() throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("fos.txt"));

        //public String readLine():一次读取一行数据
//        String line = br.readLine();
//        System.out.println(line);
//        line = br.readLine();
//        System.out.println(line);

        String line = null;
        while((line = br.readLine())!=null){
            System.out.println(line);
        }
        //释放资源
        br.close();
    }
}

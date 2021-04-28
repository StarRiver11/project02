package cn.itcast_08;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/**
 * @auther Star_River
 * @date 2021/4/28-15:51
 *
 * BufferedReader
 *       |--LineNumberReader
 *          public int getLineNumber() 获得当前行号
 *          public void setLineNumber(int lineNumber)
 */
public class LineNumberReaderDemo {
    public static void main(String[] args) throws IOException {
        LineNumberReader lnr = new LineNumberReader(new FileReader("D:\\demos\\my.txt"));

//        System.out.println(lnr.getLineNumber());

        //从10开始
        lnr.setLineNumber(10);
        String line = null;
        while((line = lnr.readLine())!=null){
            System.out.println(lnr.getLineNumber()+":"+line);
        }
        lnr.close();
    }
}

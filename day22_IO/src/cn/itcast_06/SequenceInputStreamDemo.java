package cn.itcast_06;

import java.io.*;

/**
 * @auther Star_River
 * @date 2021/4/30-10:47
 *
 * 以前的操作：
 * a.txt  --  b.txt
 * c.txt  --  d.txt
 *
 */
public class SequenceInputStreamDemo {
    public static void main(String[] args) throws IOException {
        //SequenceInputStream(InputStream s1,InputStream s2)
        //需求：把ByteArrayStreamDemo.java和DataSteamDemo.java 复制到copy.java 中
        InputStream s1 = new FileInputStream("pw.txt");
        InputStream s2 = new FileInputStream("pw2.txt");

        SequenceInputStream sis = new SequenceInputStream(s1,s2);
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Copy.txt"));

        //如何写读呢，其实很简单，就按照以前怎末写读现在还怎末写读写
        byte[] bys = new byte[1024];
        int len = 0;
        while((len = sis.read(bys))!=-1){
            bos.write(bys,0,len);
        }
        sis.close();
        bos.close();

    }
}

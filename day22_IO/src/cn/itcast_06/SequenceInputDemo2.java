package cn.itcast_06;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

/**
 * @auther Star_River
 * @date 2021/4/30-11:10
 *
 * 以前的操作：
 *  a.txt   --  b.txt
 *  c.txt   --  d.txt
 *  e.txt   --  f.txt
 *  现在想要：
 *  a.txt + b.txt + c.txt - d.txt
 *
 */
public class SequenceInputDemo2  {
    public static void main(String[] args) throws IOException{
        //需求：把下面三个文件复制到Copy.txt中
        //SequenceInputStreamDemo(Enumeration e)
        //通过简单的回顾我们知道了Enumeration 是Vetor中的一个方法的返回值类型
        //Enumeration<E> elements()
        Vector<InputStream> v = new Vector<InputStream>();
        InputStream s1 = new FileInputStream("pw.txt");
        InputStream s2 = new FileInputStream("pw2.txt");
        InputStream s3 = new FileInputStream("raf.txt");

        v.add(s1);
        v.add(s2);
        v.add(s3);



        Enumeration<InputStream> en = v.elements();
        SequenceInputStream sis = new SequenceInputStream(en);
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Copy.txt"));

        //如何读写呢，其实很简单，就按照以前怎末读写，现在还怎末读写
        byte[] bys = new byte[1024];
        int len = 0;
        while((len = sis.read(bys))!=-1){
            bos.write(bys,0,len);
        }
        bos.close();
        sis.close();


    }

}









package cn.itcast_07;

import java.io.*;

/**
 * @auther Star_River
 * @date 2021/4/30-15:11
 *
 * 序列化流：把对象按照流一样的方式存入文本文件或者在网络中传输。对象----流数据（ObjectOutputStream）
 * 反序列化流：把文本文件中的流对象数据或者网络中的流对象数据还原成对象  流数据--对象（objectInputStream)
 *
 */
public class ObjectStreamDemo {
    public static void main(String[] args) throws IOException,ClassNotFoundException{

        read();
//        write();
    }
    private static void read() throws IOException,ClassNotFoundException{
        //创建反序列化对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("oos.txt"));
        //还原对象
        Object obj = ois.readObject();
        //释放资源
        ois.close();
        //输出对象
        System.out.println(obj);
    }
    private static void write() throws IOException{
        //创建序列化流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("oos.txt"));
        //创建对象
        Person P = new Person("林青霞",27);

        oos.writeObject(P);

        //释放资源
        oos.close();
    }


}

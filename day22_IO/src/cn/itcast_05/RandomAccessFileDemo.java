package cn.itcast_05;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @auther Star_River
 * @date 2021/4/30-10:09
 *
 * 随机访问流：
 *     RandomAccessFile类不属于流，是object类的子类
 *     但他融合了InputStream和OutputStream的功能
 *     支持对文件的随机访问读取和写入
 *
 *     public RandomAccessFile(String name,String mode):第一个参数是文件路径，第二个参数是操作文件的模式
 *         模式有四种，我们最长用的一种叫"RW",这种方式表示既可以写数据，也可以读数据
 */
public class RandomAccessFileDemo {
    public static void main(String[] args)  throws IOException {
//        write();
        read();
    }
    private static void read() throws IOException{
        //创建随机访问流对象
        RandomAccessFile raf = new RandomAccessFile("raf.txt","rw");
        int i = raf.readInt();
        System.out.println(i);
        //该文件指针可以通过 getFilePointer方法读取，并通过seek方法设置
        System.out.println("当前文件的指针位置是："+ raf.getFilePointer());

        char ch = raf.readChar();
        System.out.println(ch);
        System.out.println("当前文件的指针位置是："+raf.getFilePointer());

        String s = raf.readUTF();
        System.out.println(s);
        System.out.println("当前文件的指针位置是："+raf.getFilePointer());

        //我不想从头开始了，我就要读取a，怎末办呢
//        raf.seek(4);
//        ch = raf.readChar();
//        System.out.println(ch);

    }
    private static void write() throws IOException{
        //创建随机访问流对象
        RandomAccessFile raf = new RandomAccessFile("raf.txt","rw");

        //怎末玩
        raf.writeInt(100);
        raf.writeChar('a');
        raf.writeUTF("中国");
        raf.close();
    }
}

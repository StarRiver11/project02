package cn.itcast_08;

import java.io.*;
import java.util.Properties;

/**
 * @auther Star_River
 * @date 2021/5/1-10:47
 * 这里的集合必须是Properties集合：
 * public void load(Reader reader):把文件中的数据读取到集合中
 * public void store(Writer writer,String comments):把集合中的数据存储到文件
 */
public class PropertiesDemo3 {
    public static void main(String[] args) throws IOException{
//        myload();
        mystroe();
    }

    private static void mystroe() throws IOException{
        //创建集合对象
        Properties prop = new Properties();
        prop.setProperty("林青霞","27");
        prop.setProperty("吴鑫","28");
        prop.setProperty("刘晓曲","18");

        //public void store(Writer writer,String comments):把集合中的数据存储到文件
        Writer w = new FileWriter("name.txt");
        prop.store(w,"helloworld");
        w.close();
    }

    private static void myload() throws IOException {
        Properties prop = new Properties();
        //public void load(Reader reader):把文件中的数据读取到集合中
        //注意：这个文件的数据必须是键值对形式
        Reader r = new FileReader("prop.txt");
        prop.load(r);
        r.close();
        System.out.println("prop:"+prop);


    }
}

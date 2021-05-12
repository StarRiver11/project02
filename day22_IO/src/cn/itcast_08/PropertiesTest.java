package cn.itcast_08;

import java.io.*;
import java.util.Properties;
import java.util.Set;

/**
 * @auther Star_River
 * @date 2021/5/1-11:06
 * 我有一个文件（user.txt）,我知道数据是键值对形式的，但是不知道内容是什么
 * 请写一个程序判断是否有“lisi”的存在，如果有就改变其值为“100”
 *
 * 分析：
 *        A: 把文件中的数据加载到集合中
 *        B：遍历集合得到每一个键
 *        C：判断键是否有lisi的，如果有就将其值改为100
 *        D：把集合中的数据重新存储到文件中
 */
public class PropertiesTest {
    public static void main(String[] args) throws IOException {

        //把文件中的数据加载到集合中
        //public void load(Reader reader):把文件中的数据读取到集合中
        Properties prop = new Properties();
        Reader r = new FileReader("user.txt");
        prop.load(r);
        r.close();

        //遍历集合得到每一个键
        Set<String>  set = prop.stringPropertyNames();
        for (String key : set) {
            //判断键是否有lisi的，如果有就将其值改为100
            if("lisi".equals(key)){
                prop.setProperty(key,"100");
                break;
            }
        }
        //把集合中的数据重新存储到文件中
        Writer w = new FileWriter("user.txt");
        prop.store(w,null);
        w.close();

    }
}

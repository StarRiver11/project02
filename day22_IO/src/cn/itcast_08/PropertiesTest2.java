package cn.itcast_08;

import java.io.*;
import java.util.Properties;

/**
 * @auther Star_River
 * @date 2021/5/1-11:56
 * 有一个猜字小游戏的程序，请写一个程序实现在测试类中只能使用5次，超过5次提示：游戏试玩已结束，请付费/
 */
public class PropertiesTest2 {
    public static void main(String[] args) throws IOException {
        //读取某个地方的数据，如果次数不大于5，可以继续玩。否则就提示"游戏试玩已经结束，请付费"
        //创建一个文件
//        File file = new File("count.txt");
//        if(!file.exists()){
//            file.createNewFile();
//        }
        
        //把数据加载到集合中

        Properties prop = new Properties();
        Reader r = new FileReader("count.txt");
        prop.load(r);
        r.close();

        //自己保存的程序，当然知道里面的键是谁
        String value = prop.getProperty("count");
        int number = Integer.parseInt(value);

        if(number > 3){
            System.out.println("游戏试玩已结束，请付费");
            System.exit(0);
        } else{

            number++;
            prop.setProperty("count",String.valueOf(number));
            Writer w = new FileWriter("count.txt");
            prop.store(w,null);
            w.close();
            GuessNumber.start();

        }

    }
}

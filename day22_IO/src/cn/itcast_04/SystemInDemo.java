package cn.itcast_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @auther Star_River
 * @date 2021/4/30-8:27
 * System.in 标准输入流，是从键盘获取数据的
 * 键盘录入数据：
 *          A：main方法的args接收参数
 *               java HelloWorld hello world java
 *          B: Scanner(JDK5以后的）
 *              Scanner sc = new Scanner(System.in);
 *              String s = sc.nextLine();
 *          C:通过字符缓冲流包装标准输入流实现
 *          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 *
 */
public class SystemInDemo {
    public static void main(String[] args) throws IOException {
        //获取标准流
        //InputStream is = System.in;
        //要一次读取一行数据的方法是哪个呢
        //readLine();
        //这个方法在BufferedReader类中
        // BufferedReader br = new BufferedReader(is);
        //按照我们的猜想，现在应该可以了，但是却报错了，
        //原因是：字符缓冲流只能针对字符流操作，而你现在是字节流，所以是不能用的
        //如果使用就要把字节流转化为字符流，然后在通过字符缓冲流操作
//        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("请输入一个字符串：");
        String line = br.readLine();
        System.out.println("你输入的字符串是"+line);

        System.out.println("请输入一个整数：");
        line = br.readLine();
        int i = Integer.parseInt(line);
        System.out.println("你输入的整数时："+i);


    }
}

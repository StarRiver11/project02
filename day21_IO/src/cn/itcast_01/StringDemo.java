package cn.itcast_01;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @auther Star_River
 * @date 2021/3/9-15:08
 *
 * String(byte[] bytes,String charsetName):通过指定的字符集解码字节数组
 * byte[] getBytes(String charsetName):使用指定的字符集把字符串编码为字节数组
 *
 * 编码：把看的懂的变成看不懂的
 * String -- byte[]
 * 解码：把看不懂的变成看懂的
 */
public class StringDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "你好";

        byte[] bys = s.getBytes();
        System.out.println(Arrays.toString(bys));

        // byte[] -- String
//        String ss = new String(bys);
//        String ss = new String(bys, "GBK");
        String ss = new String(bys, "UTF-8");
        System.out.println(ss);

    }


}

package cn.itcast_03;

import java.io.File;
import java.io.IOException;
/**
 * @auther Star_River
 * @date 2021/2/24-14:57
 *
 * 删除功能：public boolean delete()
 * 如果某目录下还有子目录不可直接删除该目录
 */
public class FileDemo {
    public static void main(String[] args) throws IOException {
        //创建文件
//        File file = new File("D:\\a.txt");
//        System.out.println("createNewFile:"+file.createNewFile());

        //我不小心写成这个样子啦
//        File file = new File("a.txt");
//        System.out.println("createNewFile:"+file.createNewFile());

        //继续玩
//        File file2 = new File("D:\\aaa\\bbb\\ccc");
//        System.out.println("mkdirs:"+file2.mkdirs());

        //删除功能：我要删除a.txt这个文件
//        File file3 = new File("D:\\a.txt");
//        System.out.println("delete:"+file3.delete());

        //删除功能：我要删除 ccc这个文件夹
//        File file4 = new File("D:\\aaa\\bbb");
//        System.out.println("delete:"+file4.delete());

        //删除功能：我要删除aaa这个文件夹
//        File file5 = new File("D:\\aaa");
//        System.out.println("delete:"+file5.delete());

        File file6 = new File("D:\\aaa\\bbb");
        File file7 = new File("D:\\aaa");

        System.out.println("delete:"+file6.delete());
        System.out.println("delete:"+file7.delete());

    }
}

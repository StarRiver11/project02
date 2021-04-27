package cn.itcast_02;
import java.io.IOException;
import java.io.File;
/**
 * @auther Star_River
 * @date 2021/2/23-14:30
 * 创建功能：
 * public boolean createNewFile():创建文件 如果存在这样的文件就补创建了
 * public boolean mkdir():创建文件夹如果存在这样的文件夹就不创建了，父文件夹不存在无法创建子文件夹
 * public boolean mkdirs():创建文件夹，如果父文件夹不存在，就会帮你创建
 *
 * 注意：创建文件和创建文件夹搞清楚，不要调错方法
 */
public class FileDemo {
    public static void main(String[] args) throws IOException {
        //需求：我要在d盘目录下创建一个文件夹demo
        File file = new File("D:\\demo");
        System.out.println("mkdir:"+file.mkdir());
//        需求：在d盘目录demo下创建一个文件a.txt
        File file2 = new File("D:\\demo\\a.txt");
        System.out.println("createNewFile:"+file2.createNewFile());

//        需求：我要在D盘目录test下创建一个b.txt文件
//        报错：Exception in thread "main" java.io.IOException: 系统找不到指定的路径
//        注意：要想在目录下创建文件，该目录必须首先存在
        File file3 = new File("D:\\test\\b.txt");
        System.out.println("CreateNewFile:"+file3.createNewFile());

//        需求：在D盘目录test下创建aaa目录
        File file4 = new File("D:\\test\\aaa");
        System.out.println("mkdir:"+file4.mkdir());
        File file5 = new File("D:\\test");
        File file6 = new File("D:\\test\\aaa");
        System.out.println("mkdir:"+file5.mkdir());
        System.out.println("mkdir:"+file6.mkdir());
        
       // 其实我们有更简单的方法
        File file7 = new File("D:\\aaa\\bbb\\ccc\\ddd");
        System.out.println("mkdirs:"+file7.mkdirs());
        //看下面这个东西
        File file8 = new File("D:\\LI\\aa.txt");
        System.out.println("mkdirs:"+file8.mkdirs());

    }





}

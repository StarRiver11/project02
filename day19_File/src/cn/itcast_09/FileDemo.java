package cn.itcast_09;

import java.io.File;

/**
 * @auther Star_River
 * @date 2021/3/1-14:19
 *
 * 需求：把D:\homework下的名称修改为00？_介绍.txt
 * 思路：
 *      A:封装目录
 *      B:获取该目录下的所有文件的数组
 *      C：遍历该File数组，得到每一个File对象
 *      D：拼接一个新的名字，然后重命名即可
 *
 *      举例：day18作业.txt
 */
public class FileDemo {
    public static void main(String[] args) {
        //封装目录
        File srcFolder = new File("D:\\homework");

        //获取该目录下的所有文件的File数组
        File[] fileArray = srcFolder.listFiles();

        //遍历File数组得到每一个File对象
        for (File file : fileArray) {
            //System.out.println(file);
            //D:\homework\day18作业.txt
            //改后：D:\homework\001_作业.txt
            String name = file.getName();
            int endIndex = name.lastIndexOf('.');
            String numberString = name.substring(endIndex-4,endIndex);
            String nameString = name.substring(endIndex,endIndex+4);
//            System.out.println(numberString);
//            System.out.println(nameString);
            String newName = numberString.concat(nameString);
//            System.out.println(newName);
            File newFile = new File(srcFolder,newName);
//            System.out.println(newFile);

            //重命名
            file.renameTo(newFile);



        }
    }








}

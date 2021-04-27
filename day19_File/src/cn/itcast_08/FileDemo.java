package cn.itcast_08;

import java.io.File;

/**
 * @auther Star_River
 * @date 2021/2/25-13:44
 *
 * 判断D盘目录下是否有后缀名为.jpg的文件，如果有就输出此文件名称
 *
 * 分析：
 *      A:封装D判断目录
 *      B:获取该目录下的所有文件或文件夹的File数组
 *      C：遍历该File数组，得到每一个File对象，然后判断
 *      D：是否是文件
 *              是：继续判断是否以.jpg结尾的
 *                    是：就输出该文件名
 *                    否：不搭理他
 *              否：不打理他
 */
public class FileDemo {
    public static void main(String[] args) {
        //封装D判断目录
        File file = new File("D:\\");
        //public File[] listFiles():获取指定目录下的所有文件或者文件夹的File数组
        //获取该目录下的所有文件或者文件夹数组
        File[] fileArray = file.listFiles();
        //遍历File数组得到每一个File对象然后判断
        for (File f : fileArray) {
            //是否为文件
            if(f.isFile()){
                //继续判断是否以.jpg结尾
                if(f.getName().endsWith(".jpg")){
                    System.out.println(f.getName());
                }
            }
        }
    }
}

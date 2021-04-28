package cn.itcast_05;

import java.io.*;

/**
 * @auther Star_River
 * @date 2021/4/27-21:15
 *
 *  需求：复制多级文件
 *  数据源：D:\\test\\demos
 *  目的地：D:\\
 *  分析：
 *       A：封装数据源File
 *       B:判断封装目的地File
 *       C:判断该File数组是文件还是文件夹
 *           a:是文件夹
 *                就在目的地目录下创建该文件夹
 *                获取该File对象下的所有文件或者文件夹的File对象
 *                遍历得到每一个File对象
 *                回到C
 *           b:是文件
 *              就复制（字节流）
 */
public class CopyFolderDemo  {
    public static void main(String[] args) throws IOException{
        //封装数据源
        File srcFile = new File("D:\\test\\demos");
        //封装目的地
        File destFile = new File("D:\\");

        //复制文件夹功能
        copyFolder(srcFile,destFile);
    }
    private static void copyFolder(File srcFile,File destFile) throws IOException{
        //判断该File是文件夹还是文件
        if(srcFile.isDirectory()){
            //是文件夹
            File newFolder = new File(destFile,srcFile.getName());
            newFolder.mkdir();

            //获取该File对象下的所有文件或者文件夹File对象
            File[] fileArray = srcFile.listFiles();
            for (File file : fileArray) {
//                System.out.println(file);
                copyFolder(file,newFolder);
            }
        } else {
            //文件
            File newFile = new File(destFile,srcFile.getName());
            copyFile(srcFile,newFile);
        }
    }
    public static void copyFile(File srcFile, File newFile) throws IOException{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(newFile));
        byte[] bys = new byte[1024];
        int len = 0;
        while((len = bis.read(bys))!=-1){
            bos.write(bys,0,len);
        }
        bos.close();
        bis.close();

    }

}

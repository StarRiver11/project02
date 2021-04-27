package cn.itcast_04;

import java.io.*;

/**
 * @auther Star_River
 * @date 2021/4/27-16:41
 *
 * 需求：复制指定目录下的指定文件，并修改后缀名
 * 指定的文件是：.java文件
 * 指定的后缀名是：.jad
 * 指定的目录是：jad
 * 数据源：D:\\java\\A.java
 * 目的地：D:\\jad\\A.jad
 *
 * 分析：
 *     A：封装目录
 *     B：获取该目录下的java文件的File对象
 *     C：遍历该File数组，得到每一个File对象
 *     D：把该File进行复制
 *     E:在目的地目录下改名
 *
 */
public class CopyFolderDemo {
    public static void main(String[] args) throws IOException {



        //封装目录
        File srcFolder = new File("D:\\demo");
        //封装目的地
        File destFolder = new File("D:\\jad");
        //如果目录不存在就创建
        if(!destFolder.exists()){
            destFolder.mkdir();
        }
        //获取改目录下的java文件的File数组
        File[] fileArray = srcFolder.listFiles(new FilenameFilter(){
            @Override
            public boolean accept(File dir, String name){
                return new File(dir,name).isFile() && name.endsWith(".java");
            }

        });

        //遍历该File数组，得到每一个File对象
        for (File file : fileArray) {
            String name = file.getName();//DataTypeDemo.java
            String newName = name.replace(".java",".jad");
            File newFile = new File(destFolder,newName);
            copyFile(file,newFile);
        }
        //在目的地目录下该名
        File[] destFileArray = destFolder.listFiles();
        for(File destFile:destFileArray){
            String name = destFile.getName();
            String newName = name.replace(".java",".jad");

            File newFile = new File(destFolder,newName);
            destFile.renameTo(newFile);

        }

    }
    private static void copyFile(File file, File newFile) throws IOException{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
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

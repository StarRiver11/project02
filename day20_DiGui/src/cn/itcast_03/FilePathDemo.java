package cn.itcast_03;
import java.io.File;

/**
 * @auther Star_River
 * @date 2021/3/2-11:17
 * 需求：需要大家把D:\demo目录下所有
 * 以java结尾的文件输出再控制台上
 * 分析：
 *      A：封装该目录
 *      B：获取该目录下的所有文件或者文件夹的File数组
 *      C：遍历该File数组，得到每一个File对象
 *      D：判断该File对象是否是文件夹
 *             是： 回到B
 *             否： 继续判断是否以.java结尾
 *                   是：输出他的路径
 *                   否：不搭理他
 */
public class FilePathDemo {
    public static void main(String[] args) {
        //封装目录
        File srcFolder = new File("D:\\demo");
        getAllJavaFilePaths(srcFolder);

    }
    public static void getAllJavaFilePaths(File srcFolder){
        //获取该目录下的所有文件或者文件夹的File数组
        File[] fileArray = srcFolder.listFiles();

        //遍历该File数组，得到每一个File对象
        for (File file : fileArray) {
            if(file.isDirectory()){
                getAllJavaFilePaths(file);
            }else{
                if(file.getName().endsWith(".java")){
                    System.out.println(file.getAbsolutePath());
                }
            }
        }

    }

}

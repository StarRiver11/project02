package cn.itcast_08;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @auther Star_River
 * @date 2021/2/25-14:06
 *  判断D盘目录下是否有后缀名为.jpg的文件，如果有，就输出文件名称
 *  思路一：先获取所有的，然后遍历的是否依次判断，如果满足条件就输出
 *  思路二：获取的时候已经是满足条件的了，然后输出即可。
 *
 *  要想实现思路二必须学习一个接口：文件名称过滤器
 *  public String[] list(FilenameFilter filter)
 *  public File[] listFiles(FilenameFilter filter)
 */
public class FileDemo2 {
    public static void main(String[] args) {
        //封装D盘目录
        File file = new File("D:\\");

        //获取该目录下的所有文件或者文件夹的String数组
        //public String[] list(FilenameFilter filter)
        String[] strArray = file.list(new FilenameFilter(){
            public boolean accept(File dir,String name){
               // return true;
                //return false;
                //通过这个测试，我们就知道了到底吧这个文件或者文件夹的名称加不加到数组中，取决于这里的返回值是true
                //还是false，所以这个true或者false应该是我们通过某种判断得到的
                //System.out.println(dir +"---"+name);
//                File file = new File(dir,name);
//               // System.out.println(file);
//                boolean flag = file.isFile();
//                boolean flag2 = name.endsWith(".jpg");
//
//                return flag && flag2;

                //或者直接这样写
                return new File(dir,name).isFile() &&name.endsWith(".jpg");

            }
        });
        //遍历
        for (String s : strArray) {
            System.out.println(s);
        }



    }
}

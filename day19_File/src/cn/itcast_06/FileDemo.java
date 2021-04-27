package cn.itcast_06;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @auther Star_River
 * @date 2021/2/25-11:15
 * 获取功能：
 * public String getAbsolutePath():获取绝对路径
 * public String getPath():获取相对路径
 * public String getName():获取名称
 * public long length():获取长度。字节数
 * public long lastModified():获取最后一次修改的时间，毫秒值
 */
public class FileDemo {
    public static void main(String[] args) {
        //创建文件对象
        File file = new File("D:\\demo\\a.txt");

        System.out.println("getAbsolutePath:"+file.getAbsolutePath());
        System.out.println("getPath:"+file.getPath());
        System.out.println("getName:"+file.getName());
        System.out.println("length:"+file.length());
        System.out.println("lastModified:"+file.lastModified());

        //1614223551207
        Date d = new Date(1614223551207L);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-DD HH:mm:ss");
        String s = sdf.format(d);
        System.out.println(s);
    }
}

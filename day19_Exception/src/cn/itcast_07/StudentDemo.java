package cn.itcast_07;
import java.util.Scanner;
/**
 * @auther Star_River
 * @date 2021/2/23-10:01
 * 自定义学生的测试类
 */
public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生成绩：");
        int score = sc.nextInt();

        Teacher t = new Teacher();
        try{
            t.check(score);
        }catch(MyException e){
            e.printStackTrace();
        }

    }
}

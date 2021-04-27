package cn.itcast_01;

/**
 * @auther Star_River
 * @date 2021/2/9-16:12
 *
 *
 *
 */
public class ExceptionDemo2 {
    public static void main(String[] args) {
        //第一阶段
        int a = 10;
        int b = 0;
        try{
            System.out.println(a / b);
        }catch (ArithmeticException ae){
            System.out.println("除数不能为零");
        }

        //第二阶段
        System.out.println("over");
    }
}

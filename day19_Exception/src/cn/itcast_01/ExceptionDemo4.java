package cn.itcast_01;

/**
 * @auther Star_River
 * @date 2021/2/19-10:19
 */
public class ExceptionDemo4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int [] arr = {1,2,3};
        try{
            System.out.println(a / b);
            System.out.println(arr[3]);
        }catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("出问题了");
        }

    }
}

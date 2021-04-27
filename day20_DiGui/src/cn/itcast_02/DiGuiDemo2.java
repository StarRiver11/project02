package cn.itcast_02;

/**
 * @auther Star_River
 * @date 2021/3/2-10:48
 * 不死神兔：
 * 有一对兔子，从出生后的第三个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问第20个月
 * 兔子的对数为多少
 *
 * 分析：我们要想办法找规律
 *           兔子的对数
 * 第一个月：     1
 * 第二个月：     1
 * 第三个月：     2
 * 第四个月：     3
 * 第五个月：     5
 * 第六个月：     8
 * 有此可见兔子对的数据是：1，1，3，5，8.。。。
 * 规则：
 *     A：从第三项开始，每一项是前2项之和
 *     B：说明前2项数据是已知的
 * 如何实现这个程序：
 *      A：数组实现
 *      B：变量的变化实现
 *      C：递归实现
 *
 *      假如相邻的两个月兔子对数是a,b
 *      第一个月的数据：a=1,b=1
 *      第二个月的数据：a=1,b=2
 *      第三个月的数据：a=2,b=3
 */
public class DiGuiDemo2 {
    public static void main(String[] args) {
        int [] arr = new int[20];
        arr[0] = 1;
        arr[1] = 1;
        for(int i=2;i<arr.length;i++){
            arr[i] = arr[i - 2]+arr[i-1];
        }
        System.out.println(arr[19]);
        System.out.println("-----------------");


        int a =1;
        int b =1;
        for (int i = 0; i<18; i++){
           int temp = a;
            a=b;
            b=temp+b;
        }
        System.out.println(b);
        System.out.println("---------------------");
        System.out.println(fib(20));

    }
    /*方法：
         返回值类型：int
         参数列表： int n
         出口条件   第一个月是1，第二个月是1
         规律：从第三个月开始，每一个月是前两个月之和
    *
    * */
    public static int fib(int n){
        if(n ==1 || n ==2){
            return 1;
        }else{
            return fib(n-1)+fib(n-2);
        }
    }

}

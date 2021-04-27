package cn.itcast_02;

/**
 * @auther Star_River
 * @date 2021/3/2-10:06
 * 需求：请用代码实现求5的阶乘
 * 5！=1x2x3x4x5
 * 有几种实现方案呢？
 *        A:循环实现
 *        B：递归实现
 *               a:做递归要写一个方法
 *               b:出口条件
 *               c:规律
 */
public class DiGuiDemo {
    public static void main(String[] args) {
        int jc = 1;
        for (int i = 2; i <6 ; i++) {
            jc= jc*i;
        }
        System.out.println("5的阶乘是:"+jc);
        System.out.println("5的阶乘是"+jiecheng(5));

    }
    /*
    * 做递归要写一个方法：
    *        返回值类型：int
    *        参数列表 int n
    * 出口条件：
    *       if(n==1) {return 1;}
    *       if(n!=1) {return n*方法名(n-1);
    * */
    public static int jiecheng(int n ){
        if(n == 1){
            return 1;
        }else{
            return n*jiecheng(n-1);
        }
    }
}

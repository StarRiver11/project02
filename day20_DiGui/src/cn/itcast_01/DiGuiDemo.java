package cn.itcast_01;

/**
 * @auther Star_River
 * @date 2021/3/2-10:00
 * 递归：方法定义中调用方法本身的现象
 *
 * Math.max(Math.max(a,b),c)  //方法的嵌套调用，这不是递归
 *
 * public void show(int n){
 *     if(n <= 0){
 *         System.exit(0);
 *     }
 *     System.out.println(n);
 *     show(--n);
 * }
 *
 * 注意事项：
 *        A：递归一定要有出口，否则就是死循环
 *        B；递归的次数不能太多，否则就内存溢出
 *        C：构造方法不能递归使用
 */
public class DiGuiDemo {
}

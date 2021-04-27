package cn.itcast_07;

/**
 * @auther Star_River
 * @date 2021/2/22-16:42
 *
 * java不可能对所有的情况都考虑到，所以在实际开发中，我们需要自己定义异常
 * 而我们自己随意写的一个类，是不能作为异常类型来看的，要想你的类时一个异常类，就必须继承自Exception或者RuntimeException
 *
 * 两种方式：
 * A:继承自Exception
 * B:继承RuntimeException
 */
public class MyException extends Exception {
    public MyException(){
    }
    public MyException(String message){
        super(message);
    }

}

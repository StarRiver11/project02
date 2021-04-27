package cn.itcast_01;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

/**
 * @auther Star_River
 * @date 2021/2/10-9:45
 * A:一个异常
 * B:两个异常
 *      a:每一个异常就写一个try...catch
 *      b:每写一个try，多个catch
 *       try{
 *           ...
 *       }catch(异常类名  变量名){
 *           。。。
 *       }catch(异常类名  变量名){
 *           。。。
 *       }
 *
 *       注意事项：
 *        1：能明确的尽量明确，不要用大的来处理
 *        2：平级关系的异常谁前谁后无所谓，如果出现了子父关系，父必须在后面
 *
 *        注意：
 *          一旦try出现问题，就会在这里把问题抛出去，然后和catch里面的问题进行匹配
 *          一旦有匹配，就会执行catch里面的处理，然后结束try...catch
 *          继续执行后面的语句
 *
 *
 */
public class ExceptionDemo3 {
    public static void main(String[] args) {
      //  method2();
       // method3();
        method4();
    }
    //两个异常
    public static void method2(){
        int a = 10;
        int b = 0;
        try{
            System.out.println(a / b);
        }catch(ArithmeticException e){
            System.out.println("除数不能为零");
        }
        int [] arr = {1,2,3};

        try{
            System.out.println(arr[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("你访问了不该访问的索引");
        }
        System.out.println("over");
    }

    //两个异常改进
    public static void method3(){
        int a = 10;
        int b = 0;
        int [] arr = {1,2,3};
        try{
            System.out.println(arr[3]);
            System.out.println(a / b);
        }catch(ArithmeticException e){
            System.out.println("除数不能为零");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("你访问了不该访问的索引");
        }
        System.out.println("over");
    }

    public static void method4(){
        int a = 10;
        int b = 0;
        int [] arr = {1,2,3};

        try{
            System.out.println(arr[3]);
            System.out.println(a / b);
            System.out.println("这里出现一个异常，你不太清楚");
        }catch (ArithmeticException e){
            System.out.println("除数不能为0");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("你访问了不该访问的索引");
        }catch(Exception e){
            System.out.println("出问题了");
        }
        System.out.println("over");
    }

}



package cn.itcast_03;

import com.sun.java.swing.plaf.windows.WindowsTextAreaUI;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @auther Star_River
 * @date 2021/1/21-13:51
 * 模拟斗地主洗牌和发牌
 * 分析：
 *     A:创建一个牌盒
 *     B:装牌
 *     C:洗牌
 *     D:发牌
 *     E:看牌
 *
 */
public class PokerDemo {
    public static void main(String[] args) {
        //创建一个牌盒
        ArrayList<String> array = new ArrayList<>();
        // 装牌
        // 黑桃A,黑桃2,黑桃3,...黑桃K
        // 红桃A,...
        // 梅花A,...
        // 方块A,...
        // 定义一个花色数组
        String[] colors = { "♠", "♥", "♣", "♦" };
        // 定义一个点数数组
        String[] numbers = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "J", "Q", "K" };
        // 装牌
        for (String color : colors){
            for (String number : numbers) {
                array.add(color.concat(number));
            }
        }
        array.add("小王");
        array.add("大王");
        //洗牌
        Collections.shuffle(array);
        System.out.println("array:" +array);

        //发牌
        ArrayList<String> fengqingyang = new ArrayList<String>();
        ArrayList<String> linQingXia = new ArrayList<String>();
        ArrayList<String> liuyi = new ArrayList<String>();
        ArrayList<String> dipai = new ArrayList<String>();

        for (int i = 0; i < array.size(); i++) {
            if (i >= array.size() - 3){
                dipai.add(array.get(i));
            }else if (i % 3 == 0){
                fengqingyang.add(array.get(i));
            }else if (i % 3 == 1){
                linQingXia.add(array.get(i));
            }else if (i % 3 == 2){
                liuyi.add(array.get(i));
            }
        }
        //看牌
        lookPoker("风清扬",fengqingyang);
        lookPoker("林青霞",linQingXia);
        lookPoker("刘意",dipai);
    }
    public static void lookPoker(String name,ArrayList<String> array){
        System.out.println(name + "的牌是：");
        for (String s : array) {
            System.out.println(s + " ");
        }
        System.out.println();
    }
}

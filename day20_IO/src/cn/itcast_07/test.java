package cn.itcast_07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * @auther Star_River
 * @date 2021/3/8-9:29
 */
public class test {
    public static void main(String[] args) {
        // 创建集合对象
        HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();

        // 创建元素集合1
        ArrayList<String> array1 = new ArrayList<String>();
        array1.add("吕布");
        array1.add("周瑜");
        hm.put("三国演义", array1);

        // 创建元素集合2
        ArrayList<String> array2 = new ArrayList<String>();
        array2.add("令狐冲");
        array2.add("林平之");
        hm.put("笑傲江湖", array2);

        // 创建元素集合3
        ArrayList<String> array3 = new ArrayList<String>();
        array3.add("郭靖");
        array3.add("杨过");
        hm.put("神雕侠侣", array3);

        //遍历集合
        Set<String> set = hm.keySet();
        for(String key : set){
            System.out.println(key);
            ArrayList<String> value = hm.get(key);
            for(String s : value){
                System.out.println("\t"+s);
            }
        }
    }
}

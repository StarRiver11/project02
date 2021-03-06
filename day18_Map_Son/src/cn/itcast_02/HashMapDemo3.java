package cn.itcast_02;

import java.util.HashMap;
import java.util.Set;

/**
 * @auther Star_River
 * @date 2021/1/22-13:06
 * Hashmap <String,String>
 *   键：String  学号
 *   值：Student 学生对象
 */
public class HashMapDemo3 {
    public static void main(String[] args) {
        //创建学生对象
        HashMap<String,Student> hm = new HashMap<String, Student>();

        //创建学生对象
        Student s1 = new Student("周星驰", 58);
        Student s2 = new Student("刘德华", 55);
        Student s3 = new Student("梁朝伟", 54);
        Student s4 = new Student("刘嘉玲", 50);

        //添加元素
        hm.put("9527",s1);
        hm.put("9522",s2);
        hm.put("9524",s3);
        hm.put("9529",s4);

        //遍历
        Set<String> set = hm.keySet();
        for (String key : set) {
            //注意，这次值不是字符串了
            // String value = hm.get(key)
            Student value = hm.get(key);
            System.out.println(key + "------------"+value.getName()+"---------"+value.getAge());
        }
    }
}

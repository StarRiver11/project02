package cn.itcast_01;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.HashMap;
import java.util.Map;

/**
 * @auther Star_River
 * @date 2021/1/21-15:19
 * 作为学生来说，是根据学号来区分不同的学生的，那么假设我现在已经知道了学生的学号了，我要根据学号去获取学生姓名，请问该怎么做？
 * 如果采用前面将的集合，我们只能把学号和学生姓名作为一个对象的成员变量，然后存储整个对象，将来遍历的时候，判断，对应的名称。
 * 但是呢，如果我都能把学生姓名拿出来了，我还需要根据编号去找吗？
 * 针对我们目前的这种需求：仅仅知道学号，就想知道学生姓名的情况，java提供了关键字Map
 * 通过查看API，我们知道Map集合的一个最大特点，就是他可以存储键值对元素。这个时候存储我们上面的需求，就可以这样做：
 * 学号1  姓名1
 * 学号2  姓名2
 * 学号3  姓名3
 * 学号2（不行）姓名2
 * Map集合的特点：
 *     将键映射到值的对象。一个映射不能包含重复的键：每个键最多只能映射到一个值
 * Map集合和Collection集合的区别？
 *     Map集合存储元素是成对出现的，Map集合的键是唯一的，值是可以重复的。可以把这个理解为：夫妻对
 *     Collection集合存储元素是单独出现的，Collection的儿子Set是唯一的，List是可以重复的。可以把这个理解为：光棍
 *注意：Map集合的数据结构针对键有效，跟值无关
 *          HashMap, TreeMap
 *     Collection集合的数据结构是针对元素有效
 *
 *  Map集合的功能概述：
 *    1：添加功能
 *          v put(K key, V value):添加元素。这个其实还有另外一个功能？
 *             如果键是第一次存储，就直接存储元素，返回null
 *             如果键不是第一次存储，就用值把原来的值替换，返回以前的值
 *    2：删除功能
 *          void  clear():移除所有的键值对元素
 *          V remove(Object key):根据键删除键值对元素，并把值返回
 *    3：判断功能
 *          boolean containsKey(Object key):判断集合是否包含指定的键
 *          boolean containsValue(Object value):判断集合是否包含指定的值
 *          boolean isEmpty():判断集合是否为空
 *    4：获取功能
 *          Set<Map.Entry<K,V>> entrySet():
 *          V get(Objeect key):根据键获取值
 *          Set<K> keySet():获取集合中所有键的集合
 *          Collection<V> values():获取集合中所有值的集合
 *     5：长度功能
 *          int size():返回集合中的键值对对数
 *
 */
public class MapDemo {
    public static void main(String[] args) {
        //创建集合对象
        Map<String,String> map = new HashMap<String,String>();

        //添加元素
        // V put(K key,V value):添加元素。
//        System.out.println("put: " + map.put("文章","马伊利") );
//        System.out.println("put: " + map.put("文章","姚笛"));

        map.put("邓超", "孙俪");
        map.put("黄晓明", "杨颖");
        map.put("周杰伦", "蔡依林");
        map.put("刘恺威", "杨幂");

        //void  clear();
//        map.clear();

        // V remove(Object key):根据键删除键值对元素，并把值返回
//        System.out.println("remove:"+map.remove("黄晓明"));
//        System.out.println("remove:"+map.remove("黄晓波"));

        // boolean containsKey(Object key)：判断集合是否包含指定的键
//        System.out.println("containKey:" +map.containsKey("黄晓明"));
//        System.out.println("containKey:" +map.containsKey("黄晓波"));

        // boolean isEmpty(): 判断集合是否为空
//        System.out.println("isEmpty:"+map.isEmpty());

        //int size():返回集合中键值对的对数
        System.out.println("size:"+map.size());

        //输出集合名称
        System.out.println("map:"+map);

    }

}

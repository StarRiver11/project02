package cn.itcast_07;

import java.io.Serializable;

/**
 * @auther Star_River
 * @date 2021/4/30-14:17
 *
 * NotSerializableException:未序列化异常
 * 类通过实现 java.io.Serializable
 * 接口以启用其序列化功能。未实现此接口的类将无法使其任何状态序列化或反序列化
 * 该接口居然没有任何方法，类似于这种没有任何方法的接口被称为标记接口
 * java.io.InvalidClassException:
 * cn.itcast_07.Person; local class incompatible:
 * stream classdesc serialVersionUID = -2071565876962058344,
 * local class serialVersionUID = -8345153069362641443
 * 为什么会有问题呢？
 *     Person 类实现了序列化接口，那么他本身也应该有一个标记值
 *     这个标记值假设是100.
 *     开始的时候：
 *     Person.class  -- id = 100
 *     Write数据：  oos.txt -- id = 100
 *     read数据：   oos.txt -- id = 100
 *
 *     现在：
 *     Person.class  -- id = 200
 *     write数据：  oos.txt  --- id = 100
 *     read数据     oos.txt  --- id =100
 *
 * 我们在开发中，可能还需要使用以前写过的数据，不能重新写入，怎么办呢？
 * 回想一下原因，因为他们的id值不匹配。
 * 每次修改java文件内容的时候，class文件的id值都会发生改变
 * 而每次读取文件的时候，会和class文件中的id值进行匹配。所以就会出问题
 * 但是呢，我有办法，让这个id值在java文件中是一个固定的值，这样，修改文件的时候，这个id值还会发生改变吗？
 * 不会，现在的关键是我如何能够知道这个id值如何表示呢？
 * 不用担心，
 *
 *我们知道的是：
 *       看到实现了序列化接口的时候，要想解决警告线，就可以自动产生一个序列化的id值。
 *       而且产生这个值以后，我们对类进行任何改动，它读取以前的数据是没有问题的
 *
 * 注意：
 *       一个类中可能有很多成员变量，有些我不想进行序列换，请问该怎么办呢？
 *       使用transient关键字声明不需要序列化的成员变量
 *
 */
public class Person implements Serializable {
    private static final long serialVersionUID = -8345153069362641443L;
    private String name;
//    private int age;
    private transient int age;

    public Person(){
        super();
    }

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name = "+name+",age="+age+"]";
    }
}

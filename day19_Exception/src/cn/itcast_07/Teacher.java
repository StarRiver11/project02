package cn.itcast_07;

/**
 * @auther Star_River
 * @date 2021/2/22-16:55
 */
public class Teacher {
    public void check(int score) throws MyException{
        if(score > 100 || score < 0){
            throw new MyException("分数必须在0-100之间");
        } else{
            System.out.println("分数没有问题");
        }
    }
}

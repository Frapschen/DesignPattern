/**
 * 最简单的单例模式
 * 该类的构造方法是私有的，它公布一个静态方法，用于获取这个唯一的类
 */
public class Singleton{
    private static Singleton uniuqueInstance;

    private Singleton(){}
    public static Singleton getInstance(){
        if(uniuqueInstance == null){
            uniuqueInstance = new   Singleton();
        }
        return uniuqueInstance;
    }
}



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

/**
 * 第二种单件模式，这种模式使用在多线程环境下,
 * 但是这种方法也存在问题：效率低，每次获取这个类都要检查同步情况
 */
public class Singleton{
    private static Singleton uniuqueInstance;

    private Singleton(){}
    //加入同步关键字
    public static synchronized Singleton getInstance(){
        if(uniuqueInstance == null){
            uniuqueInstance = new   Singleton();
        }
        return uniuqueInstance;
    }
}

/**
 * 第三种单件模式，在JVM加载这个类时马上就实例化出来，就不存在同步问题了
 */
public class Singleton{
    private static Singleton uniuqueInstance = new Singleton();

    private Singleton(){}
    public static Singleton getInstance(){
        return uniuqueInstance;
    }
}

/**
 * 使用volatile关键字，这个关键字确保：当uniqueInstance变量被初始化成Singleton实例时，
 * 多个线程能正确处理unuqueInstance变量。
 */
public class Singleton{
    private volatile static Singleton uniuqueInstance;

    private Singleton(){}
    public static Singleton getInstance(){
        if(uniuqueInstance == null){
            synchronized(Singleton.class){
                if(uniuqueInstance == null){
                    uniuqueInstance = new   Singleton();
                }
            }
        }
        return uniuqueInstance;
    }
}


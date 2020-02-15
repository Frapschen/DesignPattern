/**
 * @title: SingletonFourth
 * @projectName Design Pattern
 * @description: TODO
 * @author msi
 * @date 2020/2/1511:30
 */

/**
 * @ClassName SingletonFourth
 * @Version 1.0
 * @Author msi
 * @Date 2020/2/15 11:30
 * @Description TODO
 * Modification User： 程序修改时由修改人员编写
 * Modification Date： 程序修改时间
 * 使用volatile关键字，这个关键字确保：当uniqueInstance变量被初始化成Singleton实例时，
 * 多个线程能正确处理unuqueInstance变量。
 */
public class SingletonFourth {
    private volatile static SingletonFourth uniuqueInstance;

    private SingletonFourth(){}
    public static SingletonFourth getInstance(){
        if(uniuqueInstance == null){
            synchronized(Singleton.class){
                if(uniuqueInstance == null){
                    uniuqueInstance = new   SingletonFourth();
                }
            }
        }
        return uniuqueInstance;
    }
}
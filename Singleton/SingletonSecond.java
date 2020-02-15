/**
 * @title: SingletonSecond
 * @projectName Design Pattern
 * @description: TODO
 * @author msi
 * @date 2020/2/1511:27
 */

/**
 * @ClassName SingletonSecond
 * @Version 1.0
 * @Author msi
 * @Date 2020/2/15 11:27
 * @Description TODO
 * Modification User： 程序修改时由修改人员编写
 * Modification Date： 程序修改时间
 * 第二种单件模式，这种模式使用在多线程环境下,
 * 但是这种方法也存在问题：效率低，每次获取这个类都要检查同步情况
 */
public class SingletonSecond {
    private static SingletonSecond uniuqueInstance;

    private SingletonSecond(){}
    //加入同步关键字
    public static synchronized SingletonSecond getInstance(){
        if(uniuqueInstance == null){
            uniuqueInstance = new SingletonSecond();
        }
        return uniuqueInstance;
    }
}
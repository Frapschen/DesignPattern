/**
 * @title: SingletonThird
 * @projectName Design Pattern
 * @description: TODO
 * @author msi
 * @date 2020/2/1511:28
 */

/**
 * @ClassName SingletonThird
 * @Version 1.0
 * @Author msi
 * @Date 2020/2/15 11:28
 * @Description TODO
 * Modification User： 程序修改时由修改人员编写
 * Modification Date： 程序修改时间
 * 第三种单件模式，在JVM加载这个类时马上就实例化出来，就不存在同步问题了
 */
public class SingletonThird {
    private static SingletonThird uniuqueInstance = new SingletonThird();

    private SingletonThird(){}
    public static SingletonThird getInstance(){
        return uniuqueInstance;
    }
}
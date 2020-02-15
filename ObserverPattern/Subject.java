/**
 * @ClassName Subject
 * @Version 1.0
 * @Author msi
 * @Date 2020/2/15 11:27
 * @Description TODO
 * Modification User： 陈泯全
 * Modification Date： 2020.2.15
 * 主题，被观测者需要实现这个接口
 */
public interface Subject{
    /** 
    * @Description:  添加一个观察者
    * @Param:  任何观察者类
    * @return:  无
    * @Author: 陈泯全
    * @Date: 2020/2/15 
    */ 
    public void registerObserver(Observer o);
    /** 
    * @Description:  删除一个观察者
    * @Param:  任何观察者类
    * @return: 无
    * @Author: 陈泯全
    * @Date: 2020/2/15 
    */ 
    public void removeObserver(Observer o);
    /** 
    * @Description: 通知所有的观察者
    * @Param:  无
    * @return:  无
    * @Author: 陈泯全
    * @Date: 2020/2/15 
    */ 
    public void notifyObservers();
}
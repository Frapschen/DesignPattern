/**
 * @ClassName Observer
 * @Version 1.0
 * @Author msi
 * @Date 2020/2/15 11:27
 * @Description TODO
 * Modification User： 陈泯全
 * Modification Date： 2020.2.15
 * 观察者接口。想要成为某一个主题的观察者，它必须实现这个接口。
 * 但是目前这个接口还是不太完美，它任然有具体的东西：temp，humidity，pressuer
 * 使得它无法向一般推广
 */
public interface Observer{
    /** 
    * @Description: 跟新数据
    * @Param:
     * temperature 温度
     *  humidity 湿度
     *  pressure 压力
    * @return:  无
    * @Author: 陈泯全
    * @Date: 2020/2/15 
    */ 
    public void update(float temp, float humidity, float pressuer);
}
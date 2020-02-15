/**
 * @ClassName DisplayElement
 * @Version 1.0
 * @Author msi
 * @Date 2020/2/15 11:27
 * @Description TODO
 * Modification User： 陈泯全
 * Modification Date： 2020.2.15
 * 展示类接口，这个是模拟气象站给出统一信息展示接口，任何一个类想要展示气候信息就必须实现这个接口
 */
public interface DisplayElement {
    /**
    * @Description: 展示气候信息
    * @Param:  无
    * @return:  无
    * @Author: 陈泯全
    * @Date: 2020/2/15
    */
    public void display();
}
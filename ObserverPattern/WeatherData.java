import java.util.ArrayList;
/**
 * @ClassName WeatherData
 * @Version 1.0
 * @Author msi
 * @Date 2020/2/15 11:27
 * @Description TODO
 * Modification User： 陈泯全
 * Modification Date： 2020.2.15
 * 具体的被观察者，它需要实现Subject接口。
 * 这个类模拟了气象站的气象信息类。这个类有气温、湿度、气压三个私有成员，它们三个随时都在变化，每当有变化时
 * 这个类会调用measurementsChange方法。
 */
public class WeatherData implements Subject {
    private ArrayList observers;//观察者集合
    private float temperature;//气温
    private float humidity;//湿度
    private float pressure;//气压

    /**
    * @Description: 构造方法
    * @Param:  无
    * @return:  无
    * @Author: 陈泯全
    * @Date: 2020/2/15
    */
    public WeatherData(){
        observers = new ArrayList<>();
    }

    /**
    * @Description: 将一个观察者加入到观察者集合中
    * @Param:  观察者类的引用
    * @return:  无
    * @Author: 陈泯全
    * @Date: 2020/2/15
    */
    @Override
    public void registerObserver(Observer o) {
        // TODO Auto-generated method stub
        observers.add(o);
    }
    /** 
    * @Description: 从观察者集合中删除一个观察者
    * @Param:  需要被删除的观察者
    * @return:  无
    * @Author: 陈泯全
    * @Date: 2020/2/15 
    */ 
    @Override
    public void removeObserver(Observer o) {
        // TODO Auto-generated method stub
        int i = observers.indexOf(o);
        observers.remove(i);
    }
    /**
    * @Description: 通知所有观察者，数据发生变化了
    * @Param: 无
    * @return: 无
    * @Author: 陈泯全
    * @Date: 2020/2/15
    */
    @Override
    public void notifyObservers() {
        // TODO Auto-generated method stub
        for(int i=0 ; i <observers.size(); i++){
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature, humidity, pressure);
        } 
    }
    /** 
    * @Description: 气象信息发生变化时，气象局自动调用的方法
    * @Param:  无
    * @return:  无
    * @Author: 陈泯全
    * @Date: 2020/2/15 
    */ 
    public void measurementsChange(){
        notifyObservers();
    }
    
    /** 
    * @Description: 用于模拟气象局的气象数据改变
    * @Param:
     * temperature 温度
     * humidity 湿度
     * pressure 压力
    * @return: 无
    * @Author: 陈泯全
    * @Date: 2020/2/15
    */ 
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChange();
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
    
    
}
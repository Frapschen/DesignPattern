/**
 * @ClassName CurrentConditionsDisplay
 * @Version 1.0
 * @Author msi
 * @Date 2020/2/15 11:27
 * @Description TODO
 * Modification User： 陈泯全
 * Modification Date： 2020.2.15
 * 这是一个公告板类，它会实时显示当前的气候数据。它是具体的观察者，实现了Observer,DisplayElement接口
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement{
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("Current conditions:"+temperature+
        "F degrees and "+ humidity +"%humidty");
    }

    @Override
    public void update(float temp, float humidity, float pressuer) {
        // TODO Auto-generated method stub
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

}
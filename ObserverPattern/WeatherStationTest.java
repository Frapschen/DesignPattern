/**
 * @ClassName WeatherStationTest
 * @Version 1.0
 * @Author cmq
 * @Date 2020/2/15 11:27
 * @Description TODO
 * Modification User： 陈泯全
 * Modification Date： 2020.2.15
 * 测试类
 */
public class WeatherStationTest {
    public static void main(String[] args) {
        //被观察者（主题）
        WeatherData weatherData = new WeatherData();
        //创建一个观察者
        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
        
        //主题修改信息
        weatherData.setMeasurements(89, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
    }
}
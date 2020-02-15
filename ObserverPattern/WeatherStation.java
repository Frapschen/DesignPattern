public class WeatherStation{
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
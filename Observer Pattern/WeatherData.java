import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList observers;//观察者集合
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList<>();
    }

    //将一个实现了Observer的类加入的观察者集合
    @Override
    public void registerObserver(Observer o) {
        // TODO Auto-generated method stub
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        // TODO Auto-generated method stub
        int i = observers.indexOf(o);
        observers.remove(i);
    }
    //通知所有的观察者，数据改变了
    @Override
    public void notifyObservers() {
        // TODO Auto-generated method stub
        for(int i=0 ; i <observers.size(); i++){
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature, humidity, pressure);
        } 
    }
    //气象信息改变
    public void measurementsChange(){
        notifyObservers();
    }
    //用于测试的方法
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
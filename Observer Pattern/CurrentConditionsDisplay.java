

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
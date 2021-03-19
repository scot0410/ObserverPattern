package Display;

public class ForecastDisplay {
    Float temp;
    Float humidity;
    Float pressure;

    public void update(Float temp, Float humidity, Float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    void display(){
        System.out.println("\n Current Forecast:\n" +
                "Temperature: " + temp +
                "Humidity: " + humidity +
                "Pressure: " + pressure);
    }
}

package Display;

public class StatisticsDisplay {
    Float temp;
    Float humidity;
    Float pressure;

    public void update(Float temp, Float humidity, Float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        //stats could be compared to usual average?
    }

    void display(){
        System.out.println("\n Current Weather Stats:\n" +
                "Temperature: " + temp +
                "Humidity: " + humidity +
                "Pressure: " + pressure);
    }
}

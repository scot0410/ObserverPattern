package Display;

public class CurrentConditionsDisplay {
    Float temp;
    Float humidity;
    Float pressure;

    public void update(Float temp, Float humidity, Float pressure){
       this.temp = temp;
       this.humidity = humidity;
       this.pressure = pressure;
    }

    public void display(){
        System.out.println("\n Current Weather Conditions:\n" +
                            "Temperature: " + temp +
                            "Humidity: " + humidity +
                            "Pressure: " + pressure);
    }
}

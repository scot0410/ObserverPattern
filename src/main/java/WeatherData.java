import Display.CurrentConditionsDisplay;
import Display.ForecastDisplay;
import Display.StatisticsDisplay;

public class WeatherData {
    CurrentConditionsDisplay currentConditionsDisplay;
    StatisticsDisplay statisticsDisplay;
    ForecastDisplay forecastDisplay;

    public WeatherData(CurrentConditionsDisplay currentConditionsDisplay, StatisticsDisplay statisticsDisplay, ForecastDisplay forecastDisplay) {
        this.currentConditionsDisplay = currentConditionsDisplay;
        this.statisticsDisplay = statisticsDisplay;
        this.forecastDisplay = forecastDisplay;
    }

    public void measurementsChanged(){
        Float temp = getTemperature();
        Float humidity = getHumidity();
        Float pressure = getPressure();

        currentConditionsDisplay.update(temp, humidity, pressure);
        statisticsDisplay.update(temp, humidity, pressure);
        forecastDisplay.update(temp, humidity, pressure);
    }

    Float getTemperature(){
        return 75.5f;
    }

    Float getHumidity(){
        return 30.3f;
    }

    Float getPressure(){
        return 10.1f;
    }


}

package pt.ua.HOMEWORK2_weather.network;

import java.util.HashMap;

import pt.ua.HOMEWORK2_weather.datamodel.WeatherType;

public interface WeatherTypesResultsObserver {
    public void receiveWeatherTypesList(HashMap<Integer, WeatherType> descriptorsCollection);
    public void onFailure(Throwable cause);
}

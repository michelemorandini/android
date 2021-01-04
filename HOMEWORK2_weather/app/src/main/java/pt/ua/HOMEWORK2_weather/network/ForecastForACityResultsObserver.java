package pt.ua.HOMEWORK2_weather.network;

import java.util.List;

import pt.ua.HOMEWORK2_weather.datamodel.Weather;

public interface ForecastForACityResultsObserver {
    public void receiveForecastList(List<Weather> forecast);
    public void onFailure(Throwable cause);
}

package pt.ua.HOMEWORK2_weather.network;

import java.util.HashMap;

import pt.ua.HOMEWORK2_weather.datamodel.City;

public interface  CityResultsObserver {
    public void receiveCitiesList(HashMap<String, City> citiesCollection);
    public void onFailure(Throwable cause);
}

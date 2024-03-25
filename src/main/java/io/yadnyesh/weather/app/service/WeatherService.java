package io.yadnyesh.weather.app.service;

import io.yadnyesh.weather.app.domain.CityCoordinates;
import io.yadnyesh.weather.app.domain.WeatherRequestDetails;
import io.yadnyesh.weather.app.entity.WeatherResponse;
import io.yadnyesh.weather.app.provider.GeocodingProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    private GeocodingProvider geocodingProvider;

    @Autowired
    public WeatherService(GeocodingProvider geocodingProvider) {
        this.geocodingProvider = geocodingProvider;
    }

    public WeatherResponse getWeather(final WeatherRequestDetails weatherRequestDetails) {
        final CityCoordinates cityCoordinates = geocodingProvider.getCoordinates(weatherRequestDetails);
        return null;
    }

}

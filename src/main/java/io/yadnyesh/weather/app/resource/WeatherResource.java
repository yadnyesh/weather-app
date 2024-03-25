package io.yadnyesh.weather.app.resource;


import io.yadnyesh.weather.app.domain.WeatherRequestDetails;
import io.yadnyesh.weather.app.entity.WeatherResponse;
import io.yadnyesh.weather.app.service.WeatherService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class WeatherResource {

    private WeatherService weatherService;

    @Autowired
    public WeatherResource(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/weather/{city}")
    public @ResponseBody WeatherResponse weather(@PathVariable("city") String city) {
        final WeatherRequestDetails weatherRequestDetails = WeatherRequestDetails.builder()
                .city(city)
                .build();
        return weatherService.getWeather(weatherRequestDetails);
    }
}

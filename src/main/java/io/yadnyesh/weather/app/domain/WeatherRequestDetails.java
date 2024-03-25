package io.yadnyesh.weather.app.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class WeatherRequestDetails {
    private String city;

}

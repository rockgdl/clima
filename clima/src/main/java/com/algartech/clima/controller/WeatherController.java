package com.algartech.clima.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algartech.clima.service.WeatherMapService;


@RestController
@RequestMapping("/weather")
public class WeatherController {

    private final WeatherMapService weatherMapService;

    public WeatherController(WeatherMapService weatherMapService) {
        this.weatherMapService = weatherMapService;
    }

    @GetMapping("/{city}")
    public String getTemperature(@PathVariable String city) {
        Double temperature = weatherMapService.getTemperature(city);

        if (temperature != null) {
            return "La temperatura en " + city + " es: " + temperature + " grados Celsius.";
        } else {
            return "No se pudo obtener la temperatura para " + city + ".";
        }
    }
}

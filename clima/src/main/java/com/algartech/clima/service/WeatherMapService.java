package com.algartech.clima.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.algartech.clima.entity.Historico;
import com.algartech.clima.model.WeatherResponse;
import com.algartech.clima.repository.HistoricoRepositoryDao;
 

@Service
public class WeatherMapService {

	@Value("${openweathermap.api.key}") //  clave API en application.properties
    private String apiKey;

    private final String apiUrl = "https://api.openweathermap.org/data/2.5/weather?q={city}&appid={apiKey}";

    private final RestTemplate restTemplate;
    private final HistoricoRepositoryDao historicoRepository;

    @Autowired
    public WeatherMapService(RestTemplate restTemplate , HistoricoRepositoryDao historicoRepository) {
        this.restTemplate = restTemplate;
        this.historicoRepository=historicoRepository;
    }

    public Double getTemperature(String city) {
        String url = apiUrl.replace("{city}", city).replace("{apiKey}", apiKey);
        WeatherResponse response = restTemplate.getForObject(url, WeatherResponse.class);

        if (response != null && response.getMain() != null) {
            System.out.println("Response JSON: " + response.toString());
  
            Historico n = new Historico();
      	  	n.setCiudad(response.getName());
      	  	n.setTemperatura(response.getMain().getTemp());
            
            historicoRepository.save(n);
            
            return response.getMain().getTemp();
        }

        return null;
    }
	
    public WeatherResponse createWeather(WeatherResponse weatherResponse) {
		return weatherResponse;
    	
    }
}

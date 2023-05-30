package com.api.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.api.entity.weather;
import com.api.service.WeatherAPIService;
@Service
public class WeatherAPIServiceImpl implements WeatherAPIService {

	@Override
	public weather fetchDataFromExternalAPI(String location) {
		
		 String apiUrl = "https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/timeline/"+location+"?unitGroup=metric&key=WLTAL58E352WXLCWCG85L8DUM&contentType=json";
	        
	       
	        RestTemplate restTemplate = new RestTemplate();

	        
	         weather Object = restTemplate.getForObject(apiUrl, weather.class);

	       
	        return Object;
	    }

}

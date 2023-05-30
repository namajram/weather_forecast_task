package com.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.entity.weather;
import com.api.service.impl.WeatherAPIServiceImpl;

@RestController

@RequestMapping("/api")
public class WeatherController {

	private final WeatherAPIServiceImpl externalAPIService;

    @Autowired
    public WeatherController(WeatherAPIServiceImpl externalAPIService) {
        this.externalAPIService = externalAPIService;
    }

    @GetMapping("/weather")
   
    public weather getDataFromExternalAPI(@RequestParam(required = false) String location) {
        
        weather data = externalAPIService.fetchDataFromExternalAPI(location);
        
        
       
        return data ;
    }
}

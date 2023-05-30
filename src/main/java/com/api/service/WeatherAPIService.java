package com.api.service;

import com.api.entity.weather;

public interface WeatherAPIService {
	weather fetchDataFromExternalAPI(String location);
}

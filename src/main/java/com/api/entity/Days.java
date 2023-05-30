package com.api.entity;

public class Days {
private String temp;
private String humidity;
private String pressure;
private String windspeed;
private String visibility;

public  Days() {}

public String getTemp() {
	return temp;
}

public void setTemp(String temp) {
	this.temp = temp;
}

public String getHumidity() {
	return humidity;
}

public void setHumidity(String humidity) {
	this.humidity = humidity;
}

public String getPressure() {
	return pressure;
}

public void setPressure(String pressure) {
	this.pressure = pressure;
}

public String getWindspeed() {
	return windspeed;
}

public void setWindspeed(String windspeed) {
	this.windspeed = windspeed;
}

public String getVisibility() {
	return visibility;
}

public void setVisibility(String visibility) {
	this.visibility = visibility;
}

public Days(String temp, String humidity, String pressure, String windspeed, String visibility) {
	super();
	this.temp = temp;
	this.humidity = humidity;
	this.pressure = pressure;
	this.windspeed = windspeed;
	this.visibility = visibility;
}

}

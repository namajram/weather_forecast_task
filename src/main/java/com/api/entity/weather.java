package com.api.entity;

import java.util.List;

public class weather {
private String timezone;
private List<Days> days;

public String getTimezone() {
	return timezone;
}

public void setTimezone(String timezone) {
	this.timezone = timezone;
}

public List<Days> getDays() {
	return days;
}

public void setDays(List<Days> days) {
	this.days = days;
}

public  weather() {}

public weather(String timezone, List<Days> days) {
	super();
	this.timezone = timezone;
	this.days = days;
}




}

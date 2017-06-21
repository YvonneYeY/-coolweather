package com.a2017.yvonne.coolweather.util;

/**
 * Created by Yvonne on 2017/6/17.
 */

public class SelectedCities {
    private String weatherId;
    private String name;
    public SelectedCities(String name,String weatherId){
        this.weatherId=weatherId;
        this.name=name;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

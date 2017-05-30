package com.a2017.yvonne.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Yvonne on 2017/5/30.
 */

public class Country extends DataSupport {
    private int id;
    private String countryName;
    private String weatherId;
    private int cityId;

    public int getId() {
        return id;
    }

    public int getCityId() {
        return cityId;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }
}

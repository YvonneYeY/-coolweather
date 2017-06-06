package com.a2017.yvonne.coolweather.gson;

/**
 * Created by Yvonne on 2017/5/31.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}

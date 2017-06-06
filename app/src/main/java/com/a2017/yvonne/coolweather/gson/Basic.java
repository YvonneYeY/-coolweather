package com.a2017.yvonne.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Yvonne on 2017/5/31.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
     public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}


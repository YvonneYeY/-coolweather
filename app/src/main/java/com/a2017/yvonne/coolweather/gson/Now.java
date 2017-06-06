package com.a2017.yvonne.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Yvonne on 2017/5/31.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}

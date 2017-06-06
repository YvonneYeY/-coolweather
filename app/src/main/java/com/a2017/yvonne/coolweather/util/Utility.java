package com.a2017.yvonne.coolweather.util;

import android.text.TextUtils;
import android.util.Log;

import com.a2017.yvonne.coolweather.db.City;
import com.a2017.yvonne.coolweather.db.County;
import com.a2017.yvonne.coolweather.db.Province;
import com.a2017.yvonne.coolweather.gson.Weather;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Yvonne on 2017/5/30.
 */

public class Utility {
    /*解决和处理服务器返回的省级数据*/
    public static boolean handleProvinceResponse(String response) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allProvinces = new JSONArray(response);
                for (int i = 0; i < allProvinces.length(); i++) {
                    JSONObject provinceObjext = allProvinces.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceName(provinceObjext.getString("name"));
                    province.setProvinceCode(provinceObjext.getInt("id"));
                    province.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }
        return false;
    }

    /* 解析和处理服务器返回的市数据
     */
    public static boolean handleCityResponse(String response, int provinceId) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allCities = new JSONArray(response);
                for (int i = 0; i < allCities.length(); i++) {
                    JSONObject cityObjext = allCities.getJSONObject(i);
                    City city = new City();
                    city.setCityName(cityObjext.getString("name"));
                    city.setCityCode(cityObjext.getInt("id"));
                    city.setProvinceId(provinceId);
                    city.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }
        return false;
    }

    /*解决和处理服务器返回的县数据

     */
    public static boolean handleCountyResponse(String response, int cityId) {
        Log.d("handleCountyResponse", "---> " + response);
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allCounties = new JSONArray(response);
                for (int i = 0; i < allCounties.length(); i++) {
                    JSONObject countyObjext = allCounties.getJSONObject(i);
                    County county = new County();
                    county.setCountyName(countyObjext.getString("name"));
                    county.setWeatherId(countyObjext.getString("weather_id"));
                    county.setCityId(cityId);
                    county.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }
        return false;
    }

    public static Weather handleWeatherResponse(String response) {
        try {
            JSONObject jsonObject = new JSONObject(response);
            JSONArray jsonArray = jsonObject.getJSONArray("HeWeather");
            String weatherContent = jsonArray.getJSONObject(0).toString();
            return new Gson().fromJson(weatherContent, Weather.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;

    }
}

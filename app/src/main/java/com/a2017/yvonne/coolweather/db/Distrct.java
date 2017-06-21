package com.a2017.yvonne.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Yvonne on 2017/6/9.
 */

public class Distrct extends DataSupport {
    private int id;
    private String distrctName;
    private String weatherId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDistrctName() {
        return distrctName;
    }

    public void setDistrctName(String distrctName) {
        this.distrctName = distrctName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }
}


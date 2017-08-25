package com.example.sandwind.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by sandwind on 2017/8/22.
 */

public class Province extends DataSupport {

    private int id;
    private int provinceCode;
    private String provinceName;
    private int provinceId;

    public int getId() {
        return id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}

package com.coolweather.android.gson;
/**
 * @author 小亚
 * @Time 2019.4.9
 */

import com.google.gson.annotations.SerializedName;

/**
 * @SerializedName()
 * 此处使用SerializedName注解的方式来让JSON字段与java字段之间建立映射关系
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

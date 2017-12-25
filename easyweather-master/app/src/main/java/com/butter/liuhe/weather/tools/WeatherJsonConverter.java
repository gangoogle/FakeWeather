package com.butter.liuhe.weather.tools;


import com.butter.liuhe.weather.data.bean.HWeather;
import com.butter.liuhe.weather.data.bean.Weather;

/**
 * Created by byhieg on 16-8-9.
 */
public class WeatherJsonConverter {

    public static Weather getWeather(HWeather hWeather){
        return hWeather.getHeWeather5().get(0);
    }
}

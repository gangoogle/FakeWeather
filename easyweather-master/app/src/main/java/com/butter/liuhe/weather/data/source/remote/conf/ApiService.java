package com.butter.liuhe.weather.data.source.remote.conf;

import com.butter.liuhe.weather.data.bean.HWeather;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Created by byhieg on 17/5/21.
 * Contact with byhieg@gmail.com
 */

public interface ApiService {

    @GET("v5/weather")
    Call<HWeather> getWeather(@QueryMap Map<String, String> options);

}

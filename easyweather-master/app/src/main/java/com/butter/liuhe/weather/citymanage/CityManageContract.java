package com.butter.liuhe.weather.citymanage;

import com.butter.liuhe.weather.BasePresenter;
import com.butter.liuhe.weather.BaseView;
import com.butter.liuhe.weather.data.source.local.entity.WeatherEntity;

import java.util.List;

/**
 * Created by byhieg on 17/5/29.
 * Contact with byhieg@gmail.com
 */

public interface CityManageContract {

    interface View extends BaseView<Presenter>{

        void showNoData();

        void showCities(List<WeatherEntity> cityEntities);
    }

    interface Presenter extends BasePresenter{

        void loadCities();

        void deleteCity(String cityName);

        String getShowCity();

        void updateShowCity(String cityName);
    }
}

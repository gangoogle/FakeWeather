package com.butter.liuhe.weather.searchresult;

import com.butter.liuhe.weather.BasePresenter;
import com.butter.liuhe.weather.BaseView;
import com.butter.liuhe.weather.data.bean.CityContext;

import java.util.List;

/**
 * Created by byhieg on 17/5/30.
 * Contact with byhieg@gmail.com
 */

public interface SearchResultContract {

    interface Presenter extends BasePresenter {

        void loadCities(String name);

        void insertLoveCity(String cityName);

        void cancelCity(String cityName);

        void getCityWeather(String cityName);

        boolean isExist(String cityName);
    }

    interface View extends BaseView<Presenter> {
        void showNoData();

        void showQueryData(List<CityContext> data);

        void cancelRefresh();

        void setNetWork();

    }
}

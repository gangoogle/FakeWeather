package com.butter.liuhe.weather.city;

import com.butter.liuhe.weather.BasePresenter;
import com.butter.liuhe.weather.BaseView;
import com.butter.liuhe.weather.data.source.local.entity.CityEntity;
import com.butter.liuhe.weather.data.source.local.entity.ProvinceEntity;

import java.util.List;

/**
 * Created by byhieg on 17/5/30.
 * Contact with byhieg@gmail.com
 */

public interface CityContract {

    interface ProvincePresenter extends BasePresenter{

        void loadData();
    }

    interface ProvinceView extends BaseView<ProvincePresenter>{

        void showProvinceData(List<ProvinceEntity> data);
    }


    interface CityPresenter extends BasePresenter {

        void loadCityData(String provinceName);

        void insertLoveCity(String cityName);

        void cancelCity(String cityName);

        void getCityWeather(String cityName);

        boolean isExist(String cityName);
    }

    interface CityView extends BaseView<CityPresenter> {

        void showNoData();

        void showCityData(List<CityEntity> data);

        void cancelRefresh();

        void setNetWork();

    }

}

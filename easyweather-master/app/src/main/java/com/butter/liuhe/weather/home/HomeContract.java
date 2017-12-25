package com.butter.liuhe.weather.home;

import android.content.Context;

import com.butter.liuhe.weather.BasePresenter;
import com.butter.liuhe.weather.BaseView;
import com.butter.liuhe.weather.data.bean.HWeather;
import com.butter.liuhe.weather.data.bean.WeekWeather;

import java.util.List;

/**
 * Created by byhieg on 17/5/27.
 * Contact with byhieg@gmail.com
 */

public interface HomeContract {

    interface View extends BaseView<Presenter>{

        void updateView(HWeather weather);

        void showNoData();

        void showDetail();

        void showPopupWindow();

        void setNetWork();

        void registerBroadCast();

        void generateTextView(android.view.View v);

        void updateWeeksView(List<WeekWeather> weathers, String[] weeks,List<Integer> lists);
    }


    interface Presenter extends BasePresenter{

        void doBaiduLocation();

        void loadWeather();

        String getShowCity();

        void doRefreshInNoData();

        void refreshData();

        void generateDataInPopView();

        void getNewShowWeather();

        void showDialog(String name,Context context);

        void updateDataInWeeks();

    }
}


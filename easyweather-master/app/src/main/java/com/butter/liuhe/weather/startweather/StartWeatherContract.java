package com.butter.liuhe.weather.startweather;

import com.butter.liuhe.weather.BasePresenter;
import com.butter.liuhe.weather.BaseView;

/**
 * Created by byhieg on 17/5/22.
 * Contact with byhieg@gmail.com
 */

public interface StartWeatherContract {

    interface View extends BaseView<Presenter>{

        void startService();
    }


    interface Presenter extends BasePresenter{

    }
}

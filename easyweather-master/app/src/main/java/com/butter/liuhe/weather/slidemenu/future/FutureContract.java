package com.butter.liuhe.weather.slidemenu.future;

import com.butter.liuhe.weather.BasePresenter;
import com.butter.liuhe.weather.BaseView;
import com.butter.liuhe.weather.data.bean.FutureContext;

import java.util.List;

/**
 * Created by byhieg on 17/5/30.
 * Contact with byhieg@gmail.com
 */

public interface FutureContract {

    interface Presenter extends BasePresenter {

        void loadData();
    }

    interface View extends BaseView<Presenter> {

        void showListView(List<FutureContext> list);
    }

}

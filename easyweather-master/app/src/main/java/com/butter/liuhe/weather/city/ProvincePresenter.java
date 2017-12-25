package com.butter.liuhe.weather.city;

import com.butter.liuhe.weather.data.source.CityRepository;
import com.butter.liuhe.weather.data.source.local.entity.ProvinceEntity;

import java.util.List;

/**
 * Created by byhieg on 17/5/30.
 * Contact with byhieg@gmail.com
 */

public class ProvincePresenter implements CityContract.ProvincePresenter{


    private CityRepository mRepository;
    private CityContract.ProvinceView mView;


    public ProvincePresenter(CityContract.ProvinceView view) {
        mView = view;
        mRepository = CityRepository.getInstance();
        mView.setPresenter(this);
    }


    public void start() {
        loadData();
    }

    @Override
    public void loadData() {

        List<ProvinceEntity> provinces = mRepository.getAllProvince();
        mView.showProvinceData(provinces);

    }

}

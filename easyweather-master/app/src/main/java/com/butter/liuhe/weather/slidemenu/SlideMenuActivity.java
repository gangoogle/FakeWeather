package com.butter.liuhe.weather.slidemenu;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.butter.liuhe.weather.base.BaseActivity;
import com.butter.liuhe.weather.R;
import com.butter.liuhe.weather.slidemenu.about.AboutFragment;
import com.butter.liuhe.weather.slidemenu.future.FutureFragment;
import com.butter.liuhe.weather.slidemenu.future.FuturePresenter;
import com.butter.liuhe.weather.slidemenu.help.HelpFragment;
import com.butter.liuhe.weather.slidemenu.lab.LaboratoryFragment;
import com.butter.liuhe.weather.slidemenu.setting.SettingFragment;
import com.butter.liuhe.weather.slidemenu.share.ShareFragment;
import com.butter.liuhe.weather.slidemenu.wiki.WikiFragment;
import com.butter.liuhe.weather.tools.Constants;
import butterknife.BindView;
import butterknife.ButterKnife;

public class SlideMenuActivity extends BaseActivity {

    @BindView(R.id.toolbar)
    public Toolbar toolbar;

    private FragmentManager fm;
    public FuturePresenter mPresenter;


    @Override
    public int getLayoutId() {
        return R.layout.activity_laboratory;
    }

    @Override
    public void initData() {
        ButterKnife.bind(this);

        fm = getSupportFragmentManager();
    }
    @Override
    public void initView() {

        int position = getIntent().getIntExtra("itemId", 0);
        switch (position){
            case Constants.FUTURE:
                toolbar.setTitle(R.string.future);
                FutureFragment futureFragment = new FutureFragment();
                fm.beginTransaction()
                        .add(R.id.fragment, futureFragment,FutureFragment.TAG).commit();
                mPresenter = new FuturePresenter(futureFragment);
                break;
            case Constants.SETTING:
                toolbar.setTitle(R.string.setting);
                Fragment fragment = new SettingFragment();
                fm.beginTransaction()
                        .add(R.id.fragment, fragment,SettingFragment.TAG).commit();
                break;
            case Constants.SHARE:
                toolbar.setTitle(R.string.share);
                fragment = new ShareFragment();
                fm.beginTransaction()
                        .add(R.id.fragment, fragment,ShareFragment.TAG).commit();
                break;
            case Constants.HELP:
                toolbar.setTitle(R.string.help);
                fragment = new HelpFragment();
                fm.beginTransaction()
                        .add(R.id.fragment, fragment,HelpFragment.TAG).commit();
                break;
            case Constants.LAB:
                toolbar.setTitle(R.string.laboratory);
                fragment = new LaboratoryFragment();
                fm.beginTransaction()
                        .add(R.id.fragment, fragment, LaboratoryFragment.TAG).commit();
                break;
            case Constants.WIKI:
                toolbar.setTitle(R.string.wiki);
                fragment = new WikiFragment();
                fm.beginTransaction()
                        .add(R.id.fragment, fragment, WikiFragment.TAG).commit();
                break;
            case Constants.ABOUT:
                toolbar.setTitle(R.string.about);
                fragment = new AboutFragment();
                fm.beginTransaction()
                        .add(R.id.fragment, fragment,AboutFragment.TAG).commit();
                break;
        }

        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setHomeButtonEnabled(true); //设置返回键可用
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }


    }


    @Override
    public void initEvent() {
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }


    @Override
    public void initTheme() {

    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}

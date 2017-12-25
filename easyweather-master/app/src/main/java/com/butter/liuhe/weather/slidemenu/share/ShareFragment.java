package com.butter.liuhe.weather.slidemenu.share;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.butter.liuhe.weather.base.BaseFragment;
import com.butter.liuhe.weather.tools.ShareContent;
import com.butter.liuhe.weather.MyApplication;
import com.butter.liuhe.weather.R;

import java.io.File;

/**
 * A simple {@link Fragment} subclass.
 */
public class ShareFragment extends BaseFragment {
    public static final String TAG = "com.butter.liuhe.weather.slidemenu.share.ShareFragment";
    private File[] files = new File[3];

    public ShareFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        getActivity().setTheme(R.style.DayTheme);
        if (MyApplication.nightMode2()) {
            initNightView(R.layout.night_mode_overlay);
        }
        View view = inflater.inflate(R.layout.fragment_share, container, false);
        files[0] = new File(MyApplication.getAppContext().getExternalFilesDir(null),
                "IMG-BRIEF"  + ".png");
        files[1] = new File(MyApplication.getAppContext().getExternalFilesDir(null),
                "IMG-DETAIL" + ".png");
        files[2] = new File(MyApplication.getAppContext().getExternalFilesDir(null),
                "IMG-FUTURE"  + ".png");
        initView(view);
        return view;
    }

    private void initView(View view){
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView_brief);
        imageView.setImageURI(Uri.fromFile(files[0]));

        ImageView imageDetail = (ImageView) view.findViewById(R.id.imageView_detail);
        imageDetail.setImageURI(Uri.fromFile(files[1]));

        ImageView imageFuture = (ImageView) view.findViewById(R.id.imageView_future);
        imageFuture.setImageURI(Uri.fromFile(files[2]));

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShareContent shareContent = new ShareContent();
                startActivity(Intent.createChooser(
                        shareContent.startShare(
                                getActivity().getClass().getSimpleName(),
                                files[0]),"分享天气"));
            }
        });

        imageDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShareContent shareContent = new ShareContent();
                startActivity(Intent.createChooser(
                        shareContent.startShare(
                                getActivity().getClass().getSimpleName(),
                                files[1]),"分享天气"));
            }
        });

        imageFuture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShareContent shareContent = new ShareContent();
                startActivity(Intent.createChooser(
                        shareContent.startShare(
                                getActivity().getClass().getSimpleName(),
                                files[2]),"分享天气"));
            }
        });

    }



    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}

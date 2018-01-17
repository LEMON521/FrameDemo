package cn.net.darking.framedemo.xutils3.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.xutils.x;

import cn.net.darking.framedemo.app.MyApplication;

/**
 * Created by Zrzc on 2018/1/17.
 */

public abstract class XutilsBaseFragment extends Fragment {
    public View view;
    public FragmentActivity mActivity;
    public Context mContext;
    public MyApplication APP;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        mActivity = getActivity();
        mContext = getContext();
        APP = (MyApplication) mActivity.getApplication();
        view = x.view().inject(this, inflater, null);
        initData();
        return view;
    }

    /**
     * 初始化页面
     */
    public abstract void initData();
}

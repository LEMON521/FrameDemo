package cn.net.darking.framedemo.xutils3.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;

import org.xutils.x;

/**
 * Created by Zrzc on 2018/1/17.
 */

public abstract class XUtilsBaseActivity extends FragmentActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        x.view().inject(this);
        initData();
    }

    public abstract void initData();

}

package cn.net.darking.framedemo.xutils3.activity;

import android.widget.TextView;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;

import cn.net.darking.framedemo.R;
import cn.net.darking.framedemo.xutils3.fragment.XutilsBaseFragment;
import cn.net.darking.framedemo.xutils3.fragment.XutilsFragment;

/**
 * Created by Zrzc on 2018/1/17.
 */
@ContentView(R.layout.activity_xutils)
public class XUtilsDemoActivity extends XUtilsBaseActivity {
    @ViewInject(R.id.activity_xutils_tv_not)
    private TextView tvNot;


    private XutilsBaseFragment fragment;

    @Override
    public void initData() {

        fragment = new XutilsFragment();

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.activity_xutils_fl
                        , fragment
                        , "XutilsFragment")
                .commit();
    }

}

package cn.net.darking.framedemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import cn.net.darking.framedemo.xutils3.activity.XUtilsDemoActivity;

import static cn.net.darking.framedemo.xutils3.utils.XUtilsUtils.showToastShort;

public class MainActivity extends Activity implements View.OnClickListener, View.OnLongClickListener {
    private Button btnXUtils;
//    private Button btnXUtils;
//    private Button btnXUtils;
//    private Button btnXUtils;
//    private Button btnXUtils;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

    }

    private void initView() {
        btnXUtils = (Button) findViewById(R.id.activity_main_btn_xutils);

        btnXUtils.setOnClickListener(this);
        btnXUtils.setOnLongClickListener(this);
    }

    /**
     * 点击事件
     *
     * @param v
     */
    @Override
    public void onClick(View v) {
        Intent openActivity = new Intent();

        switch (v.getId()) {
            case R.id.activity_main_btn_xutils:
                openActivity.setClass(MainActivity.this, XUtilsDemoActivity.class);
                startActivity(openActivity);
                break;
        }
    }

    /**
     * 长按点击事件
     *
     * @param v
     * @return boolean
     * false:不拦截事件,继续向下分发
     * true: 拦截事件,事件不会继续分发
     */
    @Override
    public boolean onLongClick(View v) {

        switch (v.getId()) {
            case R.id.activity_main_btn_xutils:
                showToastShort("Xutils按钮被长按!");
                break;
        }

        return true;
    }
}

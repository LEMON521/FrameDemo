package cn.net.darking.framedemo.xutils3.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by Zrzc on 2018/1/17.
 */

public abstract class XUtilsBaseAdapter extends BaseAdapter {

    public List<Object> data;
    public Context context;

    public XUtilsBaseAdapter(Context context, List data) {
        this.data = data;
        this.context = context;
    }

    @Override
    public int getCount() {
        return data == null ? -1 : data.size();
    }

    /**
     * 可重写,返回所需数据类型
     *
     * @param position
     * @return 所选条目返回值-默认为条目数据
     */
    @Override
    public Object getItem(int position) {
        return data == null ? null : data.get(position);
    }


    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public abstract View getView(int position, View convertView, ViewGroup parent);


}

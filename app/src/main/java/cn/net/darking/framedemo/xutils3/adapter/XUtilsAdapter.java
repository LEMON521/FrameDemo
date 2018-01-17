package cn.net.darking.framedemo.xutils3.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import cn.net.darking.framedemo.R;

/**
 * Created by Zrzc on 2018/1/17.
 */

public class XUtilsAdapter extends XUtilsBaseAdapter {
    public XUtilsAdapter(Context context, List data) {
        super(context, data);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Holder tag = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(
                    R.layout.item_xutils, null);
            tag = new Holder();
            tag.name = (TextView) convertView.findViewById(R.id.item_xutils_tv);
            convertView.setTag(tag);
        }
        //设置数据
        tag = (Holder) convertView.getTag();
        tag.name.setText(data.get(position).toString());

        return convertView;
    }

    public static class Holder {
        public TextView name;//文件名称
    }
}

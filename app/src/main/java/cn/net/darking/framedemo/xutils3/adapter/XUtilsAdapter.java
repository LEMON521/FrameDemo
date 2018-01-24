package cn.net.darking.framedemo.xutils3.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

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
        Holder holder = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(
                    R.layout.item_xutils, null);
            holder = new Holder();
//            tag.name = (TextView) convertView.findViewById(R.id.item_xutils_tv);
            x.view().inject(holder,convertView);
            convertView.setTag(holder);
        } else {
            holder = (Holder) convertView.getTag();
        }

        //设置数据
        holder.name.setText(data.get(position).toString());

        return convertView;
    }

    public class Holder {
        @ViewInject(R.id.item_xutils_tv)
        private TextView name;//文件名称
    }
}

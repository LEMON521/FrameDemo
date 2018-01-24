package cn.net.darking.framedemo.xutils3.fragment;

import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;

import java.util.ArrayList;

import cn.net.darking.framedemo.R;
import cn.net.darking.framedemo.xutils3.adapter.XUtilsAdapter;

import static cn.net.darking.framedemo.xutils3.utils.XUtilsUtils.showToastShort;

/**
 * Created by Zrzc on 2018/1/17.
 */
@ContentView(R.layout.fragment_xutils)
public class XutilsFragment extends XutilsBaseFragment implements AdapterView.OnItemClickListener {
    @ViewInject(R.id.fragment_xutils_lv)
    private ListView listView;

    @Override
    public void initData() {
        ArrayList<String> data = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            data.add("条目:: " + i + " ==");
        }

        BaseAdapter adapter = new XUtilsAdapter(mContext, data);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(this);
    }

    /**
     * 条目点击事件
     *
     * @param parent
     * @param view
     * @param position
     * @param id
     */
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position % 3) {
            case 0:
                showToastShort("条目" + position + "被点击了");
                break;

            case 1:
                showToastShort(R.string.xutils);
                break;

            case 2:
                showToastShort(R.layout.item_xutils);
                break;

        }

    }
}

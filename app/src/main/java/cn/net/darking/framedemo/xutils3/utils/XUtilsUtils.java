package cn.net.darking.framedemo.xutils3.utils;

/**
 * Created by Zrzc on 2018/1/17.
 */

import android.widget.Toast;

import org.xutils.common.util.LogUtil;
import org.xutils.x;

/**
 * xUtils相关的工具类
 */
public class XUtilsUtils {

    /**
     * 显示吐司-短时间
     *
     * @param str
     */
    public static void showToastShort(CharSequence str) {
        Toast.makeText(x.app(), str, Toast.LENGTH_SHORT).show();
    }

    /**
     * 显示吐司-短时间
     *
     * @param resId string下面的资源名称
     *              如果是View的id的话,会显示false
     *              如果是layout的话,会显示该xml的路径以及文件名:res/layout/XXX.xml
     */
    public static void showToastShort(int resId) {
        Toast.makeText(x.app(), resId, Toast.LENGTH_SHORT).show();
    }

    /**
     * 显示吐司-长时间
     *
     * @param str
     */
    public static void showToastLong(CharSequence str) {
        Toast.makeText(x.app(), str, Toast.LENGTH_LONG).show();
    }

    /**
     * 显示吐司-长时间
     *
     * @param resId string下面的资源名称
     */
    public static void showToastLong(int resId) {
        //一定不要忘记show
        Toast.makeText(x.app(), resId, Toast.LENGTH_LONG).show();
    }

    public static void showELog(String log) {
        LogUtil.e(log);
    }
}

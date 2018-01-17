package cn.net.darking.framedemo.xutils3.utils;

/**
 * Created by Zrzc on 2018/1/17.
 */

import android.content.Context;
import android.widget.Toast;

import org.xutils.common.util.LogUtil;

/**
 * xUtils相关的工具类
 */
public class XUtilsUtils {

    /**
     * 显示吐司-短时间
     *
     * @param context
     * @param str
     */
    public static void showToastShort(Context context, CharSequence str) {
        Toast.makeText(context, str, Toast.LENGTH_SHORT).show();
    }

    /**
     * 显示吐司-短时间
     *
     * @param context
     * @param resId   string下面的资源名称
     *                如果是View的id的话,会显示false
     *                如果是layout的话,会显示该xml的路径以及文件名:res/layout/XXX.xml
     */
    public static void showToastShort(Context context, int resId) {
        Toast.makeText(context, resId, Toast.LENGTH_SHORT).show();
    }

    /**
     * 显示吐司-长时间
     *
     * @param context
     * @param str
     */
    public static void showToastLong(Context context, CharSequence str) {
        Toast.makeText(context, str, Toast.LENGTH_LONG).show();
    }

    /**
     * 显示吐司-长时间
     *
     * @param context
     * @param resId   string下面的资源名称
     */
    public static void showToastLong(Context context, int resId) {
        //一定不要忘记show
        Toast.makeText(context, resId, Toast.LENGTH_LONG).show();
    }

    public static void showELog(String log) {
        LogUtil.e(log);
    }
}

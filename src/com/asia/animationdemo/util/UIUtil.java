package com.asia.animationdemo.util;

import android.app.Activity;
import android.util.DisplayMetrics;

public class UIUtil {
    
    /**
     * 获取屏幕宽度(像素px)
     * @return
     */
    public static int getScreenWidthInPx(Activity activity){
        DisplayMetrics metric = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(metric);
        return metric.widthPixels;
    }
    
    /**
     * 获取屏幕高度(像素px)
     * @return
     */
    public static int getScreenHeightInPx(Activity activity){
        DisplayMetrics metric = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(metric);
        return metric.heightPixels;
    }

}

package com.wu.allen.myone.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by allen on 2016/7/15.
 */

public class ToastUtil {

    public static Toast sToast;
    // shortTime
    public static void showShort(Context context, String info) {
        if (sToast == null){
            sToast = Toast.makeText(context, info, Toast.LENGTH_SHORT);
        }else{
            sToast.setText(info);
        }
        sToast.show();
    }
    // LongTime
    public static void showLong(Context context, String info) {
        if (sToast == null){
            sToast = Toast.makeText(context, info, Toast.LENGTH_LONG);
        }else{
            sToast.setText(info);
        }
        sToast.show();
    }
}

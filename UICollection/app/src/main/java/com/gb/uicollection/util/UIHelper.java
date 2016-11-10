package com.gb.uicollection.util;

import android.content.Context;
import android.content.Intent;

/**
 * @author gaobo
 * @version V1.0
 * @Description:
 * @date 16/11/10 下午3:26
 */
public class UIHelper {
    public static void showToActivity(Context context, Class clazz) {
        Intent intent = new Intent(context, clazz);
        context.startActivity(intent);
    }
}

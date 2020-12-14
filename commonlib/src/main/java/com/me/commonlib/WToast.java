package com.me.commonlib;

import android.content.Context;
import android.widget.Toast;

public class WToast {
    public static void showToast(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}

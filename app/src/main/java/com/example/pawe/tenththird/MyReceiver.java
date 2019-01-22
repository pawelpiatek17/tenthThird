package com.example.pawe.tenththird;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.Date;

public class MyReceiver extends BroadcastReceiver {

    public static final String EXTRA = "com.example.pawe.tenth.EXTRA";

    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle result = getResultExtras(true);
        String string = result.getString(EXTRA);
        StringBuilder stringBuilder = new StringBuilder();
        if (string != null){
            stringBuilder.append(string);
            stringBuilder.append(" TenthThird ");
        } else {
            stringBuilder.append("Broadcast received TenthThird ");
        }
        stringBuilder.append(new Date().toString());
        result.putString(EXTRA,stringBuilder.toString());
        Toast.makeText(context, stringBuilder, Toast.LENGTH_SHORT).show();
    }
}

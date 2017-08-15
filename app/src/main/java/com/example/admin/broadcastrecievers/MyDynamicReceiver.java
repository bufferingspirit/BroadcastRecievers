package com.example.admin.broadcastrecievers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Admin on 8/15/2017.
 */

public class MyDynamicReceiver extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context, intent.getStringExtra("data"), Toast.LENGTH_SHORT).show();
    }
}

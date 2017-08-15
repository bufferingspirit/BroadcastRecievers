package com.example.admin.broadcastrecievers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyStatcReceiver extends BroadcastReceiver {

    public static final String TAG = "BroadCastReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {

        switch(intent.getAction()){
            case "myAction":

                Log.d(TAG, "onReceive" + "myAction");
                break;
            case "myAction2":

                Log.d(TAG, "onReceive" + "myAction2");
                break;
            case Intent.ACTION_AIRPLANE_MODE_CHANGED:

                Log.d(TAG, "onReceive" + "AirplaneMode" );
                break;
        }

    }
}

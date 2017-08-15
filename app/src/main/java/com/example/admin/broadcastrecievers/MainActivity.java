package com.example.admin.broadcastrecievers;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    MyDynamicReceiver myDynamicReceiver = new MyDynamicReceiver();
    IntentFilter intentFilter;
    EditText etText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etText = (EditText) findViewById(R.id.etText);
    }

    public void sendBroadcasts(View view){

        switch (view.getId()){

            case R.id.btnStaticBroadcast2:
                Intent intent = new Intent();
                intent.setAction("myAction2");
                sendBroadcast(intent);
                break;
            case R.id.btnStaticBroadcast:

                Intent intent1 = new Intent();
                intent1.setAction("myAction");
                sendBroadcast(intent1);
                break;

            case R.id.btnSendDynamicBroadcast:
                Intent intent2 = new Intent();
                intent2.setAction("Do things");
                sendBroadcast(intent2);
                break;
            case R.id.btnSendText:
                String out = etText.getText().toString();
                Intent intent3 = new Intent();
                intent3.putExtra("data", out);
                intent3.setAction("SendText");
                sendBroadcast(intent3);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();

        intentFilter = new IntentFilter();
        //intentFilter.addAction("Do things");
        intentFilter.addAction("SendText");

        registerReceiver(myDynamicReceiver, intentFilter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        unregisterReceiver(myDynamicReceiver);
    }
}

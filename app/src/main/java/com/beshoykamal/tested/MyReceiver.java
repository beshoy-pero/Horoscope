package com.beshoykamal.tested;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent in=new Intent(context,MyIntentService.class);
        Toast.makeText(context, "Reciver", Toast.LENGTH_SHORT).show();
        context.startService(in);
    }
}

package com.beshoykamal.tested;

import android.app.IntentService;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;

import androidx.core.app.NotificationCompat;

import static android.app.Notification.EXTRA_NOTIFICATION_ID;


public class MyIntentService extends IntentService {


    public MyIntentService() {
        super("MyIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {



        Intent in=new Intent(this,MainActivity.class);
        PendingIntent pending=PendingIntent.getActivity(this,0,in,0);

//        Intent brodcast=new Intent(this,MyReceiver.class);
//        brodcast.putExtra("toast message",message);

        NotificationManager manager=(NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        NotificationCompat.Builder builder=new NotificationCompat.Builder(this,"default");
        builder.setSmallIcon(R.mipmap.ic_launch)
                .setContentTitle("hello")
                .setContentText("hello now arrive your horscope from star...")

                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setAutoCancel(true)

                .setContentIntent(pending);
        Notification notification=builder.build();
        manager.notify(1,notification);
    }

}

package com.beshoykamal.tested;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity implements Response.ErrorListener, Response.Listener<JSONObject> {

    ImageView imageView,imageView2,imageView4,imageView3,imageView5,imageView6,imageView13;
    TextView viewall;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView=findViewById(R.id.imageView);
        imageView2=findViewById(R.id.imageView2);
        imageView4=findViewById(R.id.imageView4);
        imageView3=findViewById(R.id.imageView3);
        imageView5=findViewById(R.id.imageView5);
        imageView6=findViewById(R.id.imageView6);
//        imageView13=findViewById(R.id.imageView13);

        AnimationDrawable aimation1=new AnimationDrawable();

        aimation1.addFrame(getResources().getDrawable(R.drawable.v1),50);
        aimation1.addFrame(getResources().getDrawable(R.drawable.v2),50);
        aimation1.addFrame(getResources().getDrawable(R.drawable.v3),50);
        aimation1.addFrame(getResources().getDrawable(R.drawable.v4),50);
        aimation1.addFrame(getResources().getDrawable(R.drawable.v5),50);
        aimation1.addFrame(getResources().getDrawable(R.drawable.v6),50);

        aimation1.setOneShot(false);
        imageView.setImageDrawable(aimation1);
        aimation1.start();

        AnimationDrawable aimation2=new AnimationDrawable();
        aimation2.addFrame(getResources().getDrawable(R.drawable.virgo1),50);
        aimation2.addFrame(getResources().getDrawable(R.drawable.virgo2),50);
        aimation2.addFrame(getResources().getDrawable(R.drawable.virgo3),50);
        aimation2.addFrame(getResources().getDrawable(R.drawable.virgo4),50);
        aimation2.addFrame(getResources().getDrawable(R.drawable.virgo5),50);
        aimation2.addFrame(getResources().getDrawable(R.drawable.virgo6),50);
        aimation2.setOneShot(false);
        imageView2.setImageDrawable(aimation2);
        aimation2.start();

        AnimationDrawable aimation3=new AnimationDrawable();
        aimation3.addFrame(getResources().getDrawable(R.drawable.taurus1),50);
        aimation3.addFrame(getResources().getDrawable(R.drawable.taurus2),50);
        aimation3.addFrame(getResources().getDrawable(R.drawable.taurus3),50);
        aimation3.addFrame(getResources().getDrawable(R.drawable.taurus4),50);
        aimation3.addFrame(getResources().getDrawable(R.drawable.taurus5),50);
        aimation3.addFrame(getResources().getDrawable(R.drawable.taurus6),50);
        aimation3.setOneShot(false);
        imageView4.setImageDrawable(aimation3);
        aimation3.start();
//
        AnimationDrawable animationscorp=new AnimationDrawable();
        animationscorp.addFrame(getResources().getDrawable(R.drawable.scorpio1),50);
        animationscorp.addFrame(getResources().getDrawable(R.drawable.scorpio2),50);
        animationscorp.addFrame(getResources().getDrawable(R.drawable.scorpio3),50);
        animationscorp.addFrame(getResources().getDrawable(R.drawable.scorpio4),50);
        animationscorp.addFrame(getResources().getDrawable(R.drawable.scorpio5),50);
        animationscorp.addFrame(getResources().getDrawable(R.drawable.scorpio6),50);
        animationscorp.setOneShot(false);
        imageView3.setImageDrawable(animationscorp);
        animationscorp.start();

        AnimationDrawable animationsagit=new AnimationDrawable();
        animationsagit.addFrame(getResources().getDrawable(R.drawable.sagit1),50);
        animationsagit.addFrame(getResources().getDrawable(R.drawable.sagit2),50);
        animationsagit.addFrame(getResources().getDrawable(R.drawable.sagit3),50);
        animationsagit.addFrame(getResources().getDrawable(R.drawable.sagit4),50);
        animationsagit.addFrame(getResources().getDrawable(R.drawable.sagit5),50);
        animationsagit.addFrame(getResources().getDrawable(R.drawable.sagit6),50);
        animationsagit.setOneShot(false);
        imageView5.setImageDrawable(animationsagit);
        animationsagit.start();

        AnimationDrawable piscesanimation=new AnimationDrawable();
        piscesanimation.addFrame(getResources().getDrawable(R.drawable.pisces1),50);
        piscesanimation.addFrame(getResources().getDrawable(R.drawable.pisces2),50);
        piscesanimation.addFrame(getResources().getDrawable(R.drawable.pisces3),50);
        piscesanimation.addFrame(getResources().getDrawable(R.drawable.pisces4),50);
        piscesanimation.addFrame(getResources().getDrawable(R.drawable.pisces5),50);
        piscesanimation.addFrame(getResources().getDrawable(R.drawable.pisces6),50);
        piscesanimation.setOneShot(false);
        imageView6.setImageDrawable(piscesanimation);
        piscesanimation.start();



    }


    public void img1(View view) {
        Intent in=new Intent(this,mview.class);
        in.putExtra("TA", "virgo");
        startActivity(in);
    }
    public void img2(View view) {

        Intent in=new Intent(this,mview.class);
            in.putExtra("TA", "cancer");
            startActivity(in);

    }
    public void img3(View view) {
        Intent in=new Intent(this,mview.class);
        in.putExtra("TA", "scorpio");
        startActivity(in);
    }
    public void img4(View view) {
        Intent in=new Intent(this,mview.class);
        in.putExtra("TA", "taurus");
        startActivity(in);
    }
    public void img5(View view) {
        Intent in=new Intent(this,mview.class);
        in.putExtra("TA", "pisces");
        startActivity(in);
    }
    public void img6(View view) {
        Intent in=new Intent(this,mview.class);
        in.putExtra("TA", "sagittarius");
        startActivity(in);
    }



    @Override
    public void onErrorResponse(VolleyError error) {

    }

    @Override
    public void onResponse(JSONObject response) {

        try {
            Toast.makeText(this, "tmam", Toast.LENGTH_SHORT).show();
            String targma = response.getJSONObject("responseData").getString("translatedText");

//            Intent in=new Intent(this,view.class);
//            in.putExtra("Targ", targma);
//            startActivity(in);

        }
        catch (JSONException e) {
            e.printStackTrace();
        }

    }

    public void next(View view) {

        Intent in=new Intent(this,MyReceiver.class);
        PendingIntent pending=PendingIntent.getBroadcast(this,0,in,0);

        AlarmManager manager=(AlarmManager) getSystemService(ALARM_SERVICE);
        manager.set(AlarmManager.ELAPSED_REALTIME_WAKEUP, SystemClock.elapsedRealtime()+10000,pending);

//        manager.setRepeating(AlarmManager.ELAPSED_REALTIME_WAKEUP,SystemClock.elapsedRealtime()+10000,SystemClock.elapsedRealtime()+10000,pending);

        Intent inn=new Intent(this,Horoscope.class);
        startActivity(inn);
    }
}

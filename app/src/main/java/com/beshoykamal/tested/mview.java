package com.beshoykamal.tested;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import org.json.JSONException;
import org.json.JSONObject;

public class mview extends AppCompatActivity implements Response.ErrorListener, Response.Listener<JSONObject> {
    String luck;
    TextView mview;
    MediaPlayer player1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mview);

        mview=findViewById(R.id.mview);
        player1 = MediaPlayer.create(this, R.raw.clock);

        Intent intent = getIntent();
        String Targ = intent.getExtras().getString("TA");



        RequestQueue queue= Volley.newRequestQueue(this);
        String url = "https://widgets.fabulously40.com/horoscope.json?sign="+Targ+"";
        JsonObjectRequest request=new JsonObjectRequest(url,null,this,this);
        queue.add(request);

    }








    @Override
public void onErrorResponse(VolleyError error) {
    Toast.makeText(this, "no service", Toast.LENGTH_SHORT).show();
}

    @Override
    public void onResponse(JSONObject response) {

//        Toast.makeText(this, ""+response, Toast.LENGTH_SHORT).show();

        try {
            luck= response.getJSONObject("horoscope").getString("horoscope");
            mview.setText(luck+"\n");
            YoYo.with(Techniques.Flash).duration(700).repeat(5).playOn(findViewById(R.id.mview));
            player1.start();

        }
        catch (JSONException e) {
            e.printStackTrace();
        }

        RequestQueue queue= Volley.newRequestQueue(this);
        String url1 = "http://api.mymemory.translated.net/get?q="+luck.replaceAll(" ","%20")+"&langpair=en|ar";

        JsonObjectRequest request1=new JsonObjectRequest(url1, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    String targma = response.getJSONObject("responseData").getString("translatedText");
                    mview.append("\n"+targma+"\n");
//                    progr.setVisibility(View.INVISIBLE);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }

        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {

                Toast.makeText(mview.this, "error translate", Toast.LENGTH_SHORT).show();
            }

        });
        queue.add(request1);


    }

    @Override
    public void onBackPressed() {
        if (player1 != null)
            player1.stop();
        super.onBackPressed();
    }
}

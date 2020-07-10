package com.beshoykamal.tested;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.List;

public class Horoscope extends AppCompatActivity {

    ImageView imageView7,imageView8,imageView9,imageView10,imageView11,imageView12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horoscope);
        imageView7 = findViewById(R.id.imageView7);
        imageView8 = findViewById(R.id.imageView8);
        imageView9 = findViewById(R.id.imageView9);
        imageView10=findViewById(R.id.imageView10);
        imageView11=findViewById(R.id.imageView11);
        imageView12=findViewById(R.id.imageView12);

        AnimationDrawable aimation7=new AnimationDrawable();
        aimation7.addFrame(getResources().getDrawable(R.drawable.libra1),50);
        aimation7.addFrame(getResources().getDrawable(R.drawable.libra),50);
        aimation7.addFrame(getResources().getDrawable(R.drawable.libra3),50);
        aimation7.addFrame(getResources().getDrawable(R.drawable.libra4),50);
        aimation7.addFrame(getResources().getDrawable(R.drawable.libra5),50);
        aimation7.addFrame(getResources().getDrawable(R.drawable.libra6),50);
        aimation7.setOneShot(false);
        imageView7.setImageDrawable(aimation7);
        aimation7.start();

        AnimationDrawable aimation8=new AnimationDrawable();
        aimation8.addFrame(getResources().getDrawable(R.drawable.leo2),50);
        aimation8.addFrame(getResources().getDrawable(R.drawable.leo3),50);
        aimation8.addFrame(getResources().getDrawable(R.drawable.leo4),50);
        aimation8.addFrame(getResources().getDrawable(R.drawable.leo5),50);
        aimation8.addFrame(getResources().getDrawable(R.drawable.leo6),50);
        aimation8.setOneShot(false);
        imageView8.setImageDrawable(aimation8);
        aimation8.start();


        AnimationDrawable aimation9=new AnimationDrawable();
        aimation9.addFrame(getResources().getDrawable(R.drawable.gemini1),50);
        aimation9.addFrame(getResources().getDrawable(R.drawable.gemini2),50);
        aimation9.addFrame(getResources().getDrawable(R.drawable.gemini3),50);
        aimation9.addFrame(getResources().getDrawable(R.drawable.gemini4),50);
        aimation9.addFrame(getResources().getDrawable(R.drawable.gemini5),50);
        aimation9.addFrame(getResources().getDrawable(R.drawable.gemini6),50);
        aimation9.setOneShot(false);
        imageView9.setImageDrawable(aimation9);
        aimation9.start();

        AnimationDrawable aimation10=new AnimationDrawable();
        aimation10.addFrame(getResources().getDrawable(R.drawable.capricon1),50);
        aimation10.addFrame(getResources().getDrawable(R.drawable.capricon2),50);
        aimation10.addFrame(getResources().getDrawable(R.drawable.capricon3),50);
        aimation10.addFrame(getResources().getDrawable(R.drawable.capricon4),50);
        aimation10.addFrame(getResources().getDrawable(R.drawable.capricon5),50);
        aimation10.addFrame(getResources().getDrawable(R.drawable.capricon6),50);
        aimation10.setOneShot(false);
        imageView10.setImageDrawable(aimation10);
        aimation10.start();

        AnimationDrawable aimation11=new AnimationDrawable();
        aimation11.addFrame(getResources().getDrawable(R.drawable.aries1),50);
        aimation11.addFrame(getResources().getDrawable(R.drawable.aries2),50);
        aimation11.addFrame(getResources().getDrawable(R.drawable.aries3),50);
        aimation11.addFrame(getResources().getDrawable(R.drawable.aries4),50);
        aimation11.addFrame(getResources().getDrawable(R.drawable.aries5),50);
        aimation11.addFrame(getResources().getDrawable(R.drawable.aries6),50);
        aimation11.setOneShot(false);
        imageView11.setImageDrawable(aimation11);
        aimation11.start();

        AnimationDrawable aimation12=new AnimationDrawable();
        aimation12.addFrame(getResources().getDrawable(R.drawable.aquarius1),50);
        aimation12.addFrame(getResources().getDrawable(R.drawable.aquarius2),50);
        aimation12.addFrame(getResources().getDrawable(R.drawable.aquarius3),50);
        aimation12.addFrame(getResources().getDrawable(R.drawable.aquarius4),50);
        aimation12.addFrame(getResources().getDrawable(R.drawable.aquarius5),50);
//        aimation12.addFrame(getResources().getDrawable(R.drawable.aquarius6),50);
        aimation12.setOneShot(false);
        imageView12.setImageDrawable(aimation12);
        aimation12.start();


    }





    public void img7(View view) {
        Intent in=new Intent(this,mview.class);
        in.putExtra("TA", "libra");
        startActivity(in);
    }
    public void img8(View view) {
        Intent in=new Intent(this,mview.class);
        in.putExtra("TA", "leo");
        startActivity(in);
    }
    public void img9(View view) {
        Intent in=new Intent(this,mview.class);
        in.putExtra("TA", "gemini");
        startActivity(in);
    }
    public void img10(View view) {
        Intent in=new Intent(this,mview.class);
        in.putExtra("TA", "capricorn");
        startActivity(in);
    }
    public void img11(View view) {
        Intent in=new Intent(this,mview.class);
        in.putExtra("TA", "aries");
        startActivity(in);
    }
    public void img12(View view) {
        Intent in=new Intent(this,mview.class);
        in.putExtra("TA", "aquarius");
        startActivity(in);
    }
}

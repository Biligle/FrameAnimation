package com.wgl.frameanimation;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView duck = (ImageView) findViewById(R.id.duck);
        duck.setImageResource(R.drawable.duck);
        AnimationDrawable animationDrawable = (AnimationDrawable) duck.getDrawable();
        animationDrawable.start();
    }
}

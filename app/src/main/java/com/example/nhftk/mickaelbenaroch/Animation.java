package com.example.nhftk.mickaelbenaroch;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;

import java.util.Iterator;
import java.util.Random;

public class Animation extends AppCompatActivity {

    private Box box;
    BouncingBallView bouncingBallView;
    private float previousX;
    private float previousY;
    private float deltaX;
    private float deltaY;
    public int i = 2;
    public int ballsCount = 0;
    public int x;
    public  int y;
    @Override
    public boolean onTouchEvent(MotionEvent event) {
//
        if(ballsCount < 10) {
            Random rnd = new Random();
            int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
            bouncingBallView.ballSet.get(i).setColor(color);
            i++;
            ballsCount +=1;
        }
        return super.onTouchEvent(event);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        bouncingBallView = new BouncingBallView(this);
        setContentView(bouncingBallView);
        bouncingBallView.setBackgroundColor(Color.BLACK);
        box = bouncingBallView.getBox();
        ballsCount = ballsCount+2;

        };
    }



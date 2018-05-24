package com.example.nhftk.mickaelbenaroch;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;

public class Circle {
    private int leftTopX;
    private int leftTopY;
    private int radius;
    private Paint paint;
    private RectF bounds;
    private int speedX;
    private int speedY;
    private int maxX;
    private int maxY;
    public int boxLeftTopX = 0;
    public int boxLeftTopY = 0;
    public int boxHeight = 0;
    public int boxWidth = 0;

    public Circle(int color){
        paint = new Paint();
        paint.setColor(color);
        bounds = new RectF();
    }

    public void setCOORDS(int x, int y, int radius){
        leftTopX = x;
        leftTopY = y;
        this.radius = radius;
        bounds.set(leftTopX, leftTopY, leftTopX+this.radius*2, leftTopY+this.radius*2);
    }

    public void setSpeed(int speedX, int speedY){
        this.speedX = speedX;
        this.speedY = speedY;
    }

    public void draw(Canvas canvas){
        canvas.drawOval(bounds, paint);
        update();
    }

    public void setMax(int maxX, int maxY){
        this.maxX = maxX;
        this.maxY = maxY;
    }

    public void setColor(int color){
        this.paint.setColor(color);
    }

    public void update() {
        if((leftTopX + 2*radius) > maxX || ((leftTopY + 2*radius) >1600 && (leftTopY + 2*radius)< 1400 && (leftTopX + 2*radius)>0 && (leftTopX + 2*radius)< 400)){
            speedX = speedX * -1;
        }else if(leftTopX < 0){
            speedX = speedX * -1;
        }

        if((leftTopY + 2*radius) > maxY || ((leftTopX + 2*radius) > 0 && (leftTopX + 2*radius)<400 && (leftTopY + 2*radius) >400 )){
            speedY = speedY * -1;
        }else if(leftTopY < 0){
            speedY = speedY * -1;
        }

        leftTopX = leftTopX + speedX;
        leftTopY = leftTopY + speedY;

        bounds.set(leftTopX, leftTopY, leftTopX+ 2*radius, leftTopY+ 2*radius);
    }
}

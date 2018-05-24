package com.example.nhftk.mickaelbenaroch;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

public class Box {

    private int leftTopX;
    private int leftTopY;
    private int height;
    private int width;
    private RectF bounds;
    private Paint paint;

    public Box(int color){
        paint = new Paint();
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(color);
        bounds = new RectF();
    }

    public void setCOORDs(int lefttopx, int lefttopy , int height, int width){
        this.leftTopX = lefttopx;
        this.leftTopY = lefttopy;
        this.height = height;
        this.width = width;
        bounds.set(lefttopx, lefttopy, lefttopx+width, lefttopy+height);
    }

    public void draw(Canvas canvas){
        canvas.drawRect(bounds, paint);

    }
}

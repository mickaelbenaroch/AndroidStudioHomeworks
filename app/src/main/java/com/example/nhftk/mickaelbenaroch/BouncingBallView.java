package com.example.nhftk.mickaelbenaroch;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;

import java.util.ArrayList;
import java.util.Iterator;

public class BouncingBallView extends View {

    int maxX, maxY; //screen size
    private Circle ball;
    private Box box;
    public ArrayList<Circle> ballSet = new ArrayList<Circle>();



    public Box getBox() {
        return box;
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        maxX = w;
        maxY = h;

        Iterator itr = ballSet.iterator();
        while (itr.hasNext()){
            Circle ball = (Circle) itr.next();
            ball.setMax(maxX, maxY);
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Iterator itr  = ballSet.iterator();
        while (itr.hasNext()){
            Circle ball = (Circle) itr.next();
            ball.draw(canvas);
        }
        box.draw(canvas);
        invalidate();
    }

    public BouncingBallView(Context context) {
        super(context);
        ball = new Circle(Color.GREEN);
        ball.setCOORDS(0,0,40);
        ball.setSpeed(5,5);
        ballSet.add(ball);

        ball = new Circle(Color.RED);
        ball.setCOORDS(0,0,40);
        ball.setSpeed(12,12);
        ballSet.add(ball);

        ball = new Circle(Color.BLACK);
        ball.setCOORDS(0,0,40);
        ball.setSpeed(13,13);
        ballSet.add(ball);

        ball = new Circle(Color.BLACK);
        ball.setCOORDS(0,0,40);
        ball.setSpeed(14,14);
        ballSet.add(ball);

        ball = new Circle(Color.BLACK);
        ball.setCOORDS(0,0,40);
        ball.setSpeed(4,4);
        ballSet.add(ball);

        ball = new Circle(Color.BLACK);
        ball.setCOORDS(0,0,40);
        ball.setSpeed(5,5);
        ballSet.add(ball);

        ball = new Circle(Color.BLACK);
        ball.setCOORDS(0,0,40);
        ball.setSpeed(6,6);
        ballSet.add(ball);

        ball = new Circle(Color.BLACK);
        ball.setCOORDS(0,0,40);
        ball.setSpeed(7,7);
        ballSet.add(ball);

        ball = new Circle(Color.BLACK);
        ball.setCOORDS(0,0,40);
        ball.setSpeed(8,8);
        ballSet.add(ball);

        ball = new Circle(Color.BLACK);
        ball.setCOORDS(0,0,40);
        ball.setSpeed(9,9);
        ballSet.add(ball);

        ball = new Circle(Color.BLACK);
        ball.setCOORDS(0,0,40);
        ball.setSpeed(10,10);
        ballSet.add(ball);

        box = new Box(Color.BLUE);
        box.setCOORDs(0,1400,200,400);

    }

    public void createBall(int color, int x, int y, int radius, int speedx, int speedy){
        Circle newBall;
        newBall = new Circle(color);
        newBall.setCOORDS(x,y,radius);
        newBall.setSpeed(speedx, speedy);
        ballSet.add(newBall);


    }
}

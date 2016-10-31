package com.example.admina.mydemo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;


public class MyView extends View{
    private float x=10;
    private float y=10;
    private Paint paint=new Paint();

    //被覆盖的内容图层
    private Bitmap bpBackground;
    //用来当做覆盖用的图层
    private Bitmap bpForeground;
    //用来当做覆盖用的图层的画布
    private Canvas mCanvas;
    //模拟手指头刮开路径的画笔
    private Paint pathPaint;
    //手指头刮开的路径
    private Path path;

    //用来当做覆盖用的图层的文字画笔
    private Paint contentPaint;
    //用来当做覆盖用的图层的文字内容
    private String content = "刮刮";



    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }



}

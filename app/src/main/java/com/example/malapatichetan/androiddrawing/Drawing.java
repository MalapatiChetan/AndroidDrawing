package com.example.malapatichetan.androiddrawing;


import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import static com.example.malapatichetan.androiddrawing.R.drawable.bablu;
import static com.example.malapatichetan.androiddrawing.R.drawable.ic_launcher_foreground;

public class Drawing extends View {
    private Bitmap bitmap;
  private Paint Brush;
  private    Paint redbrush;
  private LinearGradient linearGradient;
  private RadialGradient radialGradient;
  private SweepGradient sweepGradient;
    public Drawing(Context context) {
        super(context);
        init();
    }
//
//    public Drawing(Context context, @Nullable AttributeSet attrs) {
//        super(context, attrs);
//    }
//
//    public Drawing(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
//        super(context, attrs, defStyleAttr);
//    }
//
//    public Drawing(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
//        super(context, attrs, defStyleAttr, defStyleRes);
//    }
    public void init(){
      bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.bablu);
        Brush = new Paint(Paint.ANTI_ALIAS_FLAG);
      redbrush = new Paint(Paint.ANTI_ALIAS_FLAG);
      redbrush.setColor(Color.RED);
      redbrush.setStrokeWidth(23f);
     Brush.setColor(Color.parseColor("green"));
     linearGradient = new LinearGradient(0,0,200,200, Color.RED,Color.BLACK, Shader.TileMode.REPEAT);
     Brush.setShader(linearGradient);
    }

    @Override
    protected void onDraw(Canvas canvas) {
      //  canvas.drawBitmap(bitmap,(getMeasuredWidth()/2-bitmap.getHeight()/2),getMeasuredHeight()/2-bitmap.getWidth()/2,   null);

      canvas.drawCircle(getMeasuredWidth()/2,getMeasuredHeight()/2,300f,Brush);

        canvas.drawLine(0,0,getMeasuredWidth()/2-bitmap.getHeight()/2,getMeasuredHeight()/2-bitmap.getWidth()/2,redbrush);
       canvas.save();
        super.onDraw(canvas);

    }
}

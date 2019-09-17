package com.example.malapatichetan.androiddrawing;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.TextView;

public class CustomTextView extends android.support.v7.widget.AppCompatTextView{
private Paint textcolor;
    public CustomTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    @Override
    protected void onDraw(Canvas canvas) {
canvas.drawText("hai chetan",getMeasuredWidth()/2,getMeasuredHeight()/2,textcolor);
canvas.save();
        super.onDraw(canvas);
    }
    public void init(){
textcolor = new Paint(Paint.ANTI_ALIAS_FLAG);
textcolor.setTextSize(90f);
textcolor.setTextAlign(Paint.Align.CENTER);
textcolor.setColor(Color.parseColor("green"));
    }


}

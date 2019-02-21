package com.example.junxiantan.callbackeventtest;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.Toast;
import android.view.MotionEvent;

public class MyButton extends Button {
    Context context;
    public  MyButton(Context context, AttributeSet attrs){
        super(context, attrs);
        this.context=context;
    }
    public boolean onTouchEvent(MotionEvent event){
        Toast.makeText(context, "MyButton中触摸事件触发了！",Toast.LENGTH_SHORT).show();
        return true;
    }
}

package com.example.finger;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Button;

public class B  extends Button{

	public B(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

@Override
public boolean onTouchEvent(MotionEvent event) {
	// TODO Auto-generated method stub
	System.out.println("Button_处理"+super.onTouchEvent(event));
	return super.onTouchEvent(event);
}
}

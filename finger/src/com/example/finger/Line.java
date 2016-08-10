package com.example.finger;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

public class Line extends RelativeLayout{

	public Line(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}
@Override
public boolean dispatchTouchEvent(MotionEvent ev) {
	// TODO Auto-generated method stub
	System.out.println("Relative_分发"+super.dispatchTouchEvent(ev));
	return super.dispatchTouchEvent(ev);
}
@Override
public boolean onInterceptTouchEvent(MotionEvent ev) {
	// TODO Auto-generated method stub
	System.out.println("Relative_拦截"+super.onInterceptTouchEvent(ev));
	return super.onInterceptTouchEvent(ev);
}
@Override
public boolean onTouchEvent(MotionEvent event) {
	// TODO Auto-generated method stub
	System.out.println("Relative_处理"+super.onTouchEvent(event));
	return super.onTouchEvent(event);
}
}

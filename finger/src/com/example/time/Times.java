package com.example.time;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.view.View;

public class Times extends View{

	public Times(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}
@Override
protected void onDraw(Canvas canvas) {
	// TODO Auto-generated method stub
	super.onDraw(canvas);
	Paint paint=new Paint();
	paint.setStrokeWidth(2);
	paint.setStyle(Style.STROKE);
	paint.setColor(Color.BLUE);
	canvas.drawCircle(220,300, 150, paint);
	for(int i=1;i<13;i++)
	{
		canvas.save();
		canvas.rotate(30*i);
		canvas.drawLine(220, 130, 220, 150, paint);
		canvas.restore();
	}
}
}

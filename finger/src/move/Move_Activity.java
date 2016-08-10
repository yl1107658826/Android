package move;

import com.example.finger.R;

import android.R.bool;
import android.R.integer;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.View;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Move_Activity extends Activity{
	TextView assistant,main,click;
	RelativeLayout relative;
	GestureDetector detector;
	View view;
    int location[]=new int[2];
    boolean open=false;
protected void onCreate(Bundle savedInstanceState) 
{
	super.onCreate(savedInstanceState);
	setContentView(R.layout.main_layout);
	assistant=(TextView)findViewById(R.id.tv_assistant);
	main=(TextView)findViewById(R.id.tv_main);
	click=(TextView)findViewById(R.id.text);
	relative=(RelativeLayout)findViewById(R.id.relative);
	click.setOnClickListener(listener);
	relative.setOnTouchListener(new OnTouchListener() {
		
		@Override
		public boolean onTouch(View view, MotionEvent event) {
			// TODO Auto-generated method stub
			
			return detector.onTouchEvent(event);
		}
	});
	detector=new GestureDetector(Move_Activity.this, gestureListener);
}
OnGestureListener gestureListener=new OnGestureListener() {
	
	@Override
	public boolean onSingleTapUp(MotionEvent arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public void onShowPress(MotionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@SuppressLint("NewApi")
	@Override
	public boolean onScroll(MotionEvent e1, MotionEvent e2, float arg2,
			float arg3) {
		int x=(int)(e2.getX()-e1.getX());
		relative.getLocationOnScreen(location);
		int delt=location[0];
		if(delt<=0 && x>0)
		{
			relative.offsetLeftAndRight(x/4);
			assistant.offsetLeftAndRight(x/8);
			return true;
		}
		else if(delt<=0 && x<0)
		{
			return true;
		}
		else {
			relative.offsetLeftAndRight(x/4);
			assistant.offsetLeftAndRight(x/8);
		}
		
	
	    return true;
	}
	
	@Override
	public void onLongPress(MotionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public boolean onFling(MotionEvent e1, MotionEvent e2, float arg2,
			float arg3) {
		
	
		return false;
		
	}
	
	@Override
	public boolean onDown(MotionEvent arg0) {
		// TODO Auto-generated method stub
		return true;
	}
};
OnClickListener listener=new OnClickListener() {
	
	@Override
	public void onClick(View view) {
		// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(), "点击", 0).show();
	}
};
}

/*package move;



import com.example.finger.R;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;

import android.R.integer;
import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;

public class Slide_Activity extends Activity{
SlidingMenu menu;
TextView text,click;
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	requestWindowFeature(Window.FEATURE_NO_TITLE);
	setContentView(R.layout.main_layout);
	View view=getLayoutInflater().inflate(R.layout.slide, null);
	text=(TextView)findViewById(R.id.text);
	
	//获取屏幕的宽度
	//DisplayMetrics metrics=new DisplayMetrics();
	int width=getWindowManager().getDefaultDisplay().getWidth();
	int height=getWindowManager().getDefaultDisplay().getHeight();
	float density=getResources().getDisplayMetrics().density;
	System.out.println("width"+width);
	System.out.println("height"+height);
	System.out.println("density"+density);
	//System.out.println("dpi"+metrics.densityDpi);
	menu=new SlidingMenu(this);
	//设置菜单的位置在左边
	menu.setMode(SlidingMenu.LEFT);
	//设置触摸的模式为全屏模式,菜单打开以后，点击主页面，不会触发点击事件，并且主页面关闭。
	menu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
	//设置菜单的布局文件
	menu.setMenu(view);
	//设置菜单渐变  0表示没有渐变。
	menu.setFadeDegree(0);
	//设置划出时候主页面的剩余宽度=屏幕宽度*0.3
	menu.setBehindOffset((int) (width*0.3));
	//把菜单添加到主页面
	menu.attachToActivity(Slide_Activity.this,SlidingMenu.SLIDING_CONTENT);
  
    click=(TextView)view.findViewById(R.id.tv_click);
	text.setOnClickListener(clickListener);
	click.setOnClickListener(clickListener);
}
OnClickListener clickListener=new OnClickListener() {
	
	@Override
	public void onClick(View view) {
		// TODO Auto-generated method stub
		switch (view.getId()) {
		case R.id.text:
			Toast.makeText(getApplicationContext(), "点击了主页面", 0).show();
			break;

		case R.id.tv_click:
			Toast.makeText(getApplicationContext(), "点击了副页面", 0).show();
			break;
		}
		
	}
};
}
*/
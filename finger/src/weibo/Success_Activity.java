/*package weibo;

import com.example.finger.R;
import com.sina.weibo.sdk.exception.WeiboException;
import com.sina.weibo.sdk.net.AsyncWeiboRunner;
import com.sina.weibo.sdk.net.RequestListener;
import com.sina.weibo.sdk.net.WeiboParameters;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Success_Activity extends Activity{
	TextView msg;
	Button btn;
	String url="https://api.weibo.com/2/statuses/public_timeline.json";
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.weibo);
	msg=(TextView)findViewById(R.id.tv_msg);
	btn=(Button)findViewById(R.id.btn_weibo);
	btn.setOnClickListener(listener);
	
}
OnClickListener listener=new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		get();
	}
};
private void get(){
	String token=getSharedPreferences("yang", MODE_PRIVATE).getString("token", null);
	if(token==null)
	{
		Toast.makeText(getApplicationContext(), "share token not exist" , 0).show();
		return;
	}
	WeiboParameters params=new WeiboParameters("92494654");
	params.put("access_token",token);
	AsyncWeiboRunner runner=new AsyncWeiboRunner(this);                //创建一个异步的网络请求对象
	runner.requestAsync(url, params, "GET", new RequestListener() {     //执行网络请求
		
		@Override
		public void onWeiboException(WeiboException arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void onComplete(String string) {                  //返回请求的结果
			// TODO Auto-generated method stub
			System.out.println(string);
		}
	});
}

}
*/
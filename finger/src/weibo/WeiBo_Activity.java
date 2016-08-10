/*package weibo;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.example.finger.R;
import com.sina.weibo.sdk.auth.AuthInfo;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.sina.weibo.sdk.auth.WeiboAuthListener;
import com.sina.weibo.sdk.auth.sso.SsoHandler;
import com.sina.weibo.sdk.exception.WeiboException;
import com.sina.weibo.sdk.net.AsyncWeiboRunner;

public class WeiBo_Activity extends Activity{
	Button btn;
	String appkey="92494654";
	String redirectUrl="https://api.weibo.com/oauth2/default.html";
	SsoHandler mSsoHandler;
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.weibo);
	btn=(Button)findViewById(R.id.btn_weibo);
	btn.setOnClickListener(listener);
	
}
OnClickListener listener=new OnClickListener() {
	
	@Override
	public void onClick(View view) {
		// TODO Auto-generated method stub
		login();
	}
};
private void login() {

	AuthInfo info=new AuthInfo(WeiBo_Activity.this, appkey, redirectUrl, null);	//基本信息
	 mSsoHandler = new SsoHandler(WeiBo_Activity.this, info);//客户端处理
	 mSsoHandler.authorizeWeb(weibolistener);      //处理回调
}
WeiboAuthListener  weibolistener=new WeiboAuthListener() {
	
	@Override
	public void onWeiboException(WeiboException arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void onComplete(Bundle bundle) {
	
		
		Oauth2AccessToken accessTokentoken=Oauth2AccessToken.parseAccessToken(bundle);
		
		 * 如果token有效，保存到share;
		 
		if(accessTokentoken.isSessionValid()) 
		{
			String token=accessTokentoken.getToken();
			String uid=accessTokentoken.getUid();
			Editor editor=getSharedPreferences("yang", MODE_PRIVATE).edit();
		    editor.putString("token", token);
		    editor.putString("uid", uid);
		    editor.commit();
		    Intent intent=new Intent(WeiBo_Activity.this,Success_Activity.class);
		    startActivity(intent);
		}
		else
		{
			System.out.println("无效的token");
		}
	}
	
	
	@Override
	public void onCancel() {
		
		
	}
};
protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (mSsoHandler != null) {
        mSsoHandler.authorizeCallBack(requestCode, resultCode, data);
    
    }
}
}
*/
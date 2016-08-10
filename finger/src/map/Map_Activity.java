/*package map;




import com.example.finger.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Map_Activity extends Activity{
	Button btn;
	LocationClient mLocationClient;
	TextView tv;
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.weibo);
	btn=(Button)findViewById(R.id.btn_weibo);
	tv=(TextView)findViewById(R.id.tv_msg);
	mLocationClient=new LocationClient(this);
	initLocation();
	mLocationClient.registerLocationListener(bdLocationListener);
	mLocationClient.start();
}
private void initLocation(){
    LocationClientOption option = new LocationClientOption();
    option.setLocationMode(LocationMode.Hight_Accuracy
);//可选，默认高精度，设置定位模式，高精度，低功耗，仅设备
    option.setCoorType("bd09ll");//可选，默认gcj02，设置返回的定位结果坐标系
    int span=1000;
    option.setScanSpan(span);//可选，默认0，即仅定位一次，设置发起定位请求的间隔需要大于等于1000ms才是有效的
    option.setIsNeedAddress(true);//可选，设置是否需要地址信息，默认不需要
    option.setOpenGps(true);//可选，默认false,设置是否使用gps
    option.setLocationNotify(true);//可选，默认false，设置是否当gps有效时按照1S1次频率输出GPS结果
    option.setIsNeedLocationDescribe(true);//可选，默认false，设置是否需要位置语义化结果，可以在BDLocation.getLocationDescribe里得到，结果类似于“在北京天安门附近”
    option.setIsNeedLocationPoiList(true);//可选，默认false，设置是否需要POI结果，可以在BDLocation.getPoiList里得到
    option.setIgnoreKillProcess(false);//可选，默认true，定位SDK内部是一个SERVICE，并放到了独立进程，设置是否在stop的时候杀死这个进程，默认不杀死  
    option.SetIgnoreCacheException(false);//可选，默认false，设置是否收集CRASH信息，默认收集
   option.setEnableSimulateGps(false);//可选，默认false，设置是否需要过滤gps仿真结果，默认需要
    mLocationClient.setLocOption(option);
   
}
OnClickListener listener=new OnClickListener() {
	
	@Override
	public void onClick(View view) {
		// TODO Auto-generated method stub
		
	}
};
BDLocationListener bdLocationListener=new BDLocationListener() {
	
	@Override
	public void onReceiveLocation(BDLocation Location) {
		// TODO Auto-generated method stub
		int id=Location.getLocType();
		if(id==61 || id==161){
			tv.setText(Location.getAddrStr());
		}
		else {
			Toast.makeText(getApplicationContext(), "code"+id, 0).show();
		}
	}
};
protected void onDestroy()
{
	mLocationClient.unRegisterLocationListener(bdLocationListener);
	mLocationClient.stop();
	super.onDestroy();
};
}
*/
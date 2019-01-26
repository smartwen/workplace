package com.example.broadcastbestpractice;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
/**
 * 作为所有类的父类来实现
 * @author Administrator
 *动态注册一个广播接收器
 */
public class BaseActivity extends Activity{
	private ForceOffLineReceiver receiver;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		ActivityCollector.addActivity(this);
	}
	
	@Override
	//注册广播监听器
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		 IntentFilter intentFilter = new IntentFilter();
		 intentFilter.addAction("com.example.broadcastbestpractise.FORCE_OFFLINE");
		  receiver = new ForceOffLineReceiver();
		  registerReceiver(receiver, intentFilter);
	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		if (receiver!= null) {
			unregisterReceiver(receiver);
			receiver = null;
		}
		
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		ActivityCollector.removeActivity(this);
	}
	class ForceOffLineReceiver extends BroadcastReceiver{

		@Override
		public void onReceive(final Context context, Intent intent) {
			// TODO Auto-generated method stub
			AlertDialog.Builder builder = new AlertDialog.Builder(context);
			builder.setTitle("warning");
			builder.setMessage("you are forced to be offline");
			builder.setCancelable(false);
			builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					ActivityCollector.finishAll();
					Intent intent = new Intent(context,LoginActivity.class);
					context.startActivity(intent);
				}
			});
			builder.show();
		}
		
	}
}

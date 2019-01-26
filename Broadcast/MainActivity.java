package com.example.broadcastbestpractice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button forceOffline  = (Button) findViewById(R.id.force_offline);
		forceOffline.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent  intent = new Intent("com.example.broadcastbestpractise.FORCE_OFFLINE");
				//发送一条广播  用户强制下线
				sendBroadcast(intent);
			}
		});
	}
	
}

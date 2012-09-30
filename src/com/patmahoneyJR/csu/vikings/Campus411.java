package com.patmahoneyJR.csu.vikings;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Campus411 extends Activity implements OnClickListener {
	
	private Button viewOnMap;
	private Button callButton;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.campus_411_activity);
        
        viewOnMap = (Button) findViewById(R.id.view_411_on_map_button);
        viewOnMap.setOnClickListener(this);
        callButton = (Button) findViewById(R.id.call_411_button);
        callButton.setOnClickListener(this);
	}

	public void onClick(View v) {
		
		switch(v.getId()) {
		
		case R.id.view_411_on_map_button:
			
			break;
		case R.id.call_411_button:
			Intent call = new Intent(Intent.ACTION_DIAL);
			call.setData(Uri.parse("tel:12166875411"));
			startActivity(call);
			break;
		}
		
	}
	
}
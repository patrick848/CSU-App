package com.patmahoneyJR.csu.vikings;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MobileCampus extends Activity implements OnClickListener {
	
	private Button mobileCampus;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mobile_campus);
        
        mobileCampus = (Button) findViewById(R.id.mobile_campus);
        mobileCampus.setOnClickListener(this);
        
	}
	
	public void onClick(View v) {
		
		Intent mapIntent = new Intent(this, CampusMap.class);		
		mapIntent.putExtra("placeName", "Mobile Campus");
		mapIntent.putExtra("lat", 41.502559);
		mapIntent.putExtra("lon", -81.675191);	
		startActivity(mapIntent);
		
	}

}

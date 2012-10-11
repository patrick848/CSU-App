package com.patmahoneyJR.csu.vikings;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ConnectionLounges extends Activity implements OnClickListener {
	
	private Button mainButton;
	private Button studentButton;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.connection_lounges);
        
        mainButton = (Button) findViewById(R.id.main_classroom_lounge);
        mainButton.setOnClickListener(this);
        studentButton = (Button) findViewById(R.id.student_center_lounge);
        studentButton.setOnClickListener(this);
        
	}
	
	public void onClick(View v) {
		
		Intent mapIntent = new Intent(this, CampusMap.class);
		
		switch(v.getId()) {
		
		case R.id.main_classroom_lounge:
			
			mapIntent.putExtra("placeName", "Main Classroom Lounge");
			mapIntent.putExtra("lat", 41.503433);
			mapIntent.putExtra("lon", -81.674531);
    		
		case R.id.student_center_lounge:
			
			mapIntent.putExtra("placeName", "Student Center Lounge");
			mapIntent.putExtra("lat", 41.502556);
			mapIntent.putExtra("lon", -81.675229);

		}
		
		startActivity(mapIntent);
		
	}

}

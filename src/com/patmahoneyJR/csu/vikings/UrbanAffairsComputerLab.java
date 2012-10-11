package com.patmahoneyJR.csu.vikings;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class UrbanAffairsComputerLab extends Activity implements OnClickListener {
	
	private Button urbanAffairsLab;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.urban_affairs_computer_lab);
        
        urbanAffairsLab = (Button) findViewById(R.id.urban_affairs_computer_lab);
        urbanAffairsLab.setOnClickListener(this);
        
	}
	
	public void onClick(View v) {
		
		Intent mapIntent = new Intent(this, CampusMap.class);		
		mapIntent.putExtra("placeName", "Urban Affairs Computer Lab");
		mapIntent.putExtra("lat", 41.501738);
		mapIntent.putExtra("lon", -81.679767);	
		startActivity(mapIntent);
		
	}

}

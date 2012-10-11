package com.patmahoneyJR.csu.vikings;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class StilwellHallComputerLab extends Activity implements OnClickListener {
	
	private Button stilwellHallLab;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stilwell_hall_computer_lab);
        
        stilwellHallLab = (Button) findViewById(R.id.stilwell_hall_computer_lab);
        stilwellHallLab.setOnClickListener(this);
        
	}
	
	public void onClick(View v) {
		
		Intent mapIntent = new Intent(this, CampusMap.class);		
		mapIntent.putExtra("placeName", "Stilwell Hall Computer Lab");
		mapIntent.putExtra("lat", 41.503052);
		mapIntent.putExtra("lon", -81.672847);	
		startActivity(mapIntent);
		
	}

}

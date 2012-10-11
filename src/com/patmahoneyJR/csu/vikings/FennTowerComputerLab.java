package com.patmahoneyJR.csu.vikings;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FennTowerComputerLab extends Activity implements OnClickListener {
	
	private Button fennTowerLab;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fenn_tower_computer_lab);
        
        fennTowerLab = (Button) findViewById(R.id.fenn_tower_computer_lab);
        fennTowerLab.setOnClickListener(this);
        
	}
	
	public void onClick(View v) {
		
		Intent mapIntent = new Intent(this, CampusMap.class);		
		mapIntent.putExtra("placeName", "Fenn Tower Computer Lab");
		mapIntent.putExtra("lat", 41.502565);
		mapIntent.putExtra("lon", -81.672214);	
		startActivity(mapIntent);
		
	}

}

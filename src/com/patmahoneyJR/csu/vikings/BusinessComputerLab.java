package com.patmahoneyJR.csu.vikings;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class BusinessComputerLab extends Activity implements OnClickListener {
	
	private Button businessCollegeLab;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.business_computer_lab);
        
        businessCollegeLab = (Button) findViewById(R.id.business_college_computer_lab);
        businessCollegeLab.setOnClickListener(this);
        
	}
	
	public void onClick(View v) {
		
		Intent mapIntent = new Intent(this, CampusMap.class);		
		mapIntent.putExtra("placeName", "Business College Computer Lab");
		mapIntent.putExtra("lat", 41.502215);
		mapIntent.putExtra("lon", -81.679327);	
		startActivity(mapIntent);
		
	}

}

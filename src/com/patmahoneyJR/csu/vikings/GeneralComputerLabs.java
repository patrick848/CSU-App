package com.patmahoneyJR.csu.vikings;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class GeneralComputerLabs extends ListActivity {
	
	String[] labs = {"Business Lab", "Fenn Tower Lab",
			"Stilwell Hall Lab", "Urban Affairs Lab" };
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this,
        		R.layout.simple_list_item_1,
        		labs));
        
	}
	
	public void onListItemClick(ListView parent, View v, 
			int position, long id) {
		
		if(labs[position].equals("Business Lab")) {
			Intent businessLab = new Intent(this, BusinessComputerLab.class);
			startActivity(businessLab);
		}
		else if(labs[position].equals("Fenn Tower Lab")) {
			Intent fennLab = new Intent(this, FennTowerComputerLab.class);
			startActivity(fennLab);
		}
		else if(labs[position].equals("Stilwell Hall Lab")) {
			Intent stilwellLab = new Intent(this, StilwellHallComputerLab.class);
			startActivity(stilwellLab);
		}
		else if(labs[position].equals("Urban Affairs Lab")) {
			Intent urbanLab = new Intent(this, UrbanAffairsComputerLab.class);
			startActivity(urbanLab);
		}
		
	}

}

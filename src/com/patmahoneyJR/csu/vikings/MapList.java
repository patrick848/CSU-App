package com.patmahoneyJR.csu.vikings;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MapList extends ListActivity {
	
	String[] mapItems = { "AMC Annex", "Art Building", "Business College",
			"Campus Safety", "Chester Building", "Chester Building Annex",
			"Cole Center", "East Center", "Euclid Commons",
			"Fenn Tower", "Health Sciences", "Heritage Hall",
			"Julka Hall", "Keith Building", "Law Library",
			"MAGNET Building", "Main Classroom", "Mather Mansion",
			"Michael Schwartz Library", "Music & Communication",
			"Parker Hannifin Administration Center",
			"Parker Hannifin Hall", "Physical Education",
			"Plant Annex", "Plant Services", "Recreation Center",
			"Rhodes Tower", "Rhodes West", "Science and Research",
			"Science Building", "Stilwell Hall", "Student Center",
			"Theater Arts Building", "Urban Affairs Building",
			"Viking Hall", "West Center", "Wolstein Center",
			"Wolstein Center Pavillion & Banquet Center" };
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this,
        		R.layout.simple_list_item_1,
        		mapItems));
	}
	
	public void onListItemClick(ListView parent, View v, 
			int position, long id) {
		Toast.makeText(this, ("at " + mapItems[position]), Toast.LENGTH_SHORT).show();
	}
}

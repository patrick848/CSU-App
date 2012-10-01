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
		
		if(mapItems[position].equals("AMC Annex")) {
			
		}
		else if(mapItems[position].equals("Art Building")) {
			
		}
		else if(mapItems[position].equals("Business College")) {
			
		}
		else if(mapItems[position].equals("Campus Safety")) {
			
		}
		else if(mapItems[position].equals("Chester Building")) {
			
		}
		else if(mapItems[position].equals("Chester Building Annex")) {
			
		}
		else if(mapItems[position].equals("Cole Center")) {
			
		}
		else if(mapItems[position].equals("East Center")) {
			
		}
		else if(mapItems[position].equals("Euclid Commons")) {
			
		}
		else if(mapItems[position].equals("Fenn Tower")) {
			
		}
		else if(mapItems[position].equals("Health Sciences")) {
			
		}
		else if(mapItems[position].equals("Heritage Hall")) {
			
		}
		else if(mapItems[position].equals("Julka Hall")) {
			
		}
		else if(mapItems[position].equals("Keith Building")) {
			
		}
		else if(mapItems[position].equals("Law Library")) {
			
		}
		else if(mapItems[position].equals("MAGNET Building")) {
			
		}
		else if(mapItems[position].equals("Main Classroom")) {
			
		}
		else if(mapItems[position].equals("Mather Mansion")) {
			
		}
		else if(mapItems[position].equals("Michael Schwartz Library")) {
			
		}
		else if(mapItems[position].equals("Music & Communication")) {
			
		}
		else if(mapItems[position].equals("Parker Hannifin Administration Center")) {
			
		}
		else if(mapItems[position].equals("Parker Hannifin Hall")) {
			
		}
		else if(mapItems[position].equals("Physical Education")) {
			
		}
		else if(mapItems[position].equals("Plant Annex")) {
			
		}
		else if(mapItems[position].equals("Plant Services")) {
			
		}
		else if(mapItems[position].equals("Recreation Center")) {
			
		}
		else if(mapItems[position].equals("Rhodes Tower")) {
			
		}
		else if(mapItems[position].equals("Rhodes West")) {
			
		}
		else if(mapItems[position].equals("Science and Research")) {
			
		}
		else if(mapItems[position].equals("Science Building")) {
			
		}
		else if(mapItems[position].equals("Stilwell Hall")) {
			
		}
		else if(mapItems[position].equals("Student Center")) {
			
		}
		else if(mapItems[position].equals("Theater Arts Building")) {
			
		}
		else if(mapItems[position].equals("Urban Affairs Building")) {
			
		}
		else if(mapItems[position].equals("Viking Hall")) {
			
		}
		else if(mapItems[position].equals("West Center")) {
			
		}
		else if(mapItems[position].equals("Wolstein Center")) {
			
		}
		else if(mapItems[position].equals("Wolstein Center Pavillion & Banquet Center")) {
			
		}
	}
}

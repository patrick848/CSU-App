package com.patmahoneyJR.csu.vikings;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MapList extends ListActivity {
	
	//Removed East Center: No longer exists...
	//Updated "Theater Arts Building" to "Art College" - Theater Arts Building doesn't exist
	//and Art College Does (Middough Building)
	String[] mapItems = { "AMC Annex", "Art College", "Business College",
			"Campus Safety", "Chester Building", "Chester Building Annex",
			"Cole Center", "Euclid Commons", "Fenn Tower", 
			"Health Sciences", "Heritage Hall",
			"Julka Hall", "Keith Building", "Law Building", "Law Library",
			"MAGNET Building", "Main Classroom", "Mather Mansion",
			"Michael Schwartz Library", "Music & Communication",
			"Parker Hannifin Administration Center",
			"Parker Hannifin Hall", "Physical Education",
			"Plant Annex", "Plant Services", "Recreation Center",
			"Rhodes Tower", "Rhodes West", "Science and Research",
			"Science Building", "Stilwell Hall", "Student Center",
			"Urban Affairs Building",
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
		Intent mapIntent = new Intent(this, CampusMap.class);
		
		if(mapItems[position].equals("Art Building")) {
			mapIntent.putExtra("placeName", mapItems[position]);
			mapIntent.putExtra("lat", 41.50192);
			mapIntent.putExtra("lon", -81.682669);
		}
		else if(mapItems[position].equals("AMC Annex")) {
			mapIntent.putExtra("placeName", mapItems[position]);
			mapIntent.putExtra("lat", 41.505733);
			mapIntent.putExtra("lon", -81.673354);
		}
		else if(mapItems[position].equals("Art Building")) {
			mapIntent.putExtra("placeName", mapItems[position]);
			mapIntent.putExtra("lat", 41.504371);
			mapIntent.putExtra("lon", -81.673625);
		}
		else if(mapItems[position].equals("Business College")) {
			mapIntent.putExtra("placeName", mapItems[position]);
			mapIntent.putExtra("lat", 41.502194);
			mapIntent.putExtra("lon", -81.679499);
		}
		else if(mapItems[position].equals("Campus Safety")) {
			mapIntent.putExtra("placeName", mapItems[position]);
			mapIntent.putExtra("lat", 41.502744);
			mapIntent.putExtra("lon", -81.678168);
		}
		else if(mapItems[position].equals("Chester Building")) {
			mapIntent.putExtra("placeName", mapItems[position]);
			mapIntent.putExtra("lat", 41.503656);
			mapIntent.putExtra("lon", -81.67377);
		}
		else if(mapItems[position].equals("Chester Building Annex")) {
			mapIntent.putExtra("placeName", mapItems[position]);
			mapIntent.putExtra("lat", 41.503166);
			mapIntent.putExtra("lon", -81.673469);
		}
		else if(mapItems[position].equals("Cole Center")) {
			mapIntent.putExtra("placeName", mapItems[position]);
			mapIntent.putExtra("lat", 41.504355);
			mapIntent.putExtra("lon", -81.666227);
		}
		else if(mapItems[position].equals("Euclid Commons")) {
			mapIntent.putExtra("placeName", mapItems[position]);
			mapIntent.putExtra("lat", 41.501545);
			mapIntent.putExtra("lon", -81.672348);
		}
		else if(mapItems[position].equals("Fenn Tower")) {
			mapIntent.putExtra("placeName", mapItems[position]);
			mapIntent.putExtra("lat", 41.502334);
			mapIntent.putExtra("lon", -81.672157);
		}
		else if(mapItems[position].equals("Health Sciences")) {
			mapIntent.putExtra("placeName", mapItems[position]);
			mapIntent.putExtra("lat", 41.502961);
			mapIntent.putExtra("lon", -81.671184);
		}
		else if(mapItems[position].equals("Heritage Hall")) {
			mapIntent.putExtra("placeName", mapItems[position]);
			mapIntent.putExtra("lat", 41.500309);
			mapIntent.putExtra("lon", -81.673941);
		}
		else if(mapItems[position].equals("Julka Hall")) {
			mapIntent.putExtra("placeName", mapItems[position]);
			mapIntent.putExtra("lat", 41.502467);
			mapIntent.putExtra("lon", -81.67127);
		}
		else if(mapItems[position].equals("Keith Building")) {
			mapIntent.putExtra("placeName", mapItems[position]);
			mapIntent.putExtra("lat", 41.501426);
			mapIntent.putExtra("lon", -81.680186);
		}
		else if(mapItems[position].equals("Law Building")) {
			mapIntent.putExtra("placeName", mapItems[position]);
			mapIntent.putExtra("lat", 41.501965);
			mapIntent.putExtra("lon", -81.67847);
		}
		else if(mapItems[position].equals("Law Library")) {
			mapIntent.putExtra("placeName", mapItems[position]);
			mapIntent.putExtra("lat", 41.502607);
			mapIntent.putExtra("lon", -81.678673);
		}
		else if(mapItems[position].equals("MAGNET Building")) {
			mapIntent.putExtra("placeName", mapItems[position]);
			mapIntent.putExtra("lat", 41.506119);
			mapIntent.putExtra("lon", -81.672069);
		}
		else if(mapItems[position].equals("Main Classroom")) {
			mapIntent.putExtra("placeName", mapItems[position]);
			mapIntent.putExtra("lat", 41.502724);
			mapIntent.putExtra("lon", -81.674376);
		}
		else if(mapItems[position].equals("Mather Mansion")) {
			mapIntent.putExtra("placeName", mapItems[position]);
			mapIntent.putExtra("lat", 41.503065);
			mapIntent.putExtra("lon", -81.670583);
		}
		else if(mapItems[position].equals("Michael Schwartz Library")) {
			mapIntent.putExtra("placeName", mapItems[position]);
			mapIntent.putExtra("lat", 41.50321);
			mapIntent.putExtra("lon", -81.675175);
		}
		else if(mapItems[position].equals("Music & Communication")) {
			mapIntent.putExtra("placeName", mapItems[position]);
			mapIntent.putExtra("lat", 41.502403);
			mapIntent.putExtra("lon", -81.676645);
		}
		else if(mapItems[position].equals("Parker Hannifin Administration Center")) {
			mapIntent.putExtra("placeName", mapItems[position]);
			mapIntent.putExtra("lat", 41.501625);
			mapIntent.putExtra("lon", -81.672771);
		}
		else if(mapItems[position].equals("Parker Hannifin Hall")) {
			mapIntent.putExtra("placeName", mapItems[position]);
			mapIntent.putExtra("lat", 41.501589);
			mapIntent.putExtra("lon", -81.673316);
		}
		else if(mapItems[position].equals("Physical Education")) {
			mapIntent.putExtra("placeName", mapItems[position]);
			mapIntent.putExtra("lat", 41.503417);
			mapIntent.putExtra("lon", -81.671484);
		}
		else if(mapItems[position].equals("Plant Annex")) {
			mapIntent.putExtra("placeName", mapItems[position]);
			mapIntent.putExtra("lat", 41.506472);
			mapIntent.putExtra("lon", -81.671532);
		}
		else if(mapItems[position].equals("Plant Services")) {
			mapIntent.putExtra("placeName", mapItems[position]);
			mapIntent.putExtra("lat", 41.505448);
			mapIntent.putExtra("lon", -81.671905);
		}
		else if(mapItems[position].equals("Recreation Center")) {
			mapIntent.putExtra("placeName", mapItems[position]);
			mapIntent.putExtra("lat", 41.503411);
			mapIntent.putExtra("lon", -81.671812);
		}
		else if(mapItems[position].equals("Rhodes Tower")) {
			mapIntent.putExtra("placeName", mapItems[position]);
			mapIntent.putExtra("lat", 41.503266);
			mapIntent.putExtra("lon", -81.675524);
		}
		else if(mapItems[position].equals("Rhodes West")) {
			mapIntent.putExtra("placeName", mapItems[position]);
			mapIntent.putExtra("lat", 41.503178);
			mapIntent.putExtra("lon", -81.676017);
		}
		else if(mapItems[position].equals("Science and Research")) {
			mapIntent.putExtra("placeName", mapItems[position]);
			mapIntent.putExtra("lat", 41.502676);
			mapIntent.putExtra("lon", -81.673635);
		}
		else if(mapItems[position].equals("Science Building")) {
			mapIntent.putExtra("placeName", mapItems[position]);
			mapIntent.putExtra("lat", 41.502391);
			mapIntent.putExtra("lon", -81.672954);
		}
		else if(mapItems[position].equals("Stilwell Hall")) {
			mapIntent.putExtra("placeName", mapItems[position]);
			mapIntent.putExtra("lat", 41.503214);
			mapIntent.putExtra("lon", -81.672842);
		}
		else if(mapItems[position].equals("Student Center")) {
			mapIntent.putExtra("placeName", mapItems[position]);
			mapIntent.putExtra("lat", 41.502217);
			mapIntent.putExtra("lon", -81.675411);
		}
		else if(mapItems[position].equals("Urban Affairs Building")) {
			mapIntent.putExtra("placeName", mapItems[position]);
			mapIntent.putExtra("lat", 41.501704);
			mapIntent.putExtra("lon", -81.679778);
		}
		else if(mapItems[position].equals("Viking Hall")) {
			mapIntent.putExtra("placeName", mapItems[position]);
			mapIntent.putExtra("lat", 41.50086);
			mapIntent.putExtra("lon", -81.674746);
		}
		else if(mapItems[position].equals("West Center")) {
			mapIntent.putExtra("placeName", mapItems[position]);
			mapIntent.putExtra("lat", 41.469575);
			mapIntent.putExtra("lon", -81.910309);
		}
		else if(mapItems[position].equals("Wolstein Center")) {
			mapIntent.putExtra("placeName", mapItems[position]);
			mapIntent.putExtra("lat", 41.499285);
			mapIntent.putExtra("lon", -81.676479);
		}
		else if(mapItems[position].equals("Wolstein Center Pavillion & Banquet Center")) {
			mapIntent.putExtra("placeName", mapItems[position]);
			mapIntent.putExtra("lat", 41.499454);
			mapIntent.putExtra("lon", -81.67598);
		}
		
		startActivity(mapIntent);
	}
}

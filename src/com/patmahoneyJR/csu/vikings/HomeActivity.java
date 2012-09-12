package com.patmahoneyJR.csu.vikings;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * 
 * @author Patrick Mahoney
 * 
 * This is my remake of the Cleveland State University app.
 * It's not perfect, and I'm still learning, but I think that it
 * will (eventually) be much better than the one out now.
 * 
 */

public class HomeActivity extends Activity implements OnClickListener {
	
	private Button calendarButton;
	private Button campus411Button;
	private Button mapButton;
	private Button newsButton;
	private Button fightSongButton;
	private Button techButton;
	private Button diningButton;
	private Button parkingButton;
	private Button socialButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        
        // Instantiating my variables and setting onClickListeners for them
        
        calendarButton = (Button) findViewById(R.id.calendarButton);
        calendarButton.setOnClickListener(this);
        campus411Button = (Button) findViewById(R.id.campus411Button);
        campus411Button.setOnClickListener(this);
        mapButton = (Button) findViewById(R.id.mapButton);
        mapButton.setOnClickListener(this);
        newsButton = (Button) findViewById(R.id.newsButton);
        newsButton.setOnClickListener(this);
        fightSongButton = (Button) findViewById(R.id.fightSongButton);
        fightSongButton.setOnClickListener(this);
        techButton = (Button) findViewById(R.id.techButton);
        techButton.setOnClickListener(this);
        diningButton = (Button) findViewById(R.id.diningButton);
        diningButton.setOnClickListener(this);
        parkingButton = (Button) findViewById(R.id.parkingButton);
        parkingButton.setOnClickListener(this);
        socialButton = (Button) findViewById(R.id.socialButton);
        socialButton.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_home, menu);
        return true;
    }

	@Override
	public void onClick(View v) {
		
		// Switch to get the id of the button clicked.
		
		switch(v.getId()) {
		
		case R.id.calendarButton:
			Intent calendar = new Intent(this, AcademicCalendar.class);
			startActivity(calendar);
			break;
			
		case R.id.campus411Button:
			Intent fourOneOne = new Intent(this, Campus411.class);
			startActivity(fourOneOne);
			break;
			
		case R.id.mapButton:
			Intent map = new Intent(this, CampusMap.class);
			startActivity(map);
			break;
		
		case R.id.newsButton:
			Intent news = new Intent(this, CampusNews.class);
			startActivity(news);
			break;
		
		case R.id.fightSongButton:
			Intent fightSong = new Intent(this, FightSong.class);
			startActivity(fightSong);
			break;
		
		case R.id.techButton:
			Intent tech = new Intent(this, CSUTechnology.class);
			startActivity(tech);
			break;
			
		case R.id.diningButton:
			Intent dining = new Intent(this, DiningLocations.class);
			startActivity(dining);
			break;
			
		case R.id.parkingButton:
			Intent parking = new Intent(this, Parking.class);
			startActivity(parking);
			break;
			
		case R.id.socialButton:
			Intent social = new Intent(this, SocialNetwork.class);
			startActivity(social);
			break;
			
		}
		
	}
}

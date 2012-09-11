package com.patmahoneyJR.csu.vikings;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

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
		
		switch(v.getId()) {
		
		case R.id.calendarButton:
			break;
			
		case R.id.campus411Button:
			break;
			
		case R.id.mapButton:
			break;
		
		case R.id.newsButton:
			break;
		
		case R.id.fightSongButton:
			break;
		
		case R.id.techButton:
			break;
			
		case R.id.diningButton:
			break;
			
		case R.id.parkingButton:
			break;
			
		case R.id.socialButton:
			break;
			
		}
		
	}
}

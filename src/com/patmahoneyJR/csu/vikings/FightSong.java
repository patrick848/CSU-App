package com.patmahoneyJR.csu.vikings;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FightSong extends Activity implements OnClickListener {
	
	private Button play;
	private Button stop;
	private MediaPlayer mediaPlayer;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fight_song_activity);
        
		
        
        play = (Button) findViewById(R.id.play_song);
        play.setOnClickListener(this);
        stop = (Button) findViewById(R.id.stop_song);
        stop.setOnClickListener(this);
	}
	
	@Override
	public void onPause() {
		super.onPause();
		mediaPlayer.stop();
		mediaPlayer.release();
		mediaPlayer = null;
	}
	
	@Override
	public void onResume() {
		super.onResume();
		
		if(mediaPlayer == null) 
			mediaPlayer = MediaPlayer.create(this, R.raw.fightsong);
		stop.setVisibility(View.INVISIBLE);
		play.setVisibility(View.VISIBLE);
	}

	public void onClick(View v) {
		
		if(v.getId() == R.id.play_song) {
			play.setVisibility(View.INVISIBLE);
			stop.setVisibility(View.VISIBLE);
			mediaPlayer.start();
		}
		
		else if(v.getId() == R.id.stop_song) {
			stop.setVisibility(View.INVISIBLE);
			play.setVisibility(View.VISIBLE);
			mediaPlayer.pause();
			
		}
		
	}
}
package com.patmahoneyJR.csu.vikings;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapView;

import android.os.Bundle;

public class CampusMap extends MapActivity {
	
	private MapView map;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_activity);
        map = (MapView) findViewById(R.id.map);
        map.setBuiltInZoomControls(true);
        map.getController().setCenter(getPoint(41.502217,-81.675411));
        map.getController().setZoom(20);
	}

	@Override
	protected boolean isRouteDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}
	
	private GeoPoint getPoint(double lat, double lon) {
	    return(new GeoPoint((int)(lat*1000000.0),
	                          (int)(lon*1000000.0)));
	  }
}
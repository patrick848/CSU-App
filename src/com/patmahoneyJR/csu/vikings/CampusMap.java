package com.patmahoneyJR.csu.vikings;

import java.util.List;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapView;
import com.google.android.maps.Overlay;
import com.google.android.maps.OverlayItem;

public class CampusMap extends MapActivity {
	
	private MapView map;
	private MenuInflater mInflater;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_activity);
        Bundle extras = getIntent().getExtras();
        
        map = (MapView) findViewById(R.id.map);
        map.setBuiltInZoomControls(true);
        map.getController().setCenter(getPoint(extras.getDouble("lat"), extras.getDouble("lon")));
        map.getController().setZoom(19);
        map.setSatellite(false);
        
        List<Overlay> mapOverlays = map.getOverlays();
        Drawable marker = getResources().getDrawable(R.drawable.androidmarker);
        marker.setBounds(0, 0, marker.getIntrinsicWidth(),
        		marker.getIntrinsicHeight());
        CSUOverlay overlay = new CSUOverlay(marker, this);
        OverlayItem overlayItem = new OverlayItem(map.getMapCenter(),
        		extras.getString("placeName"), null);
        overlay.addOverlay(overlayItem);
        mapOverlays.add(overlay);
        
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		super.onCreateOptionsMenu(menu);
		mInflater = getMenuInflater();
		return true;
	}
	
	@Override
	public boolean onPrepareOptionsMenu (Menu menu) {
		menu.clear();
		if(! map.isSatellite())
			mInflater.inflate(R.menu.map_map_menu, menu);
		else
			mInflater.inflate(R.menu.satellite_map_menu, menu);
		return true;
	}
	
	@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
        
        case R.id.satellite_view:
        	map.setSatellite(true);
        	break;
        	
        case R.id.map_view:
        	map.setSatellite(false);
        	break;        
        }
        
        return true;
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
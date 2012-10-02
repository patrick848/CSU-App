package com.patmahoneyJR.csu.vikings;

import java.util.List;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapView;
import com.google.android.maps.Overlay;
import com.google.android.maps.OverlayItem;

public class ParkingMap extends MapActivity {
	
	private MapView map;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_activity);
        Bundle extras = getIntent().getExtras();
        
        map = (MapView) findViewById(R.id.map);
        map.setBuiltInZoomControls(true);
        map.getController().setCenter(getPoint(extras.getDouble("lat"), extras.getDouble("lon")));
        map.getController().setZoom(19);
        
        List<Overlay> mapOverlays = map.getOverlays();
        Drawable marker = getResources().getDrawable(R.drawable.androidmarker);
        marker.setBounds(0, 0, marker.getIntrinsicWidth(),
        		marker.getIntrinsicHeight());
        CSUOverlay overlay = new CSUOverlay(marker, this);
        OverlayItem overlayItem = new OverlayItem(map.getMapCenter(), null, null);
        overlay.addOverlay(overlayItem);
        mapOverlays.add(overlay);
        
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
package com.patmahoneyJR.csu.vikings;

import java.util.ArrayList;
import java.util.List;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapView;
import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.Overlay;
import com.google.android.maps.OverlayItem;
import com.google.android.maps.MyLocationOverlay;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;

public class CampusMap extends MapActivity {
	
	private MapView map;
	private MyLocationOverlay me;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_activity);
        Bundle extras = getIntent().getExtras();
        
        map = (MapView) findViewById(R.id.map);
        map.setBuiltInZoomControls(true);
        map.getController().setCenter(getPoint(extras.getDouble("lat"), extras.getDouble("lon")));
        map.getController().setZoom(19);
        
        Drawable marker = getResources().getDrawable(R.drawable.androidmarker);
        marker.setBounds(0, 0, marker.getIntrinsicWidth(),
        		marker.getIntrinsicHeight());
        map.getOverlays().add(new SitesOverlay(marker));
        me=new MyLocationOverlay(this, map);
        map.getOverlays().add(me);
        
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
	
	private class SitesOverlay extends ItemizedOverlay<OverlayItem> {
		
		private List<OverlayItem> items=new ArrayList<OverlayItem>();
	    
	    public SitesOverlay(Drawable marker) {
	    	
	      super(marker);
	      
	      boundCenterBottom(marker);
	      
	      items.add(new OverlayItem(map.getMapCenter(), "hi", "yo"));
	      
	      populate();
	    }

		@Override
		protected OverlayItem createItem(int i) {
			return(items.get(i));
		}

		@Override
		public int size() {
			// TODO Auto-generated method stub
			return 0;
		}
	}
}
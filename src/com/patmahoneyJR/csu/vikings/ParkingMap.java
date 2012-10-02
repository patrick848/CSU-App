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
        
        OverlayItem overlayItem1 = new OverlayItem(getPoint(41.50542, -81.676141), "Lot 10", null);
        overlay.addOverlay(overlayItem1);
        
        OverlayItem overlayItem2 = new OverlayItem(getPoint(41.504847, -81.675926), "Lot 11", null);
        overlay.addOverlay(overlayItem2);
        
        OverlayItem overlayItem3 = new OverlayItem(getPoint(41.503138, -81.678335), "Lot 20", null);
        overlay.addOverlay(overlayItem3);
        
        OverlayItem overlayItem4 = new OverlayItem(getPoint(41.501844, -81.676202), "Lot 21", null);
        overlay.addOverlay(overlayItem4);
        
        OverlayItem overlayItem5 = new OverlayItem(getPoint(41.502682, -81.674745), "Lot 22", null);
        overlay.addOverlay(overlayItem5);
        
        OverlayItem overlayItem6 = new OverlayItem(getPoint(41.499976, -81.677041), "Lot 40", null);
        overlay.addOverlay(overlayItem6);
        
        OverlayItem overlayItem7 = new OverlayItem(getPoint(41.505775, -81.67481), "Lot 50", null);
        overlay.addOverlay(overlayItem7);
        
        OverlayItem overlayItem8 = new OverlayItem(getPoint(41.505363, -81.674552), "Lot 51", null);
        overlay.addOverlay(overlayItem8);
        
        OverlayItem overlayItem9 = new OverlayItem(getPoint(41.506209, -81.674029), "Lot 54", null);
        overlay.addOverlay(overlayItem9);
        
        OverlayItem overlayItem10 = new OverlayItem(getPoint(41.505773, -81.672584), "Lot 57", null);
        overlay.addOverlay(overlayItem10);
        
        OverlayItem overlayItem11 = new OverlayItem(getPoint(41.503138, -81.673973), "Lot 61", null);
        overlay.addOverlay(overlayItem11);
        
        OverlayItem overlayItem12 = new OverlayItem(getPoint(41.50374, -81.67297), "Lot 62", null);
        overlay.addOverlay(overlayItem12);
        
        OverlayItem overlayItem13 = new OverlayItem(getPoint(41.499671, -81.673196), "Lot 80", null);
        overlay.addOverlay(overlayItem13);
        
        OverlayItem overlayItem14 = new OverlayItem(getPoint(41.503957, -81.666769), "Lot 90", null);
        overlay.addOverlay(overlayItem14);
        
        OverlayItem overlayItem15 = new OverlayItem(getPoint(41.502897, -81.676935), "Lot CG", null);
        overlay.addOverlay(overlayItem15);
        
        OverlayItem overlayItem16 = new OverlayItem(getPoint(41.503825, -81.670551), "Lot EG", null);
        overlay.addOverlay(overlayItem16);
        
        OverlayItem overlayItem17 = new OverlayItem(getPoint(41.502346, -81.674327), "Lot MG", null);
        overlay.addOverlay(overlayItem17);
        
        OverlayItem overlayItem18 = new OverlayItem(getPoint(41.500822, -81.672637), "Lot PG", null);
        overlay.addOverlay(overlayItem18);
        
        OverlayItem overlayItem19 = new OverlayItem(getPoint(41.499803, -81.674907), "Lot SG", null);
        overlay.addOverlay(overlayItem19);
        
        OverlayItem overlayItem20 = new OverlayItem(getPoint(41.503841, -81.671264), "Lot RG", null);
        overlay.addOverlay(overlayItem20);
        
        OverlayItem overlayItem21 = new OverlayItem(getPoint(41.502624, -81.673013), "Lot UG", null);
        overlay.addOverlay(overlayItem21);
        
        OverlayItem overlayItem22 = new OverlayItem(getPoint(41.502889, -81.679982), "Lot WG", null);
        overlay.addOverlay(overlayItem22);
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
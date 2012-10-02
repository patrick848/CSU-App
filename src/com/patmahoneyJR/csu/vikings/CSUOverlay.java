package com.patmahoneyJR.csu.vikings;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.graphics.drawable.Drawable;

import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.OverlayItem;

public class CSUOverlay extends ItemizedOverlay<OverlayItem> {
	
	private List<OverlayItem> mOverlays = new ArrayList<OverlayItem>();

	public CSUOverlay(Drawable marker, Context context) {
		super(boundCenterBottom(marker));
	}
	
	public void addOverlay(OverlayItem overlay) {
	    mOverlays.add(overlay);
	    populate();
	}

	@Override
	protected OverlayItem createItem(int i) {
		return mOverlays.get(i);
	}

	@Override
	public int size() {
		return mOverlays.size();
	}

}

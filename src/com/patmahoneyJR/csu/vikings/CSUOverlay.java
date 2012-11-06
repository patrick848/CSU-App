package com.patmahoneyJR.csu.vikings;

import java.util.ArrayList;
import java.util.List;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;

import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.OverlayItem;

public class CSUOverlay extends ItemizedOverlay<OverlayItem> {
	
	Context context;
	int selected = 0;
	
	private List<OverlayItem> mOverlays = new ArrayList<OverlayItem>();

	public CSUOverlay(Drawable marker, Context context) {
		super(boundCenterBottom(marker));
		this.context = context;
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

	@Override
	protected boolean onTap(final int i) {
		
		Log.d((mOverlays.get(i).getPoint().getLatitudeE6() / 1E6) + "", "got touched");
		
		AlertDialog.Builder builder = new AlertDialog.Builder(context);
		
		builder.setTitle(context.getResources().getString(R.string.navigate)
				+ mOverlays.get(i).getTitle()
				+ context.getResources().getString(R.string.question_mark));
		
		CharSequence[] items = {"Driving?", "Walking?", "Bus?"};
		builder.setSingleChoiceItems(items, selected, new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				selected = which;
			}
		});
		
		builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
	           public void onClick(DialogInterface dialog, int id) {
	        	   String navigationUri = "google.navigation:ll="	               
	        			   + (mOverlays.get(i).getPoint().getLatitudeE6() / 1E6)
	        			   + ","
	        			   + (mOverlays.get(i).getPoint().getLongitudeE6() / 1E6);
	               if(selected == 0)
	            	   navigationUri = navigationUri + "&mode=d";
	               else if(selected == 1)
	            	   navigationUri = navigationUri + "&mode=w";
	               else if(selected == 2)
	            	   navigationUri =
	            	   "http://maps.google.com/maps?daddr="
	            	   + (mOverlays.get(i).getPoint().getLatitudeE6() / 1E6)
	            	   + ","
	            	   + (mOverlays.get(i).getPoint().getLongitudeE6() / 1E6)
	            	   + "&dirflg=r";
	               
	               Intent navigate = new Intent(Intent.ACTION_VIEW,
	            		   Uri.parse(navigationUri));
	         
	               context.startActivity(navigate);
	               
	           }
	       });
		
		
		builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
	           public void onClick(DialogInterface dialog, int id) {
	               dialog.dismiss();
	           }
	       });
		
		AlertDialog dialog = builder.create();
		dialog.show();
		
		return true;
		
	}
}

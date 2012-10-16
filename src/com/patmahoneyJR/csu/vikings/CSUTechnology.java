package com.patmahoneyJR.csu.vikings;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CSUTechnology extends ListActivity {
	
	String[] techItems = {"Call Center", "Connection Lounges",
			"General Computer Labs", "Mobile Campus",
			"Mobile Email", "Reset Password", "Wireless" };
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this,
        		R.layout.simple_list_item_1,
        		techItems));
	}
	
	public void onListItemClick(ListView parent, View v, 
			int position, long id) {
		
		if(techItems[position].equals("Call Center")) {
			Intent callCenter = new Intent(this, CallCenter.class);
			startActivity(callCenter);
		}
		else if(techItems[position].equals("Connection Lounges")) {
			Intent connectionLounges = new Intent(this, ConnectionLounges.class);
			startActivity(connectionLounges);
		}
		else if(techItems[position].equals("General Computer Labs")) {
			Intent generalComputerLabs = new Intent(this, GeneralComputerLabs.class);
			startActivity(generalComputerLabs);
		}
		else if(techItems[position].equals("Mobile Campus")) {
			Intent mobileCampus = new Intent(this, MobileCampus.class);
			startActivity(mobileCampus);
		}
		else if(techItems[position].equals("Mobile Email")) {
			Intent mobileEmail = new Intent(this, MobileEmail.class);
			startActivity(mobileEmail);
		}
		else if(techItems[position].equals("Reset Password")) {
			Intent resetPassword = new Intent(this, ResetPassword.class);
			startActivity(resetPassword);
		}
		else if(techItems[position].equals("Wireless")) {
			Uri wirelessUri = Uri.parse("http://www.csuohio.edu/offices/ist/getconnected/wireless.html");
			Intent wireless = new Intent(Intent.ACTION_VIEW, wirelessUri);
			startActivity(wireless);
		}
	}
}
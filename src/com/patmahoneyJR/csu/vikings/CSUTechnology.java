package com.patmahoneyJR.csu.vikings;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class CSUTechnology extends ListActivity {
	
	String[] techItems = {"Call Center", "Connection Center",
			"General Computer Labs", "Mobile Campus",
			"Mobile Email", "Password Reset", "Wireless" };
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this,
        		R.layout.simple_list_item_1,
        		techItems));
	}
}
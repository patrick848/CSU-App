package com.patmahoneyJR.csu.vikings;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Dining extends ListActivity {
	
	String[] dining;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); 
        dining = getResources().getStringArray(R.array.dining);
        setListAdapter(new ArrayAdapter<String>(this,
        		R.layout.simple_list_item_1,
        		dining));
        
	}
	
	public void onListItemClick(ListView parent, View v, 
			int position, long id) {
		
	}
}
package com.patmahoneyJR.csu.vikings;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import android.app.ListActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class CampusNews extends ListActivity {
	
	private static final String URL = "http://www.csuohio.edu/news/";
	private ArrayList<String> newsItems;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        newsItems = new ArrayList<String>();
        try {
        	
        	fillNewsItems();
        	setListAdapter(new ArrayAdapter<String>(this,
        			android.R.layout.simple_list_item_1,
        			newsItems));
        	
        } catch(Exception e) {
        	
        	Toast.makeText(this, "Couldn't fetch articles, try again later.",
        			Toast.LENGTH_SHORT).show();
        }

	}
	
	private void fillNewsItems() throws IOException  {
		
		Document doc = Jsoup.connect(URL).get();
		
		Log.d("tag", "I got the URL");
		
		for (Element e : doc.getElementsByTag("p")) {
			newsItems.add(e.text());
		}
		
	}
}
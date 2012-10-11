package com.patmahoneyJR.csu.vikings;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class CallCenter extends Activity implements OnClickListener {
	
	private Button emailButton;
	private Button callButton;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.call_center);
        
        emailButton = (Button) findViewById(R.id.email_call_center);
        emailButton.setOnClickListener(this);
        callButton = (Button) findViewById(R.id.call_call_center);
        callButton.setOnClickListener(this);
        
	}
	
	public void onClick(View v) {
		
		switch(v.getId()) {
		
		case R.id.email_call_center:
			Intent email = new Intent(Intent.ACTION_SEND);
    		email.setType("plain/text");
    		email.putExtra(Intent.EXTRA_EMAIL, new String[] {"Call.Center@csuohio.edu"});
    		email.putExtra(Intent.EXTRA_SUBJECT, "Assistance");
    		email.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY | Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);
    		startActivity(Intent.createChooser(email, "Email Call Center..."));
    		break;
    		
		case R.id.call_call_center:
			Intent call = new Intent(Intent.ACTION_DIAL);
			call.setData(Uri.parse("tel:12166875050"));
			startActivity(call);
			break;
		}
		
		
	}

}

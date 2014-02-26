package com.example.maps;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;


public class MainActivity extends Activity {
   
	View map;
	 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		map = (View) findViewById(R.id.mvMain);
	}

	protected boolean isRouteDisplayed() {
        // TODO Auto-generated method stub
        return false;
    }
}
	
	
	
//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.main, menu);
//		return true;
//	}




       
 
   
    

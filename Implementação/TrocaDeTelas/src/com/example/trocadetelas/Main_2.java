package com.example.trocadetelas;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Main_2 extends Activity {

	Button bttela1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tela_2);
		
		bttela1 = (Button)
		        findViewById(R.id.bttela1);	
		
bttela1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
		   Intent TrocaTela = new 
			Intent (Main_2.this,Main_1.class);
		   Main_2.this.startActivity(TrocaTela);
           Main_2.this.finish(); 
				
				
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_1, menu);
		return true;
	}

}

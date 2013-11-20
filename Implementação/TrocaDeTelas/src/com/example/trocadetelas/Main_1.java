package com.example.trocadetelas;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Main_1 extends Activity {

	Button bttela2, bttela3, bttela4;	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tela_1);
		
		bttela2 = (Button)
        findViewById(R.id.bttela2);	
		
		bttela3 = (Button)
		        findViewById(R.id.bttela3);	
		
		bttela4 = (Button)
		        findViewById(R.id.bttela4);			
		
		bttela2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
		   Intent TrocaTela = new 
			Intent (Main_1.this,Main_2.class);
		   Main_1.this.startActivity(TrocaTela);
           Main_1.this.finish(); 
				
				
			}
		});
		
		
		
	bttela3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
		   Intent TrocaTela = new 
			Intent (Main_1.this,Main_3.class);
		   Main_1.this.startActivity(TrocaTela);
           Main_1.this.finish(); 
				
				
			}
		});
	
	bttela4.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			
	   Intent TrocaTela = new 
		Intent (Main_1.this,Main_4.class);
	   Main_1.this.startActivity(TrocaTela);
       Main_1.this.finish(); 
			
			
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

package com.example.telaandroid;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		EditText Usuário = (EditText) findViewById(R.id.usuario);
		EditText senha = (EditText) findViewById(R.id.senha);
        final Button confirma = (Button) findViewById(R.id.confirma);
        Button limpar = (Button) findViewById(R.id.limpar);
	
        confirma.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(MainActivity.this, confirma.getText().toString(),Toast.LENGTH_SHORT).show();
				
				
			}
		});
        
	}

	
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

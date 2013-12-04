package com.example.qualomelhorlugarfinal;



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
		
		final EditText Login = (EditText) findViewById(R.id.Login);
		final EditText Senha = (EditText) findViewById(R.id.Senha);
	    Button Entrar = (Button) findViewById(R.id.Entrar);
	    Button Limpar = (Button) findViewById(R.id.Limpar);
	
	Entrar.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
			//Toast.makeText(MainActivity.this, Login.getText().toString(), Toast.LENGTH_SHORT).show();
			
			String Logincerto = "irenildo";
			String senhacerta = "12345";
			String strLogin = Login.getText().toString();
			String strSenha = Senha.getText().toString();
	
			 if (strLogin.equals(Logincerto) && strSenha.equals(senhacerta)){
				 
				 Toast.makeText(MainActivity.this, "Login com Sucesso!",Toast.LENGTH_SHORT).show();
				 
			 }else{
				 Toast.makeText(MainActivity.this, "ERRO! Usuário ou Senha estão incorretos",Toast.LENGTH_SHORT).show();
			 }
			
			}
	});
	
	
	     Limpar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Login.setText("");
				Senha.setText("");
				
				
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

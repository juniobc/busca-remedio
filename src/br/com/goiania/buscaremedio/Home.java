package br.com.goiania.buscaremedio;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Home extends Activity {
	
	@Override
	public void onCreate(Bundle bundle){
		
		super.onCreate(bundle);
		
		setContentView(R.layout.home);
		
	}
	
	public void buscarMedicamento(View v){
		
		Intent i = new Intent(Home.this, BuscaMedicamento.class);
		startActivity(i);
		
	}

}

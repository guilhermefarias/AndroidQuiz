package com.example.androidquiz;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class TelaFinal extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tela_final);
		
		Intent intent = getIntent();
        Bundle param = intent.getExtras();
        int acertos = param.getInt("acertos");
  
        TextView texto = (TextView) findViewById(R.id.acertos);
        if(acertos > 3){
        	texto.setText("Parab�ns, voc� acertou " + acertos + " das 5 quest�es");	
        } else {
        	texto.setText("Voc� acertou " + acertos + " das 5 quest�es");
        }
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tela_final, menu);
		return true;
	}

}

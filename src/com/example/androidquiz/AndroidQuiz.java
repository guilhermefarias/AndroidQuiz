package com.example.androidquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.TextView;
import android.widget.RadioButton;
import android.widget.Toast;

public class AndroidQuiz extends Activity {
	int acertos = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_android_quiz);

		iniciarRodada(1);
	}

	public void iniciarRodada(int numero){
		Perguntas question = new Perguntas();
        question.op1 = (RadioButton) findViewById(R.id.op1);
        question.op2 = (RadioButton) findViewById(R.id.op2);
        question.op3 = (RadioButton) findViewById(R.id.op3);
        question.op4 = (RadioButton) findViewById(R.id.op4);
        question.pergunta = (TextView) findViewById(R.id.pergunta);

        if(numero == 1){
        	question.rodada1();
        	question.op1.setOnClickListener(listenerRodada1);
            question.op2.setOnClickListener(listenerRodada1);
            question.op3.setOnClickListener(listenerRodada1);
            question.op4.setOnClickListener(listenerRodada1);
        } else if(numero == 2){
	        question.rodada2();
	        question.op1.setOnClickListener(listenerRodada2);
	        question.op2.setOnClickListener(listenerRodada2);
	        question.op3.setOnClickListener(listenerRodada2);
	        question.op4.setOnClickListener(listenerRodada2);
	    } else if(numero == 3){
	    	question.rodada3();
	    	question.op1.setOnClickListener(listenerRodada3);
	        question.op2.setOnClickListener(listenerRodada3);
	        question.op3.setOnClickListener(listenerRodada3);
	        question.op4.setOnClickListener(listenerRodada3);
	    } else if(numero == 4){
	    	question.rodada4();
	    	question.op1.setOnClickListener(listenerRodada4);
	        question.op2.setOnClickListener(listenerRodada4);
	        question.op3.setOnClickListener(listenerRodada4);
	        question.op4.setOnClickListener(listenerRodada4);
	    } else if(numero == 5){
	    	question.rodada5();
	    	question.op1.setOnClickListener(listenerRodada5);
	        question.op2.setOnClickListener(listenerRodada5);
	        question.op3.setOnClickListener(listenerRodada5);
	        question.op4.setOnClickListener(listenerRodada5);
	    }
	}
	
	private OnClickListener listenerRodada1 = new OnClickListener() {
		public void onClick(View v) {
			RadioButton r = (RadioButton) v;
			String resposta = (String) r.getText();
			r.setChecked(false);
			if(resposta == "7"){
				acertos++;
				Toast.makeText(getApplicationContext(),"Resposta Correta",Toast.LENGTH_SHORT).show();
			} else {
				Toast.makeText(getApplicationContext(),"Resposta Errada",Toast.LENGTH_SHORT).show();
			}
			
			iniciarRodada(2);
		}
	};
	private OnClickListener listenerRodada2 = new OnClickListener() {
		public void onClick(View v) {
			RadioButton r = (RadioButton) v;
			String resposta = (String) r.getText();
			r.setChecked(false);
			if(resposta == "5"){
				acertos++;
				Toast.makeText(getApplicationContext(),"Resposta Correta",Toast.LENGTH_SHORT).show();
			} else {
				Toast.makeText(getApplicationContext(),"Resposta Errada",Toast.LENGTH_SHORT).show();
			}
			
			iniciarRodada(3);
		}
	};
	private OnClickListener listenerRodada3 = new OnClickListener() {
		public void onClick(View v) {
			RadioButton r = (RadioButton) v;
			String resposta = (String) r.getText();
			r.setChecked(false);
			if(resposta == "1"){
				acertos++;
				Toast.makeText(getApplicationContext(),"Resposta Correta",Toast.LENGTH_SHORT).show();
			} else {
				Toast.makeText(getApplicationContext(),"Resposta Errada",Toast.LENGTH_SHORT).show();
			}
			
			iniciarRodada(4);
		}
	};
	private OnClickListener listenerRodada4 = new OnClickListener() {
		public void onClick(View v) {
			RadioButton r = (RadioButton) v;
			String resposta = (String) r.getText();
			r.setChecked(false);
			if(resposta == "4"){
				acertos++;
				Toast.makeText(getApplicationContext(),"Resposta Correta",Toast.LENGTH_SHORT).show();
			} else {
				Toast.makeText(getApplicationContext(),"Resposta Errada",Toast.LENGTH_SHORT).show();
			}
			
			iniciarRodada(5);
		}
	};
	private OnClickListener listenerRodada5 = new OnClickListener() {
		public void onClick(View v) {
			RadioButton r = (RadioButton) v;
			String resposta = (String) r.getText();
			r.setChecked(false);
			if(resposta == "Android"){
				acertos++;
				Toast.makeText(getApplicationContext(),"Resposta Correta",Toast.LENGTH_SHORT).show();
			} else {
				Toast.makeText(getApplicationContext(),"Resposta Errada",Toast.LENGTH_SHORT).show();
			}

			Intent intent = new Intent(AndroidQuiz.this, TelaFinal.class);
			Bundle param = new Bundle();
			param.putInt("acertos", acertos);
			intent.putExtras(param);
			startActivity(intent);
		}
	};

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.android_quiz, menu);
		return true;
	}

}
package com.example.androidquiz;

import android.widget.RadioButton;
import android.widget.TextView;



import android.app.Activity;


public class Perguntas extends Activity{
	RadioButton op1;
	RadioButton op2;
	RadioButton op3;
	RadioButton op4;
	TextView pergunta;
	
	public void rodada1(){
		 pergunta.setText("Quanto é 2 + 5?");
	     op1.setText("7");
	     op2.setText("6");
	     op3.setText("5");
	     op4.setText("8");
	}

	public void rodada2(){
		 pergunta.setText("Qual o número vem depois do 4?");
	     op1.setText("1");
	     op2.setText("2");
	     op3.setText("3");
	     op4.setText("5");
	}

	public void rodada3(){
		 pergunta.setText("Qual o número impar?");
		 op1.setText("1");
	     op2.setText("2");
	     op3.setText("4");
	     op4.setText("6");
	}
	
	public void rodada4(){
		 pergunta.setText("Qual o número par?");
	     op1.setText("1");
	     op2.setText("3");
	     op3.setText("4");
	     op4.setText("5");
	}
	
	public void rodada5(){
		 pergunta.setText("Qual sistema operacional deste aparelho?");
	     op1.setText("Windows Phone");
	     op2.setText("Android");
	     op3.setText("iOS");
	     op4.setText("FirefoxOS");
	}
}

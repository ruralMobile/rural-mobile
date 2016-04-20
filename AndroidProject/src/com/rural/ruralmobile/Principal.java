package com.rural.ruralmobile;

import com.rural.calendar.HelloGridView;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Principal extends Activity implements android.view.View.OnClickListener {
		private Button botaoEnviar;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_principal);
		botaoEnviar = (Button) findViewById(R.id.entrar);
		
		botaoEnviar.setOnClickListener(this);
	}
	
	public void onClick(View v) {
		if (v == botaoEnviar){
			Intent i = new Intent();
			i.setClass(this, HelloGridView.class);
			startActivity(i);
		}
		
	}

}


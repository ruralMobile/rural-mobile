package com.rural.calendar;

import com.rural.ruralmobile.R;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class HelloGridView  extends Activity implements OnItemClickListener{
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_calendar);

	    
	    TextView textViewMonth = (TextView) findViewById(R.id.textViewMonth);
	    GridView gridview = (GridView) findViewById(R.id.gridview);
	    gridview.setAdapter(new ImageAdapter(this));

	    gridview.setOnItemClickListener(new OnItemClickListener() {
	    	 public void onItemClick(AdapterView<?> parent, View v,
	                 int position, long id) {
	             Toast.makeText(HelloGridView.this, "" + (position+1),
	                     Toast.LENGTH_SHORT).show();
	         }
	    });
	    

	    Calendar calendar = Calendar.getInstance();
	    textViewMonth.setText( getMesNome(Calendar.MONTH+1)); 
	}
	
	public String getMesNome(int mes) {
		switch(mes) {
		case 0:
			return "Janeiro";
		case 1:
			return "Fevereiro";
		case 2:
			return "Março";
		case 3:
			return "Abril";
		case 4:
			return "Maio";
		case 5:
			return "Junho";
		case 6:
			return "Julho";
		case 7:
			return "Agosto";
		case 8:
			return "Setembro";
		case 9:
			return "Outubro";
		case 10:
			return "Novembro";
		case 11:
			return "Dezembro";
		default:
			return "";
		}
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View v,
            int position, long id) {
        Toast.makeText(HelloGridView.this, "" + (position+1),
                Toast.LENGTH_SHORT+1).show();
    }

	
}

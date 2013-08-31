package com.osmansufi.radiobuttonapp;

import java.util.HashMap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

public class MainActivity extends Activity {
	public final static String EXTRA_MESSAGE = "com.osmansufi.radiobuttonapp.MESSAGE";
	Response q1 = new Response();
	Response q2 = new Response();
	Response q3 = new Response();
	
    private HashMap<Integer, Double> values ;
    private RadioGroup questionOne;
    private RadioGroup questionTwo;
    private RadioGroup questionThree;
    private EditText firstName;
    private EditText lastName;
	
	public MainActivity() {
		values = new HashMap<Integer, Double>() ;
	    values.put(R.id.radio_ecstatic, 2.0) ;
	    values.put(R.id.radio_happy, 1.0) ;
	    values.put(R.id.radio_neutral, 0.0) ;
	    values.put(R.id.radio_sad, -1.0) ;
	    values.put(R.id.radio_devastated, -2.0) ;
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//mDetector = new GestureDetectorCompat(this, new MyGestureListener());
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	public void onRadioButtonClicked(View view) {
	    double value = values.get(view.getId()) ;
	    q1.setScore(value) ;	    
	    q1.setChecked(true);
	}
	
	public void onRadioButtonClickedTwo(View view) {
		double value = values.get(view.getId()) ;
	    q2.setScore(value) ;	    
	    q2.setChecked(true);
	}
	
	public void onRadioButtonClickedThree(View view) {
		double value = values.get(view.getId()) ;
	    q3.setScore(value) ;	    
	    q3.setChecked(true);
	}
	
	public void evaluate(View view) {
		if(q1.getChecked() && q2.getChecked() && q3.getChecked()) {
			Intent intent = new Intent(this, DisplayResultsActivity.class);
			EditText editText = (EditText) findViewById(R.id.edit_firstName);
			EditText editText2 = (EditText) findViewById(R.id.edit_lastName);
			String firstName = editText.getText().toString();
			String lastName = editText2.getText().toString();
			intent.putExtra("first", firstName);
			intent.putExtra("last", lastName);
			intent.putExtra("score1", q1.getScore());
			intent.putExtra("score2", q2.getScore());
			intent.putExtra("score3", q3.getScore());
			startActivity(intent);
		}
	}
	
	public void sendResults(View view) {
		/*
		 Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
            "mailto","abc@gmail.com", null));
		 emailIntent.putExtra(Intent.EXTRA_SUBJECT, "EXTRA_SUBJECT");
		 startActivity(Intent.createChooser(emailIntent, "Send email..."));
		 */
		
		if(q1.getChecked() && q2.getChecked() && q3.getChecked()) {
			
		}
	}
	
	public void clear(View view) {
		// clears radio buttons, in all radio groups, of selection
		// and also clears both name text fields
		firstName = (EditText) findViewById(R.id.edit_firstName);
		lastName = (EditText) findViewById(R.id.edit_lastName);
		
		firstName.setText("");
		lastName.setText("");
		
		questionOne = (RadioGroup) findViewById(R.id.question);
		questionTwo = (RadioGroup) findViewById(R.id.question_two);
		questionThree = (RadioGroup) findViewById(R.id.question_three);
		
		questionOne.clearCheck();
		questionTwo.clearCheck();
		questionThree.clearCheck();
		
		q1.setChecked(false);
		q2.setChecked(false);
		q3.setChecked(false);
		
		
		
	}
}

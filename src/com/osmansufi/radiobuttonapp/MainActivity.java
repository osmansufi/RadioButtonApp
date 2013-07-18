package com.osmansufi.radiobuttonapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends Activity {

	/*
	private GestureDetectorCompat mDetector;

	@Override 
    public boolean onTouchEvent(MotionEvent event){ 
        this.mDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
	
	class MyGestureListener extends GestureDetector.SimpleOnGestureListener {
        private static final String DEBUG_TAG = "Gestures"; 
        
        @Override
        public boolean onDown(MotionEvent event) { 
            Log.d(DEBUG_TAG,"onDown: " + event.toString()); 
            return true;
        }

        @Override
        public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX,
                float distanceY) {
            Log.d(DEBUG_TAG, "onScroll: " + e1.toString()+e2.toString());
            return true;
        }
    }
	*/
	
	public final static String EXTRA_MESSAGE = "com.osmansufi.radiobuttonapp.MESSAGE";
	
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
	    // Is the button now checked?
	    boolean checked = ((RadioButton) view).isChecked();
	    
	    // Integer variable used to sum score
	    int score;
	    
	    // Check which radio button was clicked
	    switch(view.getId()) {
	        case R.id.radio_ecstatic:
	            if (checked)
	                score = 2;
	            break;
	        case R.id.radio_happy:
	            if (checked)
	            	score = 1;
	            break;
	        case R.id.radio_neutral:
	            if (checked)
	            	score = 0;
	            break;
	        case R.id.radio_sad:
	            if (checked)
	            	score = -1;
	            break;
	        case R.id.radio_devastated:
	            if (checked)
	            	score = -2;
	            break;
	    }
	}
	
	public void onRadioButtonClickedTwo(View view) {
	    // Is the button now checked?
	    boolean checked = ((RadioButton) view).isChecked();
	    
	    // Integer variable used to sum score
	    int score;
	    
	    // Check which radio button was clicked
	    switch(view.getId()) {
	        case R.id.radio_ecstatic:
	            if (checked)
	                score = 2;
	            break;
	        case R.id.radio_happy:
	            if (checked)
	            	score = 1;
	            break;
	        case R.id.radio_neutral:
	            if (checked)
	            	score = 0;
	            break;
	        case R.id.radio_sad:
	            if (checked)
	            	score = -1;
	            break;
	        case R.id.radio_devastated:
	            if (checked)
	            	score = -2;
	            break;
	    }
	}
	
	public void evaluate(View view) {
		Intent intent = new Intent(this, DisplayResultsActivity.class);
		String message = "This part is a work in progress.";
		intent.putExtra(EXTRA_MESSAGE, message);
		startActivity(intent);
	}

}

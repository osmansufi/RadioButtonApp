package com.osmansufi.radiobuttonapp;


public class Response {
	//User's response to each question determines their score on that question.
	private double score;
	private boolean check;
	
	public void setScore(double s) {
		score = s;
	}
	
	public double getScore() {
		return (score);
	}
	
	public void setChecked(boolean c) {
		check = c;
	}
	
	public boolean getChecked() {
		return (check);
	}
}

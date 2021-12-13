package com.ya.skidtavling.time;

public class Time {
	// kommentar
	// 1 hour = 3600 secunder
	// 1 min = 60 secunder;
	
	private long sec;

	public Time(long sec) {
		super();
		this.setSec(sec);
	}

	public long getSec() {
		return sec;
	}

	@Override
	public String toString() {
		int temp = (int) sec;
		int hour = temp/3600;
		temp = temp-hour*3600;
		int min = temp/60;
		temp = temp-min*60;
		int secu = temp;
		return " time "+hour+" :" + min +" :"+ secu ;
	}

	public void setSec(long sec) {
		this.sec = sec;
	}
	


	
}
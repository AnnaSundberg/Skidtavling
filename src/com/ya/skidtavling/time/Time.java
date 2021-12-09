package com.ya.skidtavling.time;

public class Time {

	private int hour;
	private int minutes;
	private int sec;

	public Time(int hour, int minutes, int sec) {
		super();
		this.hour = hour;
		this.minutes = minutes;
		this.sec = sec;
	}

	@Override
	public String toString() {
		return "Time " + hour + ":" + minutes + ":" + sec + "]";
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public int getSec() {
		return sec;
	}

	public void setSec(int sec) {
		this.sec = sec;
	}
}
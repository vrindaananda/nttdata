package com.nttdata.simple_interest;

public class SI {
	
	private int principal;
	private float rate;
	private int time;
	public int getPrincipal() {
		return principal;
	}
	public void setPrincipal(int principal) {
		this.principal = principal;
	}
	
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public SI(int principal, float rate, int time) {
		super();
		this.principal = principal;
		this.rate = rate;
		this.time = time;
	}
	public float simple()
	{
		return(float) (principal*rate*time)/100 ;
	}
	public SI()
	{
		
	}
	}


package com.javaex.ex02;

public abstract class Bird {
    private String name;

    
    public Bird() {}
	public Bird(String name) {
		
		this.name = name;
	}
	
	

	public void setName(String name) {
		this.name = name;
	}
	
	
	public void sing() {}
	public void fly() {}
	public void showName() {}
    
    


}

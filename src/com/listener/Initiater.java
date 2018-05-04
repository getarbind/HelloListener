package com.listener;

import java.util.ArrayList;

public class Initiater {

	ArrayList<HelloListener> listener = new ArrayList<HelloListener>(); 
	
	public void addListener(HelloListener toAdd){
		listener.add(toAdd);
	}
	
	public void sayHello(){
		System.out.println("Hello");
		
		for (HelloListener h1: listener){
			h1.someoneSaidHello();
		}
	}
}

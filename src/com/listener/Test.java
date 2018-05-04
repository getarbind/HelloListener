package com.listener;

public class Test {

	public static void main(String[] args) {
		Initiater init = new Initiater();
		Responder resp = new Responder();
		
		init.addListener(resp);
		init.sayHello();

	}

}

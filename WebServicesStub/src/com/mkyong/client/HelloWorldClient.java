package com.mkyong.client;

import com.mkyong.ws.HelloWorld;
import com.mkyong.ws.HelloWorldImplService;

public class HelloWorldClient{
	
	public static void main(String[] args) {
	   
		HelloWorldImplService helloService = new HelloWorldImplService();
		HelloWorld hello = helloService.getHelloWorldImplPort();
	
		System.out.println(hello.getHelloWorldAsString("Shubham Gowda"));
		System.out.println("WOW");
		System.out.println("Amaze");
		//Shgubham Git trial
    }

}

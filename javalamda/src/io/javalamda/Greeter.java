package io.javalamda;

import java.util.Collections;

public class Greeter {
	
	public void Greet(Greeting greeting)
	{
		
		greeting.perform(); 
	}
	
	public static void main(String[] Args)
	{
		//Prior to Java 7 
		Greeter greeter = new Greeter();
		HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
		//MyLamda myLamdaFunction = () -> System.out.println("Hello World");
		//MyAdd addFunction = (int a , int b) -> a + b;
		Greeting myLamdaFunction = () -> System.out.println("Lamda Greeting");
			
		//Prior to Java8 , inline implementation of an interface 
		Greeting innerClassGreeting = new Greeting() {
		public void perform()
		{
			System.out.println("Inner Class Greeting");
		}
		};
		
		/*
		helloWorldGreeting.perform();
		myLamdaFunction.perform();
		innerClassGreeting.perform();
		*/
		greeter.Greet(helloWorldGreeting);
		greeter.Greet(innerClassGreeting);
		greeter.Greet(myLamdaFunction);
		
		
		
	}
	
	interface MyLamda
	{
		void foo(); 
	}
	interface MyAdd
	{
		int add(int a , int b);
	}
}


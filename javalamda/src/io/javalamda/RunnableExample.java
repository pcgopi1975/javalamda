package io.javalamda;

public class RunnableExample {

	public static void main(String[] args) {
		//Anonymous inner class - java 7 
		Thread myThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Printed Inside Runnable");		
			}
		});
		myThread.start();
		myThread.run();
		//Java 8 Lamda 
		Thread myLamdaThread = new Thread( ()->System.out.println("Lamda Runnable"));
		myLamdaThread.run();
}
}

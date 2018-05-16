package io.javalamda;

public class MethodReferenceExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Thread myThread = new Thread(()-> System.out.println("hellow"));
		//above lamda is same as the below method refernce	
		Thread myThread = new Thread(MethodReferenceExample1::printMessage);
		myThread.start();
	}
	
	public static void printMessage()
	{
		System.out.println("hellow");
		
	}
	

}

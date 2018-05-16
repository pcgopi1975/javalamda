package io.javalamda;

import io.javalamda.Greeter.MyLamda;

public class TypicalInferenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringLengthLamda myLamda = (String B) -> B.length();
		System.out.println(myLamda.getLength("Hello World"));
		//Simplifying further 
		StringLengthLamda myLamda2 = B -> B.length();
		System.out.println(myLamda2.getLength("Hello World 122"));
		//Simplifying further and further 
		printLamdaLength(C -> C.length());
	}
	
	public static void printLamdaLength(StringLengthLamda lamdaFunction)
	{
		System.out.println(lamdaFunction.getLength("Hello World 1234"));
		
	}
	
interface StringLengthLamda{
	public int getLength(String A);
}
}
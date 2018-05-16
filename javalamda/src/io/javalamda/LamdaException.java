package io.javalamda;

import java.util.function.BiConsumer;

public class LamdaException {

	public static void main(String[] args) {
		int[] someArray = {1,2,3,4,5,6};
		int key = 0;
		/*processArray(someArray,key,(v,k) -> {		
		try {
			System.out.println(v/k);
		}
		catch (ArithmeticException e)
		{
			System.out.println("Exception occurred");
		}
		}
		);
		*/
		
		processArray(someArray,key,wrapperLamda((v,k) -> System.out.println(v/k)));
		

	}

	private static void processArray(int[] someArray, int key, BiConsumer<Integer,Integer> consumer) {
		// TODO Auto-generated method stub
		for (int i : someArray) {
			consumer.accept(i, key);
			
		}
	}
	private static BiConsumer<Integer, Integer> wrapperLamda( BiConsumer<Integer, Integer> consumer)
	{
		return(u,k) ->{ 
		try {
			System.out.println("Wrapper Lamda called");
			consumer.accept(u, k);
		}
		catch (ArithmeticException e)
		{
			System.out.println("Caught exception");
			
		}
		};
		
	}
		
	
}

package io.javalamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;


public class UnitExampleJava8 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Sankar","P3",25),
				new Person("Gopi","P2",30),
				new Person("Kartik","P1",22));

		//java 8 lamda - Comparator based sorting

	//	Collections.sort(people, (Person a1,Person a2) ->  a1.getLastName().compareTo(a2.getLastName()));
		
		Collections.sort(people, (a1,a2) ->  a1.getFirstName().compareTo(a2.getFirstName()));
		
		//java 8 lamda - print all names
				people.forEach(a -> System.out.println("Java 8 " + a));
			
				printAllNamesWithCondition(people,p ->true);
				//java 8 lamda - print all names - starting with a name runtime
				printAllNamesWithCondition(people,person -> person.getFirstName().startsWith("S"));
				
	}	

	
private static void printAllNamesWithCondition(List<Person> people,Predicate<Person> C) {
		
		for(Person p : people) {
			if (C.test(p))
				System.out.println("Java 8 " +p);
	}
	
	}

interface Condition{
	 boolean test(Person p);
}
}


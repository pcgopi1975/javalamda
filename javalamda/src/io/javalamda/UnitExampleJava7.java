package io.javalamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UnitExampleJava7 {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
			new Person("Sankar","P3",25),
			new Person("Gopi","P2",30),
			new Person("Kartik","P1",22));

	
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person a1,Person a2) {
				return a1.getLastName().compareTo(a2.getLastName());
			}
		}
		);
		
		printAll(people);
		
		
		//print all names starting with S
		printAllNamesWithS(people);
		
		//Java 7 - Anonymous inner class overriding the interface
		
		printAllNamesWithCondition(people,new Condition1 () {
			
			@Override
			public boolean test(Person p1) {
					  if (p1.getFirstName().startsWith("S"))
					  {
						//  System.out.println("Java 7 " +p2);
						  return true;
				 }
				 return false;
			}
			@Override
			public boolean test2(Person p) {
				return Condition1.super.test2(p);
			}
			
		});
	}
	
private static void printAllNamesWithCondition(List<Person> people,Condition1 C) {
		
		for(Person p : people) {
			if (C.test(p))
				System.out.println("Java 7 Condition met " +p);
	}
	
	}

private static void printAllNamesWithS(List<Person> people) {
	
	for(Person p : people) {
		
		if (p.getFirstName().startsWith("S"))
			System.out.println("Java 7 Names Start with S "+ p);
	}
	
	}
public static void printAll(List<Person> people)
{
	for (Person p: people) {
		System.out.println("Java Print All " +p);
	}
}


	
//Collections.sort(people, new Comparator

/*	List<Person> sortedPeople = (people) -> {people.sort
	
	
*/

interface sortPeople{
	public List<Person> sort();
	
}

@FunctionalInterface
interface Condition1{
	 boolean test(Person p);
	 default boolean test2(Person p)
	 {
		  if (p.getFirstName().startsWith("S"))
		  {
			  System.out.println("Default Condition " +p);
			  return true;
		  }
	 return false;
		 
	 }
}

}
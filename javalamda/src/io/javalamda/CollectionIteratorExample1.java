package io.javalamda;

import java.util.Arrays;
import java.util.List;

public class CollectionIteratorExample1 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Sankar","P3",25),
				new Person("Gopi","P2",30),
				new Person("Kartik","P1",22));
		
		for(int i=0;i<people.size();i++)
		{
			System.out.println("traditional for "+ people.get(i));
		}

		for(Person p : people)
		{
			System.out.println("For in "+p);
		}
		
		people.forEach(p->System.out.println("lamda version"+p));
		
		people.forEach(System.out :: println);
		

	}

}

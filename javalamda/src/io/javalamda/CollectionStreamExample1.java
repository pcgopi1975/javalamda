package io.javalamda;

import java.util.Arrays;
import java.util.List;

public class CollectionStreamExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> people = Arrays.asList(
				new Person("Sankar","A1",25),
				new Person("Gopi","B2",30),
				new Person("Kartik","C1",22));
		
		people.stream()
			.filter(p -> p.getLastName().startsWith("C"))
			.forEach(p -> System.out.println(p));
		
		long count = people.stream()
		.filter(p -> p.getLastName().startsWith("C"))
		.count();
		
		long count1 = people.parallelStream()
				.filter(p -> p.getLastName().startsWith("A"))
				.count();
				
		
		System.out.println(count1);
		
}
	}



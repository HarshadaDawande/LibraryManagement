package main.java.pluralsight;

import java.util.*;

public class CollectionsDemo {

	public CollectionsDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Person person1 = new Person("Harshada" , 42);
		Person person2 = new Person("Shubhada" , 39);
		Person person3 = new Person("Madhura" , 36);
		/*
		Map<String, Person> map = new HashMap<>();
		map.put("Harshada", person1);
		map.put("Shubhada", person2);
		map.put("Madhura", person3);
		//Map 
		for(Map.Entry<String, Person> entry : map.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
				
		*/
		//List - maintains order, allowed duplicates
		Set<Person> list = new HashSet<>();
		list.add(person1);
		list.add(person2);
		list.add(person3);
		list.add(person1);
		// Java 7
		for (Person s : list) {
			     System.out.println("In Java 7 : "+s.getName());
			 }
		//Java 8
		System.out.println("In Java 8 : ");
		list.forEach(System.out::println);

		/*
		//Set - no ordering, no duplicates		
		Set<Person> set = new HashSet<>();	
		set.add(person1);
		*/
//
//		System.out.println(list);
//		Collections.sort(list, new AgeComparator());
//		System.out.println(list.toString());
//
//		Collections.sort(list,
//				new Comparator<Person>() {
//					@Override
//					public int compare(final Person o1, final Person o2) {
//						return Integer.compare(o1.getAge(), o2.getAge());
//					}
//				});

		//list.stream().mapToInt(i->i).sum();
	}

}

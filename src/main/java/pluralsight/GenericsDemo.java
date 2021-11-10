package main.java.pluralsight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GenericsDemo {

	public GenericsDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Person person1 = new Person("Harshada" , 42);
		Person person2 = new Person("Shubhada" , 39);
		Person person3 = new Person("Madhura" , 36);

		//List - maintains order, allowed duplicates
		List<Person> madMan = new ArrayList<>();
		madMan.add(0,person1);
		madMan.add(1,person2);
		madMan.add(2,person3);

		final Person youngest = (Person) min(madMan, new AgeComparator());

		showList(madMan);

		System.out.println(youngest.getName());
	}

	private static <T>Object min(List<T> values, Comparator comparator) {

		Object lowest = values.get(0);
		for(int i=0; i<values.size();i++){
			Object element = values.get(i);
			if(comparator.compare(element, lowest) < 0) {
				lowest = element;
			}
		}
		return lowest;
	}

	private static void showList(List <? extends Person> list) {

	}
}

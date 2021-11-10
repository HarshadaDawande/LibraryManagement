package main.java.pluralsight;

import java.util.Objects;
import java.util.Optional;

public class Person {
	String name;
	public Optional<String> getName() {
		return Optional.ofNullable(name);
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	int age;
	public Person(String _name, int _age) {
		Objects.requireNonNull(_name);
		name = _name;
		age = _age;
	}

}

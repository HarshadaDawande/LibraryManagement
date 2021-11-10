package main.java.pluralsight;

import java.util.Objects;

public class Employee extends Person{
	String name;
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
	int age;
	public Employee(String _name, int _age) {
		super(_name, _age);
	}
}

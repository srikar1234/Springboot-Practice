package org.practice.Spring1;

import java.beans.ConstructorProperties;

public class Alien {
	private int age;

//	private Laptop laptop;

	public Computer getComputer() {
		return computer;
	}

	//We can pass Desktop and Laptop as arguments to this setter function. Based on what is sent, that objects compile method is called later on.
	public void setComputer(Computer computer) {
		this.computer = computer;
	}

	private Computer computer;

//	public Laptop getLaptop() {
//		System.out.println("Setter called");
//		return laptop;
//	}
//
//	public void setLaptop(Laptop laptop) {
//		this.laptop = laptop;
//	}

	public Alien() {
		System.out.println("Alien Object created");
	}

//	public Alien(int age){
//		System.out.println("Para Constructor Called");
//		this.age = age;
//	}

//	@ConstructorProperties({"age", "lap"})
//	public Alien(int age, Laptop laptop){
//		System.out.println("Two Para Constructor Called");
//		this.age = age;
//		this.laptop = laptop;
//	}

	public void code() {
		System.out.println("Coding");
//		laptop.compile();
		computer.compile();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("Setter called");
		this.age = age;
	}
}
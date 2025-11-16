package org.practice.Spring1;

public class Laptop implements Computer {

	public Laptop() {
		System.out.println("Laptop Object created");
	}

	@Override
	public void compile(){
		System.out.println("Compiling using Laptop");
	}
}

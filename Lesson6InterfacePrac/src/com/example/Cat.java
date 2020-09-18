package com.example;

public class Cat extends Animal implements Pet {
	private String name;
	
	public Cat(String name) {
		super(4);
		setName(name);
		// TODO Auto-generated constructor stub
	}
	public Cat() {
		this("Fluffy");
	}


	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;

	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println(this.getName() + " likes to play with string");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Cats like to eat spiders and fish");

	}

}

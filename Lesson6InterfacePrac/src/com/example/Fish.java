package com.example;

public class Fish extends Animal implements Pet {
	private String name;
	

	public Fish() {
		super(0);
		// TODO Auto-generated constructor stub
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


	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Just keep swimming.");

	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Fish eat pond scum");
	}
	
	@Override
	public void walk() {
		super.walk();
		System.out.println("Fish, of course, cannot walk; they swim");
	}

}

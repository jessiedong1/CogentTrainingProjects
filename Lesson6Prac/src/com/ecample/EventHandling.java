package com.ecample;

public interface EventHandling {
	int number = 10;
	void click();
	void doClick();
	default void keyPressed() {
		System.out.println("Key is pressed");
	}
	static void checkMe() {
		System.out.println("Check me");
	}
}

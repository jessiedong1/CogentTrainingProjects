package com.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyListTest {
	MyList m = new MyList();

	@BeforeEach
	public void setUp() {
		m.add("Nitin");
		m.add("Tim");
		m.add("Thiarno");
	}
	
	@DisplayName("Test size")
	@Test
	public void testSize() {
		assertEquals(3, m.size());
	}
	@Test
	public void testAdd() {
		m.add("Trace");
		assertEquals( 4, m.size(),"Adding One more member");
	}
	@Test
	public void testRemove() {
		m.remove("Nitin");
		assertEquals( 2, m.size(),"Removing 1 member from List");
	}
	@AfterEach
	public void tearDown() {
		m.removeAll();
	}
}

//public class MyListTest extends TestCase {
//	MyList m = new MyList();
//
//
//	public void setUp() {
//		m.add("Nitin");
//		m.add("Tim");
//		m.add("Thiarno");
//	}
//
//	public void testSize() {
//		assertEquals("Checking Size of List",3, m.size());
//	}
//
//	public void testAdd() {
//		m.add("Trace");
//		assertEquals("Adding One more member",4, m.size());
//	}
//	
//	public void testRemove() {
//		m.remove("Nitin");
//		assertEquals("Removing one member from list", 2, m.size());
//	}
//	
//	@Override
//	public void tearDown() {
//		m.removeAll();
//	}
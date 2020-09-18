package cogent.batch52.example;

import java.util.*;

//public class MultiThreadingDemostration {
//	public static void main(String[] args) {
//	new Thread_1();
//	} }
//
//class Thread_1 extends Thread
//	{ Thread t1;
//	Thread t2;
//	Thread_1()
//	{
//	t1 = new Thread(this,"Thread_1");
//	t2 = new Thread(this,"Thread_1");
//	t1.start();
//	t2.start(); }
//	public void run()
//	{
////	t2.setPriority(Thread.MAX_PRIORITY);
//	System.out.print(t1.equals(t2));
//	} }
//public class AbstractTest {
//public static void main(String[] args) {
//Fooo fo=new Test();
//fo.display(); } }
//abstract class Fooo
//{ String name;
//String myName()
//{
//name="cogent";
//return name;
//}
//abstract void display(); }
//class Test extends Fooo
//{
//String name;
//@Override
//void display() {
//super.name=myName();
//System.out.println("My Name is : "+name);
//
//}
//
//}

//public class CalculatorTest {
//
//
//	static int i = 1;
//	public static void main(String args[])
//	{
//	System.out.println(i+" , ");
//	m(i);
//	System.out.println(i);
//	}
//	public static void m(int i)
//	{
//	i += 2;
//	}
//}
//public class Java8InterfaceTest {
//private interface DefaultInterface
//{
//default String notNeedMethod()
//{
//return "Default implementation";
//}
//}
//private static class DefaultInterfaceImpl implements DefaultInterface
//{
//
//}
//private static class OverridImpl implements DefaultInterface
//{
//public String notNeedMethod()
//{
//return "overridden implementations ";
//}
//}
//public static void main(String[] args) {
//
//
//}
//
//}

class A {
public void process() { System.out.print("A "); }
	
} 

class B extends A {
B() {
		super();
		// TODO Auto-generated constructor stub
	}
public void process() throws RuntimeException {
super.process();
if (true) throw new RuntimeException();
System.out.print("B"); }

 public static void main(String[] args) {
	try { ((A)new B()).process(); }
	catch (Exception e) { System.out.print("Exception "); }
	 }
}



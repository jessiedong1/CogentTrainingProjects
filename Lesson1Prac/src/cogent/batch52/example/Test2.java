package cogent.batch52.example;

//public class ThreadDemo {
//public static void main(String[] args) {
//	new CogentThread();
//
//}
//}
//class CogentThread extends Thread
//	{
//	Thread t;
//	CogentThread()
//		{
//		t = new Thread(this,"My Thread");
////		t.start();
//		t.run();
//
//		}
//	public void run()
//	{
//	try
//	{
//	t.join();
//	System.out.println(t.getName());
//	}
//	catch(Exception e)
//	{
//	System.out.print("Exception");
//	}
//	}
//}

//import java.util.Stack;
//public class Generic_Collection_Test<E> {
//Stack stk = new Stack ();
//public void push(E obj)
//{
//stk.push(obj);
//}
//public E pop()
//{
//E obj = (E) stk.pop();
//return obj;
//}
//public static void main(String[] args) {
//Generic_Collection_Test gs = new Generic_Collection_Test();
//gs.push("Hello");
//System.out.println(gs.pop());
//}
//}
public class Test2 {
int i[] = {0};
public static void main(String args[])
{
int i[] = {1};
change_i(i);
System.out.println(i[0]);
}
public static void change_i(int i[])
{
//	int j[] = {2};
//	i = j;
	 i[0] = 10;
System.out.println(i[0]);
}
}

//public static void badMethod()
//{
//throw new RuntimeException();
//}
//}
//import java.util.HashSet;
//import java.util.Vector;
//public class CogentTestCollections {
//public static void main(String[] args) {
//Vector data = new Vector();
//data.add("apple");
//data.add("mango");
//data.add("papaya");
//data.add("cherry");
//data.add("banana");
//data.add("apple");
//System.out.println(getData(data));
//}
//public static Vector getData(Vector v)
//{
//return new Vector(new HashSet(v));
//}
//}
//public class CLADemo {
//public static void main(String[] args) {
//StringBuilder str=new StringBuilder();
//for(String a:args)
//{
//if(str.indexOf(a)<1)//Line 6
//str.append(a+" ");
//}System.out.println(str.toString());
//Scanner ac=new Scanner(str.toString());
//while(ac.hasNext())
//{
//if(ac.hasNextInt())//line 13
//System.out.println(ac.nextInt()+" ");
//else
//ac.next();
//}
//}
//}

//public class IndexCollections {
//public static void main(String[] args) {
//Stream.of(new Indices("Mercury"),new Indices("Venus"),
//new Indices("Earth")).
//flatMap(i->i.indices.stream()).mapToInt(j->j)
//.max()
//.ifPresent(s->System.out.println(s));
//}
//}
//class Indices
//{
//public String s;
//public List indices;
//public Indices(String s)
//{this.s=s;
//	indices=new LinkedList();
//for(int i=0;i){
//	indices.add(i);
//}
//}
//}

//	Double d=1.0;
//	if(d instanceof Number)
//		d=d++;
//	boolean condition1=(d==2)?true:false;
//	if(condition1)
//		System.out.println("Perform action1");
//	double e=1.0;
//	if((Double)e instanceof Double | d++ == e++)
//		d+=d;
//	boolean condition2=(d>2)?true:false;
//	if(condition2)
//		System.out.println("Perform action2");
//	boolean condition3= condition1 ^ condition2;
//	if(condition3)
//		System.out.println("Perform action3");
//	}
//}

//public class Derived {
//
//	public static void main(String[] args) {
//	
//		Integer x=3;
//		Integer y=null;
//		try {
//		System.out.println(Integer.compareUnsigned(x, 3)==0 || Integer.compareUnsigned(y, 0)==0);
//		}catch(Exception ex)
//		{
//		System.out.println(ex.getClass().toString());
//		}
//		try {
//		System.out.println(y.compareTo(null)==0 || true);
//		}catch(Exception ex)
//		{
//		System.out.println(ex.getClass().toString());
//		}
//		}
//		}
//		SortedSet s=new TreeSet();
//		s.add(new Element(15));
//		s.add(new Element(10));
//		s.add(new Element(25));
//		s.add(new Element(10));
//		System.out.println(s.first()+ " "+s.size());
//		}
//		}
//		class Element implements Comparable
//		{
//		int id;
//		public Element(int id) {
//		this.id=id;
//		}
//		@Override
//		public int compareTo(Object arg0) {
//		Element e=(Element)arg0;
//		return e.id-this.id;
//		}
//		@Override
//		public String toString() {
//		return ""+this.id;
//		}
//		}


//System.out.println(Stream.of("green","yellow","blue").
//
//		max((s1,s2)->s1.compareTo(s2)).
//
//		filter(s->s.endsWith("n")).
//
//		orElse("yellow"));
//Predicate length=(s)->((String) s).length()<2;
//
//Predicate equalizer=Predicate.isEqual("car");
//
//Function booleaner=i->Boolean.toString((boolean) i);
//
//Function stringer=s->Boolean.parseBoolean((String) s);
//
//System.out.println(stringer.compose(booleaner).apply(true));
//System.out.println(booleaner.apply(true));
//System.out.println(booleaner.compose(stringer).appl);
//System.out.println(stringer.compose(booleaner).apply(true));
//System.out.println(stringer.compose(booleaner).apply(true));
//


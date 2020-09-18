

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

//public class MultiThreadingExample {
//
//public static void main(String[] args) {
//StartThread obj1 = new StartThread("one");
//
//StartThread obj2 = new StartThread("two");
//try
//{ obj1.t.wait();
//System.out.print(obj1.t.isAlive());
//}
//catch(Exception e)
//{System.out.print("Main thread interrupted");
//} } }
//
//class StartThread extends Thread
//{
//Thread t;
//String name;
//StartThread(String threadname)
//{ name = threadname;
//t = new Thread(this,name);
//t.start();
//}
//public void run()
//{
//
//} }
//public class ThreadDemo {
//public static void main(String[] args) throws Exception{
//Foo a=new Foo();
//Thread tt=new Thread(a,"A");
//Thread tt1=new Thread(a,"B");
//tt.start(); tt.join(); tt1.start();
//} }
//class Foo implements Runnable{
//@Override
//public void run() {
//try { for(int i=0;i<4;i++) {
//Thread.sleep(1000);
//System.out.print(Thread.currentThread().getName());
//} }catch(InterruptedException e)
//{} } }
 class Ping extends Utils {
public static void main(String [] args) throws Exception {
Utils u = new Ping();
System.out.print(u.getInt(args[0]));
}
int getInt(String arg) {
return Integer.parseInt(arg);
}
}
 class Utils {
int getInt(String x) throws Exception { return 7; }
}
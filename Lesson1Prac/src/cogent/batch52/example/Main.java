package cogent.batch52.example;
interface I1{
	String name = "N1";
}
public class Main  {
	 public static void main(String a[]) {
		 String s="cogent";
		 String s1="cogent";
		 String s2=new String("Cogent"); 
		 String s3=new String("Cogent");
		 System.out.println(s==s1);
		 System.out.println(s.equals(s1));
		 System.out.println(s2==s3);
		 System.out.println(s.equals(s3));
		 System.out.println(s2.hashCode()==s3.hashCode());
		 
	    }

}

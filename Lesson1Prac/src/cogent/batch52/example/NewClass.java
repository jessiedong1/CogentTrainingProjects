package cogent.batch52.example;

public class NewClass {
	public static void testIfA() {
		if (testIfB("True")) {
		System.out.println("True");
		} else {
		System.out.println("Not true");
		}
		}
		public static Boolean testIfB(String str) {
		 return Boolean.valueOf(str);
		}
		
		public static void main() {
			testIfA();
		}

}

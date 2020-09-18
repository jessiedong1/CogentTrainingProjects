public class TestException {
	public static int sum(int[] nums) {
		int total = 0;

//		try {
			for(int i=0; i<=nums.length;i++)
				total += nums[i];
				
				
//		}catch(Exception e) {
//			System.out.println(e);
//		}
		
		System.out.println("End of sum");
		return total;
	}
	public static void main(String []args) {
		int[] numbers = {0,1,2,3,4,5,6,7,8,9};
		
		System.out.println(sum(numbers));
		System.out.println("End of Main");
	}
}

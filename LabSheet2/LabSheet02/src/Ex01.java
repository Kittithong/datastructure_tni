
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {23, 67, 8, 91, 45, 12, 78};
		
		System.out.println("length = " + nums.length);
		System.out.println("The first elemaent = " + nums[0]);
		System.out.println("The Last elemaent = " + nums[nums.length-1]);
		System.out.println("The middle elemaent = " + nums[nums.length-1]);
		
		System.out.println("Display all elemants :");
		 //for ธรรมดา
		//for ( int i=0; i<nums.length; i++) 
		//{System.out.print(","+  nums[i]);
		boolean first_element = true;
		for (int num : nums) {
//			if (!first_element) {
//				System.out.print(",");
//				}
			System.out.print((!first_element? ", " : "") + num);
			first_element = false;
	}
		
	}
}




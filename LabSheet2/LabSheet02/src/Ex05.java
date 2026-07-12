
public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Array_controller nums = new Array_controller();
		nums.display("Alements: ");
		
		int[] new_nums = new int[nums.getSize()-1];
				
		//copy
		for (int i=0; i<new_nums.length; i++) {
			new_nums[i] = nums.getNums()[i];
		}
		//display
		nums.setNums(new_nums);
		nums.display("\n\nAfter deleted the last index:");
	
	}

}

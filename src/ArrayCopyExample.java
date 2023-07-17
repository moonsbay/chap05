
public class ArrayCopyExample {
	public static void main(String[] args) {
		System.out.println(args.length);
		
		for(String arg : args)
			System.out.println(arg);
	}
	public static void main2(String[] args) {
		int[] nums = {9, 1, 3, 5, 7};
		
		int[] dest = new int[10];
		
		System.arraycopy(nums, 0, dest, 0, nums.length);
		
		nums = dest;
		
		for(int i=0; i<nums.length; i++) //전통적 for 문
			System.out.printf("%d ", nums[i]);
		
		System.out.println();
		
		for(int n : nums)   //향상된 for 문
			System.out.printf("%d ", n);
			
			
	}

}


public class ArrayExample {
	
	public static void main(String[] args) {
		int[][][] nums= new int[3][10][20];
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<20; j++) {
				do {
				nums[0][i][j] = (int)(Math.random()*8 + 30);
				nums[1][i][j] = (int)(Math.random()*8 + 40);
				}while(nums[0][i][j] + 10 == nums[1][i][j]); 
				
				nums[2][i][j] = (int)(Math.random()*26 + 'A');
			}
				
		}
		
		for(int k=0; k<3; k++) {
		  for(int i=0; i<10; i++) {
			for(int j=0; j<20; j++) {
				
				if(k==2)
					System.out.printf("%c ", nums[k][i][j]);
				else
				    System.out.printf("%d ", nums[k][i][j]);
				
			}
				System.out.println();	
		   }
		  
		  System.out.println("\033[0m");  // color reset
//		  System.out.println("\033[2j");  //clear screen
		  
		  for(int i=0; i<10; i++) {
				for(int j=0; j<20; j++) {
					System.out.printf("\033[%dm", nums[0][i][j]);    // fg  VT100을 이용한 것
					System.out.printf("\033[%dm", nums[1][i][j]);    // bg
					System.out.printf("%c ", nums[2][i][j]);         // ch
					
				}
				System.out.println();	
		  }
		  System.out.println("\033[0m");
		 }
		  
		  
	}
	
	
	
	
	public static void main7(String[] args) {
		int[][][] nums= {
				{
					{1,2,3,4},
					{2,3},
					{1,2,1,2,2,2,2}
					
				},
				{
					{1,2,3,4},
					{2,3},
					{1,2,1,2,2,2,2},
					{1,1,1}
					
				},
		};
		
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums[i].length; j++) {
				for(int k=0; k<nums[i][j].length; k++) {
					System.out.printf("%02d ", nums[i][j][k]);    // "%02d" 는 간격이 다름.. 스페이스가 없음
				}
				System.out.println();
			}
			System.out.println();
				
		}
		
		
		
		
		
		
	}
	
	
	
	public static void main6(String[] args) {
		int[][] nums = new int[5][8];
		
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums[i].length; j++)
				nums[i][j] = (int)(Math.random()*8+30);
			
		}
	
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums[i].length; j++)
             System.out.print(nums[i][j]+" ");
			System.out.println();
		}
		
		
	}
	
	
	
	public static void main5(String[] args) {
		int[][] nums = {               //자바에서는 불규칙한 하기와 같은 배열도 가능
				{1,2,3,4},        
				{5,6,7,8,9},
				{9}
		
		};
		
		System.out.println(nums.length);        // 3  행을 구하는 것
		System.out.println(nums[0].length);     // 4  행이 몇개인지 구하는 것 
		System.out.println(nums[1].length);     // 5
		System.out.println(nums[2].length);     // 1
		
		int sum = 0;
		for(int i=0; i<nums.length; i++) {
	        for(int j=0; j<nums[i].length; j++)
	        	sum += nums[i][j];
			
	//		for(int j=0; j<4; j++)     // 4(또는 어떤행의 개수까지) 하면 상기의 배열을 표현 못하여 에러발생
	//			sum += nums[i][j];
		}
		System.out.println(sum);
		
		
		
		
		
	}
	
	
	public static void main4(String[] args) {
		int[] nums = new int[100];  // 100개의 공간만 만들어지고 기본적으로 '0'초기화 됨
		
		for(int i=0; i<nums.length; i++)
			nums[i] = (int)(Math.random()*100+1);
		
		for(int i=0; i<nums.length; i++)
			System.out.println(nums[i]);
		
		int sum = 0;
		for(int i=0; i<nums.length; i++)
			sum += nums[i];
		
		double avg = (double)sum/nums.length;
		
		System.out.printf("avg=%.2f\n", avg);
		
		
		
		
		
	}
	
	
	
	
	public static void main3(String[] args) {
	    int[] nums = {1, 56, 7, 9};    //DO Auto-generated method stub
        
	    int[] nums2;
        
	    nums2 = new int[] {1, 2, 3, 4};  // 원소의 값은 변경 가능하나 배열을 늘리거나 줄일 수 없다, 문자열의 경우는 원소도 변경할 수 없다
	                                     // "Hello" 는 원소 변경 불가능.. 새로 써서 전체복사하는 거다.
	    nums[0] = 100;       
	    nums[3] = 200;      // in-place 안에서 고칠 수 있다는 뜻..      out post는 상기 "Hello"처럼 못 고치는 것
//	    nums[4] = 300;     // 없는 배열을 참조하게 되면 컴파일까지 되나 실행시 프로그램죽는다...
	
	    
	    System.out.println(nums[0]);
	    System.out.println(nums[1]);
	    System.out.println(nums[2]);
	    System.out.println(nums[3]);
//	    System.out.println(nums[4]);   // 이것 땜에 죽든다
	    System.out.println("End...");
	
	}                                    
	
	
	
	
	//배열참조변수는 생성할 때 초기화할 때는 "new" 생략가능하나.. 생성 후 초기화할 때는 반드시 new 넣어줘야한다
	
	
	
	public static void main2(String[] args) {
		int num = 10;
		
		int[] nums = {10, 20, 40};    // type옆에 [] 붙이면 배열.. {}기호로 초기화 가능 배열도 참조타입
		nums = null;
		
		String str = "java,c/c++,python,html,css";
		String[] strs = str.split(",");
		for(int i=0; i<strs.length; i++)      // strs.length 가 머지?
			System.out.println(strs[i]);
		int i = strs.length;      // 배열의 개수가 나오네..
		System.out.println(i);
	}
        
}

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("============================================");
			System.out.println("1.학생수 | 2.점수입력 | 3. 점수리스트 | 4.분석 | 5.종료");
			System.out.println("============================================");
			System.out.print("선택 >  ");
			
			int selectNo = scanner.nextInt();
			if(selectNo == 1) {
				System.out.println("학생수 > ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
				for(int i=0; i<scores.length; i++) {
					System.out.printf("scores[%d]=" , i);
					scores[i] = scanner.nextInt();
				}
			
			}else if(selectNo == 2) {
				
			}else if(selectNo == 3) {
				for(int i=0; i<scores.length; i++)
					System.out.printf("scores[%d]=%d\n", i, scores[i]);
			}else if(selectNo == 4) {
				int max = 0;
				int sum = 0;
				double avg = 0;
				for(int score : scores) {
					if(score > max)
						max = score;
					sum += score;
				}
				avg = sum/studentNum;
				System.out.printf("max = %d", max);
				System.out.printf("sum = %d", sum);
				System.out.printf("avg = %d", avg);
			}else if(selectNo == 5) {
				run = false;
				
			}else 
			    System.out.println("잘 못 입력하셨습니다");
			    studentNum = 0;
			    scores = null;
			
		}
	}

}

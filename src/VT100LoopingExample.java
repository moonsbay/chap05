public class VT100LoopingExample {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("\033[2j");
		  int count = 0;
		  for(;;) {
		   int line = (int)(Math.random()*20 + 1);
		   int column = (int)(Math.random()*40 + 1);
		   int fg = (int)(Math.random()*8 + 30);
		   int bg = (int)(Math.random()*8 + 40);
		   char ch = (char)(Math.random()*26 + 'A');
		   int[][] full = new int[20][40];
		   boolean t = true;
		  
		   System.out.printf("\033[%d;%dH", line, column);
		   System.out.printf("\033[%dm", fg);
		   System.out.printf("\033[%dm", bg);
		   System.out.printf("%c", ch);
		  
		   System.out.printf("\033[1;41H");
//		   System.out.println("\033[0m");
		   System.out.printf("\033[0m");
//		   System.out.printf("i = [%5d]", i);
		   Thread.sleep(10);
		   count++;
		   System.out.printf("\033[0m");
		   System.out.printf("\033[21;1H");
		   System.out.printf("count = %d", count);
		   if(t == false) {
		    for(int i=0; i<20; i++) {
			  for(int j=0; j<40; i++) {	  
				  if(full[i][j] != null)
				     t = false;
			  }
		    }
		     break;
		  }
		}
		
		
		System.out.println("Program End");
	}

}

import java.time.DayOfWeek;

public class EnumExample {
    enum Gender{
    	Male, Female
    }
    enum Color{
    	Black, Red, Green, Yellow, Blue, Magenta, Cyan, White
    }
    
    public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				Color fg = Color.values()[(int)(Math.random()*8)]; //랜덤컬러 0~7해서 8개이므로 *8
				Color bg = Color.values()[(int)(Math.random()*8)];
//			    Color fg = Color.values()[3]; // Yellow
				System.out.printf("\033[%dm", fg.ordinal()+30);  // +30 한것은 vt100의 컬러를 표현하기 위해서 ,현재는 메로리 0부터니까
				System.out.printf("\033[%dm", bg.ordinal()+40);
				char ch = (char)(Math.random()*26 + 'A');        // 터미널에서 해보면 이상한 문자 없이 정확히 나온다
				System.out.print(ch);
			}
			System.out.println(/*"\033[0m"*/); //색 초기화 왜 필요할까?
		}
		
	}
    
    
    
    public static void main5(String[] args) {
		Color[] colors = Color.values();
		
		for(Color c : colors)
			System.out.printf("[%d, %s]\n", c.ordinal(), c.toString());	
		
		DayOfWeek[] weeks = DayOfWeek.values();
		for(DayOfWeek w : weeks)
			System.out.printf("[%d, %s]\n", w.ordinal(), w.toString());
		
	}
    
    public static void main4(String[] args) {
    	
//    	enum Color{                                                   enum이 여기 있어도 결과는 마찬가지인데.. 왜 위에 하셨을까?..
//        	Black, Red, Green, Yellow, Blue, Magenta, Cyan, White     main 번호 바꿔가며 enum을 계속 사용하려고 그런거군.. 
//        }
		Color c1 = Color.Black;
		Color c2 = Color.Red;
		
		System.out.printf("[%d, %s]\n", c1.ordinal(), c1.toString());
		System.out.printf("[%d, %s]\n", c2.ordinal(), c2.toString());
		System.out.println(c1);
		System.out.println(c2);
	}
	public static void main3(String[] args) {
		Gender g = null;
//		g = 10;      저장안됨
//		g= "male"    저장안됨
		g = Gender.Male;
		g = Gender.Female;
		
		DayOfWeek week = null;
		week = DayOfWeek.FRIDAY;
		
		
	}

}

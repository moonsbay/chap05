
public class NullExample {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hi";
		String str3 = null; //참조하는 주소가 null이다 (없다)...   NaN은 실수타입에만 저장가능 무한대도 마찬가지.. 이것과 같이 Null은 참조타입에만 가능
//        int num = null;     에러..  null을 넣을 수 있는 타입은 참조타입만 가능
		
//		str3 ="World";
		
		System.out.println(str1.length());
		System.out.println(str2.length());
		System.out.println(str3.length());   // 컴파일은 되지만 실행시..프로그램이 여기서 죽는다... 참조할 수 있는 주소가 null이니까...
	                                         // 하기의 출력은 실행되지 않고 중지됨  NullpointException이라는 에러가 뜨면서 비정상종료
		                                     // 참조변수에서 많이 보게되는 에러다
		System.out.println("Program End...");
	}
//    public static void main2(String[] args) {
//		int num = 100/0;
//		System.out.println(num);              // 여기서 비정상종료.. 정수에 100/0의 정의가 안되어 있으므로.. 
//		System.out.println("Program End");  
//	}
}

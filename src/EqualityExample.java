
public class EqualityExample {

	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 100;
		System.out.println(num1 == num2);   //값을 비교한다 true
		
		String str1 = new String("Hello");   // new라고 하면 무조건 프로세스맵의 "힙"영역에 생성된다
		String str2 = new String("Hello");
		
		String str3 = "Hello"; //초기화 할 수 있는 참조변수는 string과 배열밖에 없음
		String str4 = "Hello"; //스트링은 많이 쓰니까 new라고 안해도 되게 java가 편히를 봐주는 것
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1==str2); //메모리번지를 비교한다 false
		System.out.println(str1.equals(str2)); // 메모리 번지의 값을 비교한다. .equals는 모든 참조변수의 값비교에 사용한다
		
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
	}

}

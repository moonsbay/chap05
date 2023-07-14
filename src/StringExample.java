
public class StringExample {

	public static void main(String[] args) {
		int num = 10;
		String str1 = "Hello"; //초기화 할 수 있는 참조변수는 string과 배열밖에 없음
		String str2 = "Hello"; //스트링은 많이 쓰니까 new라고 안해도 되게 java가 편히를 봐주는 것 (string은 new 생략가능) 
		                       //동시에 앞의 Hello와 같은 것을 보고 str2에도 str1의 주소를 프로그램이 알아서 넣어준다 그러므로 str1==str2 는 true다 
		                       // 결국 String str2 = str1; 과 같은 의미  str2을 new를 넣어 만들면 그 때는 다른 주소가 된다 
		String str3 = new String("Hello"); // 원형...
		String str4 = "Hello";             // 그러므로.. 정확하게 하기 위해서는 new나 equal.연산자를 사용하는 것이 좋다 
		String str5 = "Hello ";
		
		System.out.println(str1==str2); //true
		System.out.println(str1==str3); //false
		System.out.println(str2==str3); //false
		System.out.println(str1==str4); //true
		System.out.println(str1==str5);
		
	}

}

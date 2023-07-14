
public class StringOperationExample {
/*
 * Mutable (수정 가능한 데이터)
 * Immutable (수정 불가 데이터)
 */
	public static void main(String[] args) {
		String str = "자바 프로그래밍";
		str.replace("자바", "JAVA");               // 이것으로 바뀌는 것이 아니다
		String str2 = str.replace("자바", "JAVA"); // 고친 "전체"문장을 다른 변수에 넣어야 한다 
		
		
		
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str2.toLowerCase());     // 소문자로
		
		System.out.println(str.substring(3));       // substring 부분문자
		System.out.println(str.substring(3, 5));
		
		System.out.println("   Hello   ");
		System.out.println("   Hello   ".trim());  //trim() 공백을 없애줌
		
		
	}

}

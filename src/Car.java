
public class Car {
	
	int model;     // 필드, 로컬변수와는 라이프사이클이 다르다  힙에 저장된다   
	int speed;     // 필드  힙에 저장된다 
	
	void forward() {   // 동작 ===> 메소드(함수)
		int num;  // 로컬변수, 블럭변수, 임시변수, 스택변수
		System.out.println("전진...");
	}
	void backward() {   // 동작 ===> 메소드(함수)
		System.out.println("후진...");
	}

	public static void main(String[] args) {
		int num;  // 로컬변수, 블럭변수, 임시변수, 스택변수
		
		Car c1 = new Car();  // 객체생성
		c1.forward();
		c1.backward();
	}

}

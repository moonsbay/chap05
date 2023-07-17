import java.util.Scanner;

public class EqualsExample {

	public static void main(String[] args) {
		System.out.print(">");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		System.out.printf("[%s]\n", str);
		
//		if( str == "java")    이렇게 하면 안됨
		if(str.equals("java"))
			System.out.println("잘 하셨습니다");
		else
			System.out.println("아닌데욧");
	}

}

package bit701.day0831;

import java.util.Scanner;

public class Ex1_KeyInput {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	//static 변수나 메소드는 new로 객체 생성하지 않고 호출한다.
	//대표적으로 Math 클래스의 모든 메서드는 static 이다.
	//	System.out.println("3의 5승 :" + (int)Math.pow(3, 5)); 
	//	System.out.println("5,7중 더 큰 값은?" + Math.max(5, 7));
	//new로 객체를 생성, 이 변수를 인스턴스 변수라고 한다.
	System.out.print("당신의 나이를 입력하세요 : ");
	String age = sc.nextLine();
	System.out.println("당신의 나이는" + Integer.parseInt(age) + "입니다.");
	
	
	//숫자 입력후 문자열을 입력받는 경우 입력안되는 현상
	//숫자 입력후 발생하는 엔터값이 버퍼에 저장되는데 문자열입력시 
	//이 버퍼에 있는 엔터를 먼저 읽고 없을경우 키보드로 읽는다.
	
	
	//방법1 : 버퍼의 엔터문자를 먼저 읽어서 없앤다
//	sc.nextLine();
	
	//방법2 : 숫자를 읽을경우도 무조건 nextLine 으로 문자열로 입력후 변환해서 사용한다. 
	// age 변수를 String nextLine으로 만들고 Int형식으로 변환
	
	
	
	System.out.print("이름을 입력하세요 : ");
	String name = sc.nextLine(); // ---> 공백있게 문자 읽어옴
	System.out.println("이름은 " + name + "입니다");
	}

}

package bit701.day0831;

import java.util.Scanner;
//switch 문은 jdk8 이전까지는 정수, 문자만 가능했으나 그 이후 문자열도 가능해졌음
public class Ex8_Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		System.out.print("1~3 중 하나를 입력하세요: ");
//		int num = sc.nextInt();
//		switch (num) {
//		case 1:
//			System.out.println("one!");
//			break;
//		case 2:
//			System.out.println("two!");
//			break;
//		case 3:
//			System.out.println("three!");
//			break;
//		default:
//			System.out.println("범위를 초과했습니다!");
//			break;
//		}
		
		System.out.print("영문 색상명을 입력하세요: ");
		String color = sc.nextLine();
		
		switch(color) {
		case "red": //break가 없으므로 case RED 실행
			
		case "RED":
			System.out.println(color +" : 빨강색");
			break;
		case "green"://break가 없으므로 case GREEN 실행
		case "GREEN":
			System.out.println(color +" : 초록색");
			break;
		case "pink"://break가 없으므로 case PINK 실행
		case "PINK":
			System.out.println(color +" : 분홍색");
			break;
		default:
			System.out.println("그 외의 다른 색상");
			break;
		}

	}

}
//숫자를 입력받아 1:one 2:two 3:three 그 이외 : other number
//switch는 num 값에 따라서 해당 case 실행
//단 break가 없을 경우 끝까지 실행됨
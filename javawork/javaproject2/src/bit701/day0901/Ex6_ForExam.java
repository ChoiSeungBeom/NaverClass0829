package bit701.day0901;
import java.util.Scanner;
public class Ex6_ForExam {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("2~9까지의 숫자를 입력하세요 : ");
	int num = sc.nextInt();
	
	if(num <2 || num>9) {
		System.out.println("잘못된 숫자입니다.");
		return;
	}
	System.out.println("\t**"+num +"단"+ "**\n");
	
	for(int i=1;i<=9;i++) {
		System.out.printf("%7d X %d = %2d\n",num,i,num*i);
	}
	
	}
}
/*
 * 1. 숫자 n을 입력받은 후 1부터 n까지의 총 합계를 출력하시오.
 * 
 * 2. (구구단 숫자 2~9 사이의 숫자를 입력받아, 범위를 벗어날 경우 //"잘못 입력하여 종료합니다"라고 종료
 * 제대로 입력시 해당 구구단 출력
 * ** 5단 **
 * 5 x 1 = 5
 * 5 x 2 = 10
 * .
 * .
 * .
 * 5 x 9 = 45
 * ) 
 * 
 */

//1번 문제
//package bit701.day0901;
//import java.util.Scanner;
//public class Ex6_ForExam {
//
//	public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("숫자를 입력하세요 : ");
//	int n = sc.nextInt();
//	
//	int result = 0;
//	for(int i=1;i<=n;i++) {
//		result += i;
//		
//	}
//	System.out.println("1부터" + n +"까지의 합은"+result+"입니다.");
//		
//	}
//
//}
 
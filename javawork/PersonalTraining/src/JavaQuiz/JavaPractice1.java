package JavaQuiz;

import java.util.Scanner;

public class JavaPractice1 {
	public static void main(String[] args) {
		Scanner StdIn = new Scanner(System.in);
		System.out.println("1~99까지 정수를 입력하세요 : ");
		int num = StdIn.nextInt();
		if(num!=0 && num>=1 && num<=99) {
			int a,b;
			a = num/10;
			b = num%10;
			
			if(a == 3 || a == 6|| a == 9 || b == 3 || b == 6 || b == 9) {
				System.out.println("박수 짝짝!");
			}
			else if(a != 3 || a != 6|| a != 9 || b != 3 || b != 6 || b != 9) {
				System.out.println("3,6,9가 포함되지 않습니다.");
			}
		else{
			System.out.println("1~99가 아닙니다.");
			}
		}
	}
}

//369게임을 간단히 작성해보자, 1~99가지의 정수를 입력받고 정수에 3,6,9 중 하나가 있는 경우는 “박수짝”을 출력하고 
//두 개 있는 경우는 “박수짝짝”을 출력하는 프로그램을 작성하라. 
//예를 들면, 키보드로 입력된수가 13인 경우 “박수짝”을, 36인 경우 “박수짝짝”을 출력하면 된다. 
//3,6,9가 하나도 없는 숫자는 아무것도 출력하지 않는다.
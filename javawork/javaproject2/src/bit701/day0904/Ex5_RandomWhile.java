package bit701.day0904;

import java.util.*;
		// TODO Auto-generated method stub



public class Ex5_RandomWhile {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	//1~100 사이의 난수 구하기
	int com = (int)(Math.random()*100)+1;
	int count = 0;//횟수를 구할 변수
	int num;

	while (true) {
		System.out.println("정수를 입력하세요(1~100) : ");
		num = sc.nextInt();
		System.out.println("낸 횟수 : " + ++count);
		
		
		System.out.println("내신 값은 : "+num + "입니다.");
		if(num<1||num>100) {
			
			System.out.println("다시 입력하세요.");
			count = count -1;
		}
		if(com>num) {
			System.out.println("up");
		}
		else if(com<num) {
			System.out.println("down");
		}
		else {
			System.out.println("정답("+com+")");
			break;
		}
	}
	System.out.println("** 프로그램 종료 **");
	
	
	}

}
/*
 * 1~100 사이의 난수를 발생후 숫자 알아맞추기
 * 
 * 65가 발생시
 * 
 * 1: 60
 * 	60보다 큽니다
 * 
 * 2: 70
 * 	70보다 작습니다
 * 
 * 5: 65
 * 	정답입니다(난수값)- 맞출경우 종료
*/	


package JavaQuiz.day0914;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lefton = 0;
		int righton = 0;
		int [] a = new int [100];
		while (true) {
			System.out.print("(탈출: 11) 누를 전구 번호를 입력하세요(1~7):");
			int num = Integer.parseInt(sc.nextLine());
			
			if (num >= 1 && num <= 7) {
				if (num == 1) {
					lefton = 7;
					righton = num+1;
				}
				
				else {
					lefton = num-1;
					righton = num+1;
				}
			}
			
			else if(num == 11) {
				System.out.println("종료합니다");
				break;
			}
			else {
				System.out.println("잘못된값을 입력했습니다.");
				continue;
			}
			System.out.println(num + "번 전구가 켜집니다 왼쪽 "+ lefton+ "번이 켜집니다, 오른쪽"+ righton + "번이 켜집니다" );
		}
	}
}

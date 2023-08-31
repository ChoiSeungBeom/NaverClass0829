package JavaQuiz;

import java.util.Scanner;
import java.util.Random;

public class JavaPractice2 {
	
	public static void main(String[] args) {

		
		int com = (int)(Math.random()*3)+1;
		String[] arr = new String[10];
		
		Scanner sc = new Scanner(System.in);
		System.out.print("가위,바위,보 중 하나를 입력하세요 : ");
		String user = sc.nextLine();
		int win,lose,draw;
		int w,l,d;
	  for(int result = 1; result <= 10; result++) {
		  
		if(user.equals("가위")) {
			System.out.println("가위를 내셨습니다.");
			if(com == 1) {
				draw = result + 1;
				System.out.println("컴퓨터 : 가위");
				System.out.println("");
				System.out.println("무승부" + draw + "번 비겼습니다.");
				
				System.out.println("-------------------------");
			}
			else if(com == 2) {
				lose = result + 1;
				System.out.println("컴퓨터 : 바위");
				System.out.println("");
				System.out.println("패배"+ lose + "번 지셨습니다.");
				System.out.println("-------------------------");
				
			}
			else if(com == 3) {
				win = result + 1;
				System.out.println("컴퓨터 : 보");
				System.out.println("");
				System.out.println("승리"+ win + "번 이겼습니다.");
				System.out.println("-------------------------");
			}
		}
		else if(user.equals("바위")) {
			System.out.println("바위를 내셨습니다.");
			
			if(com == 1) {
				win = result + 1;
				System.out.println("컴퓨터 : 가위");
				System.out.println("");
				System.out.println("승리"+ win + "번 이겼습니다.");
				System.out.println("-------------------------");
			}
		else if(com == 2) {
				draw = result + 1;
				System.out.println("컴퓨터 : 바위");
				System.out.println("");
				System.out.println("무승부"+ draw + "번 비겼습니다.");
				System.out.println("-------------------------");
			}
		else if(com == 3) {
				lose = result + 1;
				System.out.println("컴퓨터 : 보");
				System.out.println("");
				System.out.println("패배"+ lose + "번 졌습니다.");
				System.out.println("-------------------------");
			}
		}
		
		if(user.equals("보")) {
			System.out.println("보를 내셨습니다.");
			if(com == 1) {
				lose = result + 1;
				System.out.println("컴퓨터 : 가위");
				System.out.println("");
				System.out.println("패배"+ lose + "번 졌습니다.");
				System.out.println("-------------------------");
			}
			else if(com == 2) {
				win = result + 1;
				System.out.println("컴퓨터 : 바위");
				System.out.println("");
				System.out.println("승리"+ win + "번 이겼습니다.");
				System.out.println("-------------------------");
			}
			else if(com == 3) {
				draw = result + 1;
				System.out.println("컴퓨터 : 보");
				System.out.println("");
				System.out.println("무승부"+ draw + "번 비겼습니다.");
				System.out.println("-------------------------");
			}
			else {
				System.out.print("다시 입력하세요.");
			}
//			System.out.println("승률은" + ((win + lose + draw)/win));
		}
		
	  }
	    	  

	}
}

//Q : 가위바위보 게임 -> 사용자 입력으로 사용자가 가위 또는 바위 또는 보를 입력하는 것만으로 동작.
//
//
//1. 사용자 / 컴퓨터가 임의의 가위, 바위, 보를 입력
//    - 사용자는 Scanner 를 사용하여 입력 (직접 가위, 바위, 보 중 하나 입력)
//    - 컴퓨터는 Random 를 사용하여 입력 (0, 1, 2 중 하나를 임의로 생성)
//    - Random 을 통해 생성된 0, 1, 2 의 값은 각각 가위, 바위, 보로 치환하여 동작하게 한다.
//
//2. 승부 비교를 위한 조건문 작성
//    - 가위 : 바위 -> 바위 승, 가위 : 보 -> 가위 승, 가위 : 가위 -> 무승부
//    - 바위 : 바위 -> 무승부,  바위 : 보 -> 보 승,  바위 : 가위 -> 바위 승
//    - 보 : 바위 -> 보 승,    보 : 보 -> 무승부,   보 : 가위 -> 가위 승
//  
//3. 2번 비교 결과에 따른 승, 패, 무 저장해두어 승률을 출력
package JavaQuiz;
import java.util.*;
public class JavaPractice5 {

	public static void main(String[] args) {
	int com = (int)(Math.random()*100)+1;
	
	Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.println("정수를 입력하세요 : ");
			int user = sc.nextInt();
			while(user<com);{
				System.out.println("up!");
			}
			
		}
	}

}


//================================== do while 문을 이용한 updown게임 ================================

//Scanner sc= new Scanner(System.in);
//int com = (int)(Math.random()*100)+1;
//int count = 10;
//do {
//	System.out.println("1~99의 정수를 입력하세요 : ");
//	--count;
//	int user = sc.nextInt();	
//	if(com == user) {
//		System.err.println(user);
//		System.out.println(count +"번 남기고"+ (10-count) +" 번만에 정답입니다!");
//		break;
//	}
//	String result = (com<user) ?"down!":"up!";
//	System.out.println(result);
//	System.out.println(count + "번의 기회가 있습니다.");
//	System.out.println("=".repeat(30));
//	
//	
//}
//while(true); {
//	sc.close();
//}

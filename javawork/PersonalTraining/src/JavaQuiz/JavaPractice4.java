package JavaQuiz;
import java.util.Scanner;
import java.util.random.*;
public class JavaPractice4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("정수를 입력하세요(1~99) : ");
	int num = sc.nextInt();
	int com = (int)(Math.random()*99)+1;
	while (true) {
		if(com==num) { 
			System.out.println("정답입니다!");
			break;
		}
		System.out.println("내신 값은 : "+num + "입니다.");
		
		if(com>num) {
			System.out.println("up");
			return ;
		}
		else if(com<num) {
			System.out.println("down");
		}
		
	}
	
	
	
	}

}



//랜덤 함수를 이용해 up, down을 입력하는 코드
//기회 7번
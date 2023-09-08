package bit701.day0901;
import java.util.Scanner;
public class Ex7_ForExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 시작단 입력하세요: " );
		int start = sc.nextInt();
		System.out.println("출력할 끝단 입력하세요 : ");
		int end = sc.nextInt();
		
		//start가 end보다 클경우 두 변수의 값을 바꿔보자
		
		if(start>end) {
			int temp = start;
			start = end;
			end = temp;
			System.out.println("시작단과 끝단이 바껴서정렬후 출력합니다.");
		}
		
		for(int dan=start;dan<=end;dan++) {
			System.out.printf("%7d단 ",dan);
		}
		System.out.println("\n");
		//////////////////////////구구단 시작/////////////////////
		for(int i=1;i<=9;i++) {
			for(int dan=start;dan<=end;dan++) {
				System.out.printf("%5dx%d=%02d",dan,i,dan*i);	
			}
			
			System.out.println();
		}
		
	
	}

}



/*
 * 구구단을 출력할 시작단 입력
 * 4
 * 구구단을 출력할 끝단 입력
 * 6
 * 		4단  	5단  	6단 
 * 
 * 	   4x1=4   5x1=4    6x1=6
 *     4x2=8   5x2=10
 *         
 */    

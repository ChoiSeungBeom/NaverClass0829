package JavaQuiz;
import java.util.*;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//키보드를 입력 받아 10개의 정수를 저장하고 그 값을 오름차순으로 정렬해라
		int []list = new int [10];
		Scanner sc = new Scanner(System.in);
		
		
		//값 입력받기
		for(int i=0;i<list.length;i++) {
			System.out.println(i + "번째 정수를 입력하세요 : ");
			int num = sc.nextInt();
			list[i] = num;
			

		
		int tmp;
		
		//오름차순으로 정렬
		for(int i=0;i<list.length-1;i++) {
			for(int j=i+1;i<j;j++) {
			tmp = list[i];
			list[i] = list[j];
			list[j] = tmp;
			System.out.println("=".repeat(40));
			System.out.println("\n");
			System.out.println("결과는 : " + list[i]);
			}
			}
		}
		
		
		
	}

}

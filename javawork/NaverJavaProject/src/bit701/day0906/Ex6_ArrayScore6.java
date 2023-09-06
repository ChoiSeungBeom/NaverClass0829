package bit701.day0906;
import java.util.*;
public class Ex6_ArrayScore6 {

	public static void main(String[] args) {
	int [] score = new int[5];
	int sum=0;
	double avg=0;
	Scanner sc = new Scanner(System.in);
	
	//입력
	
	for(int i=0;i<score.length;i++) {
		System.out.println(i+"번 점수입력 : ");
		score[i] = sc.nextInt();
		//조건추가
		if(score[i] < 0 || score[i] > 100) {
			System.out.println("잘못입력");
		i--; // 미리1 감소후 i++에서 1증가되므로 다시 제자리에 입력
		continue; // i++로 이동
		}
		
		sum+=score[i];
		
	}
	avg = (double)sum/score.length;
	
	//출력
	System.out.println("입력한 점수들");
	for(int n:score)
		System.out.printf("%5d",n);
	System.out.println("\n총점 : "+ sum);
	System.out.println("평균 : "+avg);
	}
}



/*
 * score에 5개의 배열할당후 키보드로 직접 점수를 입력하여 배열에 저장후
 * 총점과 평균을 구하세요
 * 0보다 작거나 100보다 크면 1번점수로 초기화
 */
package bit701.day0906;

public class Ex4_ArraySum {

	public static void main(String[] args) {
		//배열에 5개의 정수를 저장후 총점과 평균을 구해보자
		int [] score = {78,100,93,89,68};
		int sum = 0;
		double avg = 0;
		
		
		//방법 1
		//sum 계산이 모두 끝난후 평균 구하기		
		for(int i=0;i<score.length;i++) {
			sum+=score[i];
		}
		
//		//방법 2
//		for(int i:score) {
//			sum+= i;
//		}

		avg=(double)sum/score.length;	
		System.out.println("총점수 개수 : "  + score.length);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("\n");
		System.out.println("=".repeat(40));
		
	}

}

package bit701.day0906;

public class Ex10_ArrayRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int []score = new int[5];
		int []rank = new int[6];
		
		//다중 for문으로 등수 구하기
		for(int i=0;i<score.length;i++) {
			//각 i번지 등수는 1로 초기화
			rank[i] = 1;
			for(int j=0; j<score.length;j++) {
				//i번지 점수보다 j번지 점수가 더 크면 i번지 등수를 1 증가
				if(score[i]<score[j]) {
					rank[i] +=1;
				}
			}
		}
		//출력 - 번호 점수 등수
		System.out.println("번호\t이름\t등수");
		System.out.println("번호\t점수\t등수");
		System.out.println("=".repeat(40));
		for(int i=0;i<score.length;i++) {
			System.out.println(i+1+"\t"+score[i]+"\t"+rank[i]);	
		}
		
	}

}


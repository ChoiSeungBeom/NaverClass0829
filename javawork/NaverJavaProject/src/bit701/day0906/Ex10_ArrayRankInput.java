package bit701.day0906;
import java.util.*;
public class Ex10_ArrayRankInput {
	public static void main(String[] args) {


		//배열선언
		int []score = new int[4];
		int []rank = new int[4];
		String []names = new String[4];
		Scanner sc = new Scanner(System.in);



		//입력
		for(int i=0;i<score.length;i++) {


			System.out.println((i+1)+"번 이름:");
			names[i] = sc.nextLine();

			System.out.println((i+1)+"번 점수:");
			score[i] = Integer.parseInt(sc.nextLine());

			if(score[i]<0 || score[i]>100) {
				System.out.println("\t다시 입력바람");
				i--;
				continue;
			}
		}

		System.out.println();

		//등수 구하기
		for(int i=0;i<score.length;i++) {
			rank[i]=1;
			for(int j=0; j<score.length;j++) {
				if(score[i]<score[j])
					rank[i]++;
			}
		}

		//출력
		System.out.println("번호 \t이름\t점수\t등수");
		System.out.println("=".repeat(50));
		for(int i=0;i<score.length;i++)
		{
			System.out.println(i+1+"\t"+names[i]+"\t"+score[i]+"\t"+rank[i]);
		}


	}
}



//총 4명의 이름과 정수를 입력하면 이름과 점수 등수를
// 출력하는 프로그램을 작성하시오
// 단, 정수가 0~100 을 벗어날경우 다시 입력하시오
/*
 * 예 : 
 * 		0번 이름 : 송혜교
 * 		0번 점수 : 99
 * 
 *   	0번 이름 : 강호동
 * 		0번 점수 : 100
 * 
 * 		...
 * 			번호 이름 점수 등수
 * 			-------------------
 * 			1	강호동 99 1
 * 
 * */

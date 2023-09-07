package bit701.day0907;
import java.util.*;
public class Ex1_Array {

	public static void main(String[] args) {

		System.out.println("배열 복습 예제");
		int count = 0;
		String [] names = new String [count];
		int [] kor = new int [count];
		int [] eng = new int [count];
		int [] sum = new int [count];
		double []avg = new double[count];
		Scanner sc = new Scanner(System.in);
		System.out.println("인원수를 입력하세요 : ");
		count =Integer.parseInt(sc.nextLine());

		for(int i=0; i<names.length;i++) {
			System.out.println("이름을 입력하세요 : ");
			names[i] = sc.nextLine();
			System.out.print("점수를 입력하세요(국어) : ");
			kor[i] = Integer.parseInt(sc.nextLine());
			System.out.print("점수를 입력하세요(영어) : ");
			eng[i] = Integer.parseInt(sc.nextLine());

			sum[i] = kor[i] + eng[i];

			avg[i] = sum[i] / 2.0;
		}
		for(int i=0; i<names.length;i++) {
			System.out.println(i+1+"\t"+names[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+sum[i]+"\t"+avg[i]);
		}
	}

}
/*
 * 처음에 인원수(count)를 입력후 그 인원수만큼
 * names, kor, eng를 배열 할당한 후 
 * 인원수만큼 이름,국어점수,영어점수를 입력하면
 * 
 * 아래와 같이 출력되도록 프로그램을 작정하세요
 * 
 * 번호 이름 국어 영어 총점 평균
 * ------------------------------
 * 
 * 1	김	 89	   90  179  89.5
 * 
 * 2    이	 100  100  200  100
 * 
 * 
 * 
 * 1.names,kor,eng 배열 할당
 * 
 * 2.Scanner로 인원수만큼 이름,국어점수,영어점수 입력
 * 
 * 3. 인원수는 count 변수로 선언
 * 
 * */
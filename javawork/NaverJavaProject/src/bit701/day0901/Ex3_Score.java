package bit701.day0901;
import java.text.NumberFormat;
import java.util.Scanner;

public class Ex3_Score {
	
	public static void main(String[] args) {
	NumberFormat numFormat = NumberFormat.getInstance();
	Scanner sc = new Scanner(System.in);
	
	System.out.println("이름을 입력하세요 : ");
	String name = sc.nextLine();
	
	System.out.println("점수를 입력하세요(kor : )");
	int kor = sc.nextInt();
	
	System.out.println("점수를 입력하세요(eng : )");
	int eng = sc.nextInt();
	
	System.out.println("점수를 입력하세요(math : )");
	int math = sc.nextInt();
	
	int add = kor+eng+math;
	double result = 0;
	result =add/3.0;
	
	if(result>=0&&result<=100) {
		if(result >= 90) {
			System.out.println("Excellent!");
		}
		
		if(result >= 80 && result < 90) {
			System.out.println("Good!");
		}
		
		if(result < 80) {
			System.out.println("Try!");
		}
	System.out.println("총점은 : " + add );
	
	numFormat.setMaximumFractionDigits(1);
	System.out.printf("%s 님의 성적은 3과목 평균 : %s점\n", name , numFormat.format(result));
	}
	
	else {
		System.out.println("다시 입력하세요.");
	}
	
	}

}


// 이름, 3과목의 정수(kore,eng,math) 를 입력받은 후 총점과 평균(소숫점 1자리 - NumberFormat)
// 그리고 등급을 출력(grade : 평균이 90이상이면 "Excellent", 80이상이면 " good", 나머지는 "Try!"라고 출력
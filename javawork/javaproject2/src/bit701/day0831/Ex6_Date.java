package bit701.day0831;
import java.util.Scanner;
import java.util.Date;
public class Ex6_Date {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("년,월,일을 순서대로 입력해주세요.");
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		Date date = new Date(year - 1900, month -1 ,day);
		
		//요일 구하기
		int weekint= date.getDay(); //(0 - 일요일) (1 - 월요일) (6 - 토요일)
//		System.out.println("요일 숫자 : " + weekint);
		
		String week = weekint==0?"일":weekint==1?"월":weekint==2?"화":weekint==3?"수":
		weekint==4?"목":weekint==5?"금":"토";
		
		System.out.printf("%s요일입니다.",week);
	}

}

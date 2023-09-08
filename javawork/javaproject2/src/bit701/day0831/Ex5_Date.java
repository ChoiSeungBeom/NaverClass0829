package bit701.day0831;

import java.util.Calendar;
import java.util.Date;

public class Ex5_Date {

	public static void main(String[] args) {
		//자바에서 시간이나 날짜 출력하는 방법
		//Date로 월을 받을 때 +1 을 해야 현재 월로 나옴 0이 1월
		//Day => 0이 일요일
		System.out.println("Date Class를 이용한 시간 날짜 구하기");
		Date date = new Date();
		int year = date.getYear()+1900;
		int month = date.getMonth() + 1;
		int day = date.getDate();
		
		
		int h = date.getHours();
		int m = date.getMinutes();
		int s = date.getSeconds();
		System.out.printf("현재 년도 : %d-%2d-%2d\n",year,month,day);
		System.out.printf("현재 년도 : %d-%02d-%02d\n",year,month,day); // 앞에 0을 붙여서 공백을 채워야함
		System.out.printf("현재 시간 : %02d:%02d:%02d\n",h,m,s);

		
		System.out.println("Callendar Class를 이용해 시간 날짜 구하기\n");
//		Calendar cal = new Calendar(); // 오류, 생성자가 public이 아니라 생성안됨
		
	Calendar cal = Calendar.getInstance();
	
	year = cal.get(Calendar.YEAR);
	month = cal.get(Calendar.MONTH) + 1; // 0~11의 값을 반환
	day = cal.get(Calendar.DATE);
	
	System.out.printf("현재 년도 : %d-%02d-%02d\n",year,month,day);
	
	//요일 구하기
	int weekint= date.getDay(); //(0 - 일요일) (1 - 월요일) (6 - 토요일)
	System.out.println("요일 숫자 : " + weekint);
	
	String week = weekint==0?"일":weekint==1?"월":weekint==2?"화":weekint==3?"수":
	weekint==4?"목":weekint==5?"금":"토";
	
	System.out.printf("오늘은 %s요일입니다.",week);
	
	}

}

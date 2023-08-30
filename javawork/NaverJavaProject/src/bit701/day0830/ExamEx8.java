package bit701.day0830;

public class ExamEx8 {

	public static void main(String[] args) {
		int money = Integer.parseInt(args[0]);
		
//		int man = money/10000;
//		int chun = (money - man*10000)/1000;
//		int baek = (money - man*10000 - chun*1000)/100;
//		int sip = (money- man*10000 - chun*1000 - baek*100)/10;
//		int il = (money - man*10000 - chun*1000 - baek*100 - sip*10)/1;
		
		int man = money/10000;
		int chun = (money%10000)/1000;
		int baek = (money%1000)/100;
		int sip = (money%100)/10;
		int il = (money%10)/1;
		
		System.out.println("총액은" + money + "입니다.");
		System.out.println("만원 짜리" + man + "장입니다.");
		System.out.println("천원 짜리" + chun + "장입니다.");
		System.out.println("백원 짜리" + baek + "개입니다.");
		System.out.println("십원 짜리" + sip + "개입니다.");
		System.out.println("일원 짜리" + il + "개입니다.");
	}

}


//money 변수에 args[0] 값을 대입 후(급여 : 백만단위 : 5674321)
/*
 * 출력
 * money : 5674321 원
 * 만원 : 567 장
 * 천원 : 4장
 * 백원 : 3개
 * 십원 : 2개
 * 일원 : 1개
 * 
 * 산술연산자를 사용해서 출력해보세요
 */

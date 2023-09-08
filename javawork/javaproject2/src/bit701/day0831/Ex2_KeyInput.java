package bit701.day0831;

import java.util.Scanner;
import java.util.Date;

public class Ex2_KeyInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Date 클래스를 이용해서 현재 년도를 구해보자(jdk1.1 에서 deprecate 되었지만 여전히 많이 사용)
		//권장 : Calendar를 권장한다고 함
		
		
		Date date = new Date();
		
		int curYear = date.getYear() +1900; // +1900을 해야지 현재년도가 나옴
		System.out.println("현재 년도 : " + curYear);
		

		Scanner sc = new Scanner(System.in);
		System.out.print("당신이 태어난 년도는? : ");
		int birthYear = Integer.parseInt(sc.nextLine());
		
		System.out.print("지금 사는 곳은 ? : ");
		String addr = sc.nextLine();
		
		//나이 구하기
		int age = curYear - birthYear;
		
//		System.out.println("저는 "+ addr + "에 사는 " + birthYear + "년생("+age+"세)학생입니다.");
		System.out.printf("저는 %s에 사는 %d년생(%d세)학생입니다.\n",addr,birthYear,age);
		
		//20세 이상이면 "성인 " , 미만이면 "미성년자" 라는 글자를 출력
		//if문으로 해도 되고 조건(삼항)연산자(조건식?참일때 값: 거짓일때값) 로 해도 된다.
		
		
		//조건연산자
		String msg = age>=20?"성인":"미성년자";
		System.out.println("당신은 " + msg);
		
		
		//if문
		if(age>=20) { // 한문장만 쓸경우 {} 구역설정 생략가능하지만 두문장 이상일경우 반드시 구역설정
			
			msg = "성인";	
		}
		else{ // 한문장만 쓸경우 {} 구역설정 생략가능하지만 두문장 이상일경우 반드시 구역설정
			
			msg = "미성년자";	
		}
		System.out.println(msg);
		
	}

}

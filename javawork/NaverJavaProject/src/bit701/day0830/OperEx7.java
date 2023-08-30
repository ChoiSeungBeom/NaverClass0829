package bit701.day0830;

public class OperEx7 {

	public static void main(String[] args) {

		//비교연산자와 논리 연산자, 결과값은 무조건 참(true), 거짓(false)
//		int kor=100, eng=90, math=100;
//		System.out.println(kor>=80);//참
//		System.out.println(kor>=80 || kor!=math); //참, 뒤의 것 계산하지 않음
//		System.out.println(kor<80 || kor!=math); //거짓, 앞의 것 거짓이기 때문에 뒤에것도 계산
//		System.out.println(kor>=80 && kor!=math);//거짓, 앞의 것 맞고 
//		System.out.println(kor<80 && kor!=math); // 거짓, 뒤로 안감
//		System.out.println(!(kor==math)); // 참인데 !으로 거짓
//		System.out.println(kor>=95 && eng>=95 && math>=95);// false
//		System.out.println(kor>=95 && eng>=95 || math>=95);// true
//		System.out.println(kor>=95 || eng>=95 && math>=95);// true
		
		
		int year = 2032;
		//위의 년도가 윤년인지 아닌지 알아보자
		System.out.println(year%4==0 && year%100!=0 || year%400==0);
	}

}

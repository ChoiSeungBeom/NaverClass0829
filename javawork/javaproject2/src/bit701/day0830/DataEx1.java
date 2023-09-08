package bit701.day0830;

public class DataEx1 {

	public static void main(String[] args) {
//		System.out.print("Hello33!!");
//		System.out.println("Happy44!!");
//		System.out.println("hello");
//		
		//printf: 변환기호에 의한 출력, 정수 : %d, 실수 : %f , 문자:  %c 문자열 : %s
		//\n : 줄넘김 , \t : 다음탭위치로 이동
		int Age= 26;
		char BloodType = 'B';
		double Weight = 75.356;
		String Name = "최승범";
		System.out.printf("이름 : %s\n",Name);
		System.out.printf("나이 : %d세 \n",Age);
		System.out.printf("몸무게 : %fkg\n", Weight);
		System.out.printf("몸무게 : %3.3fkg\n", Weight);//%5.1f:전체자리수:5, 소숫점자리수:1
		System.out.printf("혈액형 : %c형\n", BloodType);
		System.out.printf("===================\n");
		System.out.printf(" 이름 : %s\n 혈액형 : %c형\n 나이 : %d세\n 몸무게 : %3.1f", Name,BloodType,Age,Weight);
	}

}

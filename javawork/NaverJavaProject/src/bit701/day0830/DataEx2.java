package bit701.day0830;

public class DataEx2 {

	public static void main(String[] args) {
		System.out.println("내 이름은 " + args[0]+" 입니다.");
		System.out.println("우리집은 " +  args[1]+" 입니다.");
		System.out.println("내 혈액형은 " +  args[2]+" 형입니다.");
		System.out.println();
		System.out.println("실수형 데이터 타입");
		float f1=1234.567891234f;//4바이트 float으로 값을 지정하려면 f추가
		double f2=1234.567891234;
		System.out.println(f1); //8자리까지 출력
		System.out.println(f2); //15자리까지 출력
		
		//char 타입은 2바이트라 한글 한글자도 저장이 가능(AB는 불가능)
		char ch1='A';
		char ch2='가';
		String ch3 = new String("AB");
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		
	}
}

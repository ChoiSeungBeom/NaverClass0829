package bit701.day0830;

public class AsciiEx3 {

	public static void main(String[] args) {
	//char , int는 같은 타입이라고 봐도 된다.
		char a1=65; // 아스키로 변환 
		int a2='B'; // 십진수로 변환
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println((int)a1); //65
		System.out.println((char)a2);
		
		System.out.printf("%d의 아스키문자는 %c이다\n",(int)a1,a1);
		
		char b1='C';
		int b2=68;
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b1+1); //묵시적 형변환에 의해서 char+int = int가 나옴, 그러므로 E가 아니라 69가 나온다
		System.out.println((char)(b1+1)); // b1+2 = 69로 int 타입인데 char로 강제 형변환해서 출력
		
//				char + int = int
//				int + int = int
//				long + int = long
//				double + int = double
//				String + int = String
//				String + double = String		
		//print나println은 모든타입 출력이 가능하다
		//이유는 타입별로 여러개를 같은 이름으로 만들어놨기 때문이다
		//이런 메서드를 중복할수있는 것을 오버로밍 메서드라고 한다.
		System.out.println((5.0/2));// double + int = double -> 2.5
		System.out.println((double)5/2);// double+ int = double -> 2.5
		System.out.println((double)(5/2)); // int + int 후 double -> 2.0
		
		
	}

}

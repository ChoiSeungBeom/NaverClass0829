package bit701.day0911;

//Overloading Method: 메서드명은 반드시 같아야 하고 인자는 반드시 달라야한다.
class Apple{
	
	//... Variable Argument
		public static int sum(int...n) { //n은 배열로 넘어옴, 숫자 갯수 상관없이 int 배열타입으로 받는다
			System.out.println(2);
			System.out.println("총 "+n.length);
			return 0;
		}
//	public static int sum(int a,int b) {
//		System.out.println(1);
//		return a+b; 
//	}
	public static int sum(int s1,int s2,int s3) {
		return s1+s2+s3; //반환하는 개수가 다르면 오버로딩에 해당 
	}
//	public static double sum(double a,double b) {
//		return a+b;  //반환 개수가 같아도 형선언이 다르면 오버로딩
//	}
	public static String sum(String a,String b) {
		return a+b;  //반환 개수가 같아도 형선언이 다르면 오버로딩
	}
	public static String sum(String a,int b) {
		return a+b;  //반환 개수가 같아도 형선언이 다르면 오버로딩
	}
	
}
public class Ex2_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int s1=Apple.sum(5,7);
		System.out.println(s1);
		
		System.out.println(Apple.sum(5, 7));
		System.out.println(Apple.sum(5, 7, 9));
//		System.out.println(Apple.sum(1.2, 4.5));
		System.out.println(Apple.sum("apple", "orange"));
		System.out.println(Apple.sum("HI ", 5));
		
//		System.out.println(Apple.sum(5, "HI")); // 오류
		
	}

}

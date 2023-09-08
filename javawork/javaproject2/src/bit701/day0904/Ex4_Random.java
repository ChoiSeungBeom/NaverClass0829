package bit701.day0904;
import java.util.*;
public class Ex4_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		for(int i=0;i<5;i++) {
			int n=r.nextInt(10);//0~9 사이 난수
			System.out.println(n);
		}
		System.out.println("=".repeat(30));
		for(int i=0;i<5;i++)
		{
			int n=r.nextInt(100)+1;//1~100사이 난수
			System.out.println(n);
		}
		System.out.println("=".repeat(30));
		for(int i=0;i<5;i++) {
			int n=r.nextInt(26)+65;//임의의 대문자(65~90)
			System.out.println((char)n);
		}
		System.out.println("=".repeat(30));
	}

}

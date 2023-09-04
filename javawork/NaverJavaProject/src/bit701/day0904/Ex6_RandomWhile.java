package bit701.day0904;
import java.util.*;
public class Ex6_RandomWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int rnd,count,num;
		Exit:
		while(true) {
			rnd=(int)(Math.random()*100)+1;
			count=0;
			
			while(true) {
				System.out.print(++count+":");
				num=Integer.parseInt(sc.nextLine());
				if(num>rnd) {
					System.out.println("\t"+num+"보다 작습니다.");
				}
				else if(num<rnd) {
					System.out.println("\t"+num+"보다 큽니다.");
				}
				else {
					System.out.println("\t**정답입니다("+rnd+")"); // 계속할지 묻는다
				System.out.println("계속 하겠습니까? (y/n)");
				String ans=sc.nextLine();
				if(ans.equalsIgnoreCase("Y")){
					System.out.println("새로운 난수를 발생하겠습니다.");
					continue Exit;
				}
				else if(ans.equalsIgnoreCase("N")){
					System.out.println("프로그램을 종료합니다.");
					break Exit;
				}
//				else {
//					break Exit;	
//				}
				System.out.println();
				}
				
			}
		}

		System.out.println("**  프로그램 종료 **");
		
	}

}

package bit701.day0905;
import java.util.*;
public class Book_Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = 0;
		Exit:
		while(true){
			System.out.println("-".repeat(40));
			System.out.println("1.예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("-".repeat(40));
			System.out.println("선택 > ");
			int choi = sc.nextInt();
			
			switch(choi) {
			
			case 1:
				System.out.println("예금액>");				
				money = money + sc.nextInt();
				break;

			case 2:
				System.out.println("출금액>");
				money =money - sc.nextInt();
				System.out.println("남은 잔고" + money);
				break;
				
			case 3:
				System.out.println("남은 잔고는" + money + "원입니다.");
				break;
			case 4:
				System.out.println("종료합니다.");
				break Exit;
			}		
		}
	}
}
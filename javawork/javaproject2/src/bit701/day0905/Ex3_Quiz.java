package bit701.day0905;
import java.util.*;
public class Ex3_Quiz {

	public static void main(String[] args) {
		String num;

		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("주민번호를 입력하세요(q or Q 입력시 종료) : ");
			num = sc.nextLine();
			//q or Q 입력시 종료'


			if(num.equalsIgnoreCase("q")) {
				System.out.println("종료합니다.");
				break;
			}			
			String yearStr = num.substring(0,2);
			String monthStr = num.substring(2,4);
			String dayStr = num.substring(4,6);
			char gender = num.charAt(6);
			System.out.println(yearStr+"년" + monthStr+"월" +dayStr+"일");

			if(gender=='1'||gender=='2'||gender=='3'||gender=='4') {
				System.out.println("내국인");
			}
			else if(gender=='5'||gender=='6') {
				System.out.println("외국인");
			}
			else {
				System.out.println("다시 입력하세요.");
			}

			switch(gender) {
			case '1' : case '3' : case'5':
				System.out.println("남자!");
				break;

			case '2' : case '4' : case'6':
				System.out.println("여자!");
				break;
			default:
				System.out.println("성별 알수 없음");
			}



		}

	}
}



package bit701.day0831;
import java.util.Scanner;
public class Ex10_Quiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("상품명을 입력하세요 : ");
		String prod = sc.nextLine();
		int s = 10;
		int priceS = 1000;
		int p = 20;
		int priceP = 2000;
		int a = 30;
		int priceA = 3000;
		
		
		
		switch(prod) {
			case "딸기":
			case "Strawberry":
				System.out.printf("선택하신 제품은 딸기입니다. ");
				System.out.println("수량을 입력해주세요 : ");
				int proNum1 = sc.nextInt();
				if(proNum1 >=5) {
					int result =(int)((priceS*proNum1)*0.9);
					System.out.println("내야 될 값은 총"+ result +"원입니다.");
					System.out.println("수량은" + (s - proNum1) + "개 남았습니다.");
					break;
				}
				else if (proNum1 <= 5) {
					int result = (int)(priceS*proNum1);
					System.out.println("내야 될 값은 총"+result +"원입니다.");
					System.out.println("수량은" + (s - proNum1) + "개 남았습니다.");
					break;
				}
			case "파인애플":
			case "Pineapple":
				System.out.printf("선택하신 제품은 파인애플입니다. ");
				System.out.println("수량을 입력해주세요 : ");
				int proNum2 = sc.nextInt();
				if(proNum2 >=5) {
					int result =(int)((priceP*proNum2)*0.9);
					System.out.println("내야 될 값은 총"+result +"원입니다.");
					System.out.println("수량은" + (p - proNum2) + "개 남았습니다.");
				}
				
				else if (proNum2 <= 5) {
					int result = (int)(priceP*proNum2);
					System.out.println("내야 될 값은 총"+result +"원입니다.");
					System.out.println("수량은" + (p - proNum2) + "개 남았습니다.");
				}
			case "사과":
			case "Apple":
				System.out.printf("선택하신 제품은 사과입니다. ");
				System.out.println("수량을 입력해주세요 : ");
				int proNum3 = sc.nextInt();
				if(proNum3 >=5) {
					int result =(int)((priceP*proNum3)*0.9);
					System.out.println("내야 될 값은 총"+result +"원입니다.");
					System.out.println("수량은" + (a - proNum3) + "개 남았습니다.");
				}
				
				else if (proNum3 <= 5) {
					int result = (int)(priceP*proNum3);
					System.out.println("내야 될 값은 총"+result +"원입니다.");
					System.out.println("수량은" + (a - proNum3) + "개 남았습니다.");
				}
			
		}
		
		
	}

}


//상품명과 수량,단가를 각각 입력받은 후 총금액을 출력하시오
//그리고 수량이 5개 이상일 경우 10프로 할인된 최종 금액도 출력해주세요
// (예)
//상품명 : 딸기
// 수량 :6
// 단가:1000

// 총금액 : 6000원
// 5개 이상 10프로 할인된 금액 : 5400원


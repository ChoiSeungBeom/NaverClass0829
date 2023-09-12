package bit701.day0911;

import java.util.*;

public class Book_BankApplication {

	public static void main(String[] args) {

		Account[] account = new Account[10];
		Scanner sc = new Scanner(System.in);
		int idx=0;
		//배열 10개가 꽉차면 "더이상 계좌생성이 안됩니다"라고 출력
		Exit:
		while (true) {
			for(int i=0;i<account.length;i++) {
				System.out.println("[계좌생성 실행 결과]");
				System.out.println("=".repeat(40));
				System.out.println("1.계좌생성| 2.계좌목록|3.예금|4.출금|5.종료");
				System.out.print("선택>");
				int num = Integer.parseInt(sc.nextLine());
				System.out.println("=".repeat(40));
				
				if(num==5) {
					System.out.println("프로그램 종료!");
					break Exit;
				}
				if(idx>=10) {
					System.out.println("**더 이상 계좌생성이 안됩니다 **");
					break;
				}
				if(num ==1) {
					System.out.println("=".repeat(40));
					System.out.println("계좌번호>");
					String accountNo=sc.nextLine();
					System.out.println("계좌주>");
					String accountName=sc.nextLine();
					System.out.println("초기입금액>");
					int money =Integer.parseInt(sc.nextLine());
					
					account[idx]=new Account(accountNo,accountName,money);
					System.out.println("계좌가 생성되었습니다.");
					System.out.println("=".repeat(40));
					idx++;
					break;
				}
				else if(num==2) {
					System.out.println("=".repeat(40));
					System.out.println("계좌목록");
					System.out.println("=".repeat(40));
					for(i=0;i<idx;i++) {
						account[i].accountWrite();  //계좌목록
					}
					break;
				}
				else if(num==3) {
					System.out.println("----------\n예금\n-----------");
					System.out.println("계좌번호:");
					String accountNo=sc.nextLine();
					System.out.println("예금액");
					int money=Integer.parseInt(sc.nextLine());
					//계좌번호를 찾은 후 그 배열번지의 money에 추가
					for(i=0;i<idx;i++) {
						if(account[i].isAccount(accountNo)) {
							account[i].addMoney(money);
							break;
						}
					}
					System.out.println("결과:예금되었습니다");
					break;
				}
				else if(num==4) {
					System.out.println("----------\n예금\n-----------");
					System.out.println("계좌번호:");
					String accountNo=sc.nextLine();
					System.out.println("출금액");
					int money=Integer.parseInt(sc.nextLine());
					//계좌번호를 찾은 후 그 배열번지의 money에 추가
					for(int j=0;j<idx;j++) {
						if(account[i].isAccount(accountNo)) {
							account[i].subMoney(money);
							break;
						}
					}
					System.out.println("결과:출금이 성공되었습니다");
					break;
				}
				
				
				
			}//for
		}//while
	}//main

}//class

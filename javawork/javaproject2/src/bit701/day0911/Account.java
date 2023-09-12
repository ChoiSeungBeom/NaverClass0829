package bit701.day0911;
//교재 클래스부분 20번 문제
import java.util.*;
public class Account {
	private String accountNo; // 계좌번호
	private String accountName; // 계좌주
	private int money; // 잔액
	boolean isAccount = true;
	
	//3개의 값을 전달받는 생성자
	public Account (String accountNo,String accountName,int money){
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.money = money;
	}
	
	
	//계좌번호가 맞을경우 true를 반환해주는 메서드 getter --> 예금이나 출금할 때
	//	isAccount(String accountNo) : 맞을경우 true 반환, 틀릴경우 false반환	
	public boolean isAccount(String accountNo) {
		if(accountNo.equals(this.accountNo))
			return true;
		else
			return false;
	}
	
	
	//외부에서 입금 시 money에 추가하는 메서드(addMoney)
	public void addMoney(int money) {
		this.money += money;
	}
	
	//외부에서 출금 시 money에서 빼는 메서드(subMoney
	public void subMoney(int money) {
		this.money -= money;
	}
	
	//출력해주는 메서드 (계좌번호 예금주 잔액(accountWrite)-+)
	public void accountWrite() {
		System.out.println(accountNo+"\t"+accountName+"\t"+money);
	}
	
//	public void setAccountNo(String accountNo) {
//		this.accountNo = accountNo;
//		
//	}

	public int getMoney() {
		// TODO Auto-generated method stub
		return money;
	}
	
	public String getAccountName() {
		return accountName;
	}
	

	public String getAccountNo() {
		return accountNo;
	}


	public boolean isAccount() {
		return isAccount;
	}

}

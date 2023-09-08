package bit701.day0908;

public class Ex5_SawonCall {

	public static void main(String args[]) {
		Sawon sa=new Sawon();
		sa.setSawonNo("bit1234");
		sa.setName("홍길동");
		sa.setAge(23);

		System.out.println("** 신입사원 #1 정보 **");
		//같은클래스 내에서는 클래스. <-- 생략가능
		Ex5_SawonCall.printSawon(sa);

		Sawon sa2 = new Sawon();
		sa2.setSawonNo("bit9999");
		sa2.setName("강호동");
		sa2.setAge(35);
		
		System.out.println("** 신입사원 #1 정보 **");
		//같은클래스 내에서는 클래스. <-- 생략가능
		printSawon(sa2);
	}
	public static void printSawon(Sawon s) {
		System.out.println("사원번호 : " + s.getSawoNo());
		System.out.println("사원명 : " + s.getName());
		System.out.println("나이 : " +s.getAge());
	}
}

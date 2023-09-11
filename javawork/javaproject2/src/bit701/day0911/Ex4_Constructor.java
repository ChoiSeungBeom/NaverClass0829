package bit701.day0911;

class Car{
	private String carName;
	private int carPrice;
	
	//디폴트 생성자 (값 반환)
	Car(){
		System.out.println("디폴트 생성자 호출");
		carName="그랜저";
		carPrice=3500;
	}
	
	
	//생성자를 통해서 외부에서 값을 받아서 초기화
	Car(String carName,int carPrice){
		System.out.println("생성자 2 호출");
		this.carName=carName;
		this.carPrice=carPrice;
		
	}
	
	public void carShow() //호출함수
	{
		System.out.println("자동차명:"+carName+", 단가 : "+carPrice);
	}
	
}
public class Ex4_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1=new Car();
		car1.carShow();
		
		Car car2=new Car("아반떼",2700);
		car2.carShow();
		
		
		
	}

}

//생성자의 규칙
/*
 * 1.반드시 클래스명과 같은 메서드명
 * 2.리턴타입이 없다
 * 3.오버로딩이 가능하다
 * 4.주로 멤버변수의 초기화를 담당(초기화말고도 초기값을 주고 싶을 때 사용)
 */
// 생성자는 초기값 한번만 줌
// setter,getter --> 값을 계속 수정하고 싶을 때 사용
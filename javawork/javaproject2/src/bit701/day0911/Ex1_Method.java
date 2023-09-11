package bit701.day0911;


class Hello
{
	public static final String MESSAGE="오늘은 월요일!"; //상수앞 final --> 값 변경 못함
	
	//인스턴스 멤버 변수
	private String name;
	private int age;
	
	//private을 값을 받는법(Setter,Getter method)
	public void setName(String name) { // String name --> 인자를 받음
	this.name=name; //this.name == private name
	}
	public void setAge(int age) { // String name --> 인자를 받음
		this.age=age; //this.name == private name
		}
	//getter method
	public String getName() {
		return this.name; // this는 생략 가능
	}
	
	public int getAge() {
		return age; // this 생략
	}
	
	
	//일반 멤버 메서드
	public void show() {
		System.out.println("name="+name+",age="+age);
	}
}

public class Ex1_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello hello=new Hello(); // 메모리에 Hello클래스 할당
//		hello.show();//일단 초기값 확인 Strig = null int =0 
		hello.setName("이영자");
		hello.setAge(34);
		//출력
		//static 멤버 변수 출력 
		System.out.println("static 변수 출력 : "+hello.MESSAGE);
		System.out.println("이름:"+hello.getName());
		System.out.println("나이:"+hello.getAge());
		System.out.println();
		hello.show(); // 데이터 들어갓는지 확인하는 용도로 사용
	
	}

}

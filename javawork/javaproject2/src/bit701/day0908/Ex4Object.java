package bit701.day0908;

public class Ex4Object {
	//인스턴스 멤버 변수
	private int score;
	//클래스 멤버 변수
	static public String message;
	
	//인스턴스 멤버 메서드
	//score에 값을 넣는 메서드(setter method) --> 검색해볼것
	public void setScore(int score) {
		//멤버변수 score에 인자로 받은 score를 전달
		//매개변수명이 멤버변수명이랑 같을경우 멤버변수앞에 this를 붙인다
		this.score=score; // 매개변수에 멤버변수값 대입
	}

	//점수를 반환하는 getter method --> 검색해볼것
	public int getScore()
	{
		return score; // this.score 에서 this가 생략 가능
	} 
	//static 메서드는 static 멤버변수랑 접근가능
	//static 메서드는 this가없음
	public static void setMessage(String message) {
		Ex4Object.message=message;
	}
	//main 메서드는 static 이므로 new로 생성을 해야 멤버 접근이 가능하다
	//단 static은 호출가능
	
	public static void main(String[] args) {
	
	Ex4Object.setMessage("Hello World");
	//public이므로 바로 출력 가능
	System.out.println(Ex4Object.message);
	
	Ex4Object ex4=new Ex4Object(); // --> 다른 클래스에 있을 때 private score의 값을 가져오기 위한 식
	ex4.setScore(89);
	System.out.println("점수:"+ ex4.getScore());
	}

}

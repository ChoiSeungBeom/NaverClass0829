package bit701.day0911;
import java.util.*;
public class Student {
	private String name;
	private int birthYear;
	private int score;
	
	Student(){
		name="최승범";
		birthYear=2000;
		score=50;
//		this("최승범",2000,50); // 위에랑 같음
	}
	
	Student(String name){ // name만 외부에서 받아오고 싶을 때
		this.name=name;
		birthYear=2000;
		score=50;
	}
	
	Student(String name,int birthYear,int score){ // 모두 외부에서 받을 때
		this.name=name;
		this.birthYear=birthYear;
		this.score=score;
	}
	
	
	public void studentInfo() {
		System.out.println("** 학생정보 **");
		System.out.println("이름 : " +name);
		int year = new Date().getYear()+1900;
		System.out.println("태어난 년도 : " +birthYear+",나이:"+(year-birthYear));
		System.out.println("점수:"+score+"점");
		System.out.println("=".repeat(30));
	}
}

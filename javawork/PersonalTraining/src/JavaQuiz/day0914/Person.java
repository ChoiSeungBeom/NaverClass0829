package JavaQuiz.day0914;

import java.util.*;

public class Person {
	List<Student2> list = new ArrayList<Student2>();
	Scanner sc = new Scanner(System.in);
	public Person(){
		list.add(new Student2("이효리","B형",30));
		list.add(new Student2("최승범","B형",26));
		list.add(new Student2("김태현","A형",27));
		list.add(new Student2("김나혜","A형",29));
		
	}
	
	public void addList() {
		
		System.out.println("학생을 추가합니다");
		System.out.println("추가할 학생이름?");
		String name = sc.nextLine();
		System.out.println("추가할 학생 혈액형?");
		String blood = sc.nextLine();
		System.out.println("추가할 학생나이?");
		int age = Integer.parseInt(sc.nextLine());
		list.add(new Student2(name, blood, age));
	}
	public static void main(String[] args) {
		
	Person ex = new Person();
	
		
	
	}

}

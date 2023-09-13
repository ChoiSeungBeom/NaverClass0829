package bit701.day0913;

import java.util.Scanner;

interface Board{
	public void process();
}
//총 4개의 subclass 구현
class Insert implements Board{
	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println("Insert메서드 실행");
	}
//	public Insert() {
//		System.out.println("글이 추가됩니다!");
//	}
}

class Delete implements Board{
	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println("Delete 메서드 실행");
	}
//	public Delete() {
//		System.out.println("글이 삭제됩니다!");
//	}
}
class Update implements Board{
	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println("Update메서드 실행");
	}
//	public Update() {
//		System.out.println("글이 수정됩니다!");
//	}
}
class List implements Board{
	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println("List메서드 실행");
	}
//	public List() {
//		System.out.println("글목록을 보여줍니다");
//	}
}
public class Ex7_InterfaceTest {
	public static void process(Board b) {
		b.process();
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int num;
		Board b=null;
		Exit:
		while(true) {
			System.out.println("1.글쓰기    2.글삭제    3.글수정    4.글목록    5.종료");
			System.out.println("선택>");
			num = Integer.parseInt(sc.nextLine());
			switch(num) {
			case 1:
				b=new Insert();
				
				break;
			case 2:
				b=new Delete();
				break;
			case 3:
				b=new Update();
				break;
			case 4:
				b=new List();
				break;
			default:
				System.out.println("게시판 관리 종료!!");
				break Exit;
			}
			process(b);
			System.out.println();
			
		}
	}

}

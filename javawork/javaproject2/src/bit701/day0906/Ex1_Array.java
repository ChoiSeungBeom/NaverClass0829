package bit701.day0906;

public class Ex1_Array {

	public static void main(String[] args) {
		//교재 p.165
		//배열 : 연속된 형태로 데이터가 저장되는 형태
		//		 배열에는 같은 타입의 데이터만 저장이 가능하다
		//		 일괄적으로 처리하기 위해서 배열을 사용
		//		 자바에서 하나의 배열은 하나의 객체로 인식된다
		//배열 선언 방법 1
		int [] list = new int [5]; // 5개의 정수타입을 저장할 공간이 확보, 0으로 자동 초기화
		
		System.out.println("list의 배열 인덱스 개수 :" + list.length);
		//배열 선언 방법 2
		
		list[0] = 10;
		list[1] = 20;
		list[2] = 30;
		list[3] = 40;
		list[4] = 50;
		
		
		// 출력 1
		for(int i= 0; i<list.length;i++) {
 
		System.out.println(list[i]);
		}
		
		// 출력 2
		for(int n:list) { //arr1의 갯수만큼 자동으로 반복이되면서 하나하나의 값을 n으로 보냄
			System.out.println(n);
		}
	}
}

package JavaQuiz;
import java.util.*;
public class ArrayPractice {

	public static void main(String[] args) {
	int[] array = {1,5,3,8,2};
	
	int sum = 0;
	for(int i=0; i<array.length;i++) {
		sum += array[i];
	}
	System.out.println("총합 : " + sum);
	
	double avg = (double)sum / array.length;
	
	System.out.println(avg);
	
	
	
	}
}



/*
 * 정수를 여러개 입력 받아 List<> 에 저장한 후, 검색할 배수를 입력 받음. List을 검색하여의 주어진 수의 배수만 골라서 출력하는 프로그램을 작성하라. 음수를 입력하면 입력을 중단한다.


-실행결과 예


정수들을
입력>
2 44 6 8 9 12 88 100 2323 -1


검색할
배수 입력 > 3


6
9 12*/
 
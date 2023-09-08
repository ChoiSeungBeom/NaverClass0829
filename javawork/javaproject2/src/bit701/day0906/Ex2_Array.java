package bit701.day0906;
import java.util.*;
public class Ex2_Array {

	public static void main(String[] args) {
		int []arr = {5,4,6,7,8};


		//1번 출력
		System.out.println("****1번*****\n");
		for(int i : arr) {
			System.out.println(i);
			
		}
		
		
		
		//2번 출력
		System.out.println("****2번*****\n");
		for (int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
		//3번 출력
		System.out.println("****3번*****\n");
		System.out.println(Arrays.toString(arr));
		
		
		System.out.println("=".repeat(40));
		int [] arr2;
		
		arr2 = new int [] {3,6,8,10,30}; //선언을 한후 나중에 값을 한꺼번에 지정할경우
		for(int i=0;i<arr2.length;i++) {
			System.out.printf("[%2d : %2d]",i,arr2[i]);
			
		}
		System.out.println("=".repeat(40));
		for(int n:arr2)
			System.out.printf("%3d",n);
		System.out.println();
		
		
	}
}

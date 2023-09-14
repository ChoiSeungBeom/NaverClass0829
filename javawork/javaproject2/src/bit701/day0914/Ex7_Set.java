package bit701.day0914;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
public class Ex7_Set {

	public static void main(String[] args) {
		//Set 인터페이스의 특징: 1.순차적이 아니다 2. 중복허용을 안한다
		
//		Set<Integer> set=new HashSet<Integer>();//비순차적
		Set<Integer> set=new TreeSet();//오름차순
		System.out.println(set.size());//size는 데이터의 갯수(배열은 length)
		set.add(30);
		set.add(5);
		set.add(1);
		set.add(10);
		set.add(5);//중복되서 데이터에 포함안됨 데이터는 들어가는데 1번만 계산됨
		set.add(7);
		System.out.println(set.size()); 
		
		//컬렉션들을 출력하는 방법 여러가지가 있다
		//출력 1
		System.out.println("-".repeat(30));
		for(Integer n:set) { //Set에서 차례대로 객체를 꺼내서 n에다가 넣겠다는 것
			System.out.println(n);
		}
		System.out.println("-".repeat(30));
		
		//출력2
		Iterator<Integer> iter=set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("-".repeat(30));
		
	}

}

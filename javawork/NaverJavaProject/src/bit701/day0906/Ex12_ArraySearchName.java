package bit701.day0906;
import java.util.*;
public class Ex12_ArraySearchName {

	public static void main(String[] args) {
		String []names = {"강호동","유재석","한채영","이효리","이승기","강남길","이민정","이서진","손미나","유미리"
				};
		String searchsung= "";
		Scanner sc = new Scanner(System.in);
		int count;
		boolean bFind;
		while(true) {
			
			count=0;
			bFind=false; //여러번 입력할 때 안쪽에 초기값
			
			System.out.println("검색할 성은?");
			searchsung=sc.nextLine();
			//종료
			if(searchsung.equals("끝")) {
				System.out.println("***종료합니다***");
				break;
			}
			for(int i=0;i<names.length;i++) {
				if(names[i].startsWith(searchsung)) {
					bFind=true;
					count++;
					System.out.println(i+1+":"+names[i]);
				}
				
			}
			if(bFind) {
				System.out.println("*** 총" + count + "명 **");
			}
			else
				System.out.printf("\"%s\" 씨성을 가진 멤버는 없습니다\n",searchsung);
			System.out.println();
		}
		/*
		 * 검색할 성은? 이
		 * 
		 * 4: 이효리
		 * 5: 이승기
		 * 7: 이민정
		 * 8: 이서진
		 * 	 	총 4명
		 * 
		 * 검색할 성은? 박
		 * 	'박'씨성을 가진 멤버는 없습니다
		 * 
		 * 
		 * 검색할 성은? 끝
		 * '종료합니다'
		 * 
		 * 
		 * 변수 : String searchSung
		 * 			int count;
		 * 			boolean bFind;
		 * 
		 * startsWith를 사용해서 프로그램 작성
		 * */
		
		
		
		
		}

}

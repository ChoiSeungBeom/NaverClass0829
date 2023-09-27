package JavaQuiz.day0914;
import java.util.*;
class Solution {
	Scanner sc= new Scanner(System.in);
    public int solution(String A, String B) {
        //count 값을 구한다
        //문자열 A와 B를 설정한다
        int count = 0;
        
        //문자열 A를 받아 for반복문
        String inputA = A;
        for(int i = 0; i < A.length(); i++) {
       //inputA와 B가 일치하면, count를 반환받고 종료
            if(inputA.equals(B)) {
           return count ;
       }     
            //inputA의 마지막 문자를 a에 저장
            String a = inputA.substring(inputA.length()-1);
            //inputA의 문자를 제외한 나머지 부분과 마지막 문자를 더함
            inputA = a + inputA.substring(0, inputA. length() -1);
            //일치하지 않았을 때 count 증가
            count ++;
        }
        //-1을 반환
        return -1;
 
    }
    
    public static void main(String[] args) {
		Solution s = new Solution();
		
		System.out.println(s.solution("Hello", "oHell"));
		System.out.println(s.solution("mtmt", "mtmt"));
		System.out.println(s.solution("Apple", "elppA"));
	}
}
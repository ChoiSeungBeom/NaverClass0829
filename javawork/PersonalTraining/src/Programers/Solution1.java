package Programers;
import java.util.*;
public class Solution1 {
	
	function Solution1(common) {
		  let answer = 0;
		   // 가장 간단하게 등차를 구하는 로직과 등비를 구하는 방식을 짜보자
		   // 1번값과 마지막 값의 중간값의 *2면 등차수열이다.  
		if (common[0] + common[2] === (common[1] * 2)) {
		    answer = common[common.length-1] + (common[1] - common[0]);
		  } else {
		    answer = common[common.length-1] * (common[1] / common[0]);
		  }
		  return answer;
		}
	public static void main(String[] args) {
		
	}
}

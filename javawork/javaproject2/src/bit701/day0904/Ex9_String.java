package bit701.day0904;

public class Ex9_String {
	public static void main(String []args) {
		
		String str1="apple";
		String str2="AppLe";
		String str3="Have a Good Day";
		String str4="	Happy	";
		
		
		System.out.println(str3.length()); // str3의 총 길이 : 15
		System.out.println(str1.toLowerCase()); // str2 을 모두 소문자로 변환
		System.out.println(str2.toUpperCase()); // str2 을 모두 대문자로 변환
		System.out.println(str3.substring(5)); // 5부터 끝까지 출력
		System.out.println(str3.substring(7,11)); // 7부터 10까지 추출해서 출력
		System.out.println(str3.charAt(0)); // str3 에서 0번 문자 출력 
		System.out.println(str3.charAt(7)); // str3 에서 7번 문자 출력
		System.out.println(str1.indexOf('a')); // str1 에서 첫번째 'a' 의 인덱스값
		System.out.println(str3.lastIndexOf('a')); // str3 에서 마지막 'a'의 위치
		System.out.println(str4.length()); // 앞뒤 공백을 포함한 str4의 길이
		System.out.println(str4.trim().length()); //앞뒤 공백제거후 str4의 길이 
		System.out.println(str3.startsWith("Have")); // boolean(Have로 시작하는지) 대소문자 구별해야됨
		System.out.println(str3.endsWith("day")); // boolean(day로 끝나는지) 대소문자 구별해야됨
		System.out.println(str1.equals(str2)); //boolean(str2와 1이 같은지) --> equals는 대소문자 구별해야됨
		System.out.println(str1.equalsIgnoreCase(str2)); //boolean(str2와 1이 같은지) --> equalsIgnoreCase는 대소문자 구분x
		System.out.println(str1.compareTo(str2)); // str1과 str2의 차이(양수값 : str1이 더 큰값, 음수값 : str2가 더 큼
		System.out.println(str1.compareTo("apple")); // 완전 같은경우 0 
		
	}
}

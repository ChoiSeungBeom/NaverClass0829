package bit701.day0831;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Ex7_Format {

	public static void main(String[] args) {
		//패턴을 이용해서 다양하게 날짜,시간을 출력해보자
		Date date = new Date();
		
		
		//pattern 1
		SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE"); //EEE : 요일짧게 표기
		System.out.println(dateFormat1.format(date));

		//pattern 2
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy년MM월dd일 a hh:mm:ss EEEE"); //a:오전/오후 EEEE:요일길게 hh : 12시간
		System.out.println(dateFormat2.format(date));
		
		//숫자를 포맷 양식에 맞게 출력하기
		int money = 4567890;
		
		NumberFormat numberFormat1 = NumberFormat.getInstance();
		System.out.println(numberFormat1.format(money)); // 4,567,890
		
		NumberFormat numberFormat2 = NumberFormat.getCurrencyInstance();
		System.out.println(numberFormat2.format(money)); // 4,567,890 해당 지역 화폐 단위 생성(원)
		
		double num = 456.12345;
		System.out.println(numberFormat1.format(num));//456.123
		
		numberFormat1.setMaximumFractionDigits(1);
		System.out.println(numberFormat1.format(num));// 456.1 소수점 두번째 자리 5보다 클 떄에는 반올림
		
		
	}
	
}

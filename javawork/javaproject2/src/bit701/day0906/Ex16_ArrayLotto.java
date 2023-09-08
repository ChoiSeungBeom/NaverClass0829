package bit701.day0906;

//int [] ball = new int[45];
//랜덤 함수를 통해 복권번호를 출력해보자

//=============================출력값입니다(코드 상 제외)============================= // 

//ball[1]의 값은 : 랜덤값
//ball[2]의 값은 : 랜덤값
//ball[3]의 값은 : 랜덤값
//ball[4]의 값은 : 랜덤값
//ball[5]의 값은 : 랜덤값
//ball[6]의 값은 : 랜덤값

import java.util.*;
public class Ex16_ArrayLotto {

	public static void main(String[] args) {
		
	int [] ball = new int[45];
	
	for(int i=0;i<ball.length;i++) {
		ball[i] = i+1;
		
	}
	int tmp = 0;
	int r = 0;
	for(int j=1;j<6;j++) {
	r = (int)(Math.random()*45);
	tmp = ball[j];
	ball[j] = ball[r];
	ball[r] = tmp;
	}
	for(int i=0;i<6;i++) {
		System.out.printf("ball[%d]의 값은 : %d\n",i,ball[i]);
	}
	
	
	
	}

}

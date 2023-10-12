package kr.co.softcampus.main;

import kr.co.softcampus.beans.HelloWorld;
import kr.co.softcampus.beans.HelloWorldEn;

public class MainClass {

	public static void main(String[] args) {
		HelloWorld hello = new HelloWorldEn();
		
	}
	
	public static void calMethod(HelloWorld hello) {
		hello.sayHello();
	}
}

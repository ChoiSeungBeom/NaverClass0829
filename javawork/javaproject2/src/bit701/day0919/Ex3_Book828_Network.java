package bit701.day0919;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex3_Book828_Network {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress local = InetAddress.getLocalHost();
		System.out.println("내 컴퓨터의 IP 주소 : "+local.getHostAddress());
		System.out.println("내 컴퓨터의 이름 : " + local.getHostName());
		
		//naver 서버의 ip를 알고자 할경우
		InetAddress [] naverArr=InetAddress.getAllByName("www.naver.com");
		for(InetAddress inet:naverArr) {
			System.out.println("네이버의 서버 Ip: "+inet.getHostAddress());
		}
		InetAddress [] googleArr=InetAddress.getAllByName("www.google.com");
		for(InetAddress inet:googleArr) {
			System.out.println("구글의 서버 Ip: "+inet.getHostAddress());
		}
		InetAddress [] nateArr=InetAddress.getAllByName("www.nate.com");
		for(InetAddress inet:nateArr) {
			System.out.println("네이트의 서버 Ip: "+inet.getHostAddress());
		}
		
	}

}

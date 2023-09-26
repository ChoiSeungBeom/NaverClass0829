package bit701.day0925;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import db.DbConnect;

public class Ex1_OracleShopInsert {
	DbConnect db=new DbConnect();
	
	public void shopInsert() {
		Scanner sc= new Scanner(System.in);
		System.out.println("상품명 입력:");
		String sang=sc.nextLine();
		
		System.out.println("가격 입력");
		int price=Integer.parseInt(sc.nextLine());
		
		System.out.println("색상 입력");
		String color=sc.nextLine();
		
		String sql="insert into shop values(seq_shop.nextval,'"+sang+"',"+price+",'"+color+"')";
		System.out.println(sql);
		
		Connection conn =null;
		Statement stmt = null;
		
		//db연결
		conn=db.getOracleConnection();
		//statement생성
		try {
			stmt=conn.createStatement();
			//실행
//			boolean b = stmt.execute(sql); // 반환타입 boolean --> 거의 false 출력
//			int n = stmt.executeUpdate(sql); // 반환타입 int --> sql문을 성공한 개수 : 몇개가 업데이트, 삭제됐는지 확인하기 위해 가끔 사용
//			System.out.println(b+","+n);
//			System.out.println("데이터 두번 INSERT됨");
			
			stmt.execute(sql);
			System.out.println("shop에 데이터 추가됨");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("sql문 오류:"+e.getMessage());
		} finally {
			db.dbClose(stmt, conn);
		}
	}
	public static void main(String[] args) {
		Ex1_OracleShopInsert ex=new Ex1_OracleShopInsert();
		ex.shopInsert();
	}

}

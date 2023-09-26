package bit701.day0925;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import db.DbConnect;

public class Ex3_OracleShopDelete {
	DbConnect db=new DbConnect();
	
	public void shopDelete() {
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 상품명 입력: ");
		String sang =sc.nextLine();
		String sql="DELETE FROM SHOP WHERE SANG_NAME = '"+sang+"'";
		
		Connection conn = null;
		Statement  stmt = null;
		conn=db.getOracleConnection();
		try {
			stmt=conn.createStatement();
			
			int n = stmt.executeUpdate(sql);
			//실행 - 성공적으로 삭제된 레코드의 갯수를 알고싶다면 executeUpdate
			if (n==0) {
				System.out.println(sang+"상품이 목록에 없습니다.");
			}
			else {
				System.out.println(n+"개의'"+sang+"'상품이 삭제됩니다.");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("에러가 발생합니다:"+e.getMessage());
		} finally {
			db.dbClose(stmt, conn);
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex3_OracleShopDelete ex=new Ex3_OracleShopDelete();
		ex.shopDelete();
	}

}

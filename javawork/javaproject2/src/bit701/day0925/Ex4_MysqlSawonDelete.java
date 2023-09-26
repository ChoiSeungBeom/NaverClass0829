package bit701.day0925;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import db.DbConnect;

public class Ex4_MysqlSawonDelete {
	DbConnect db = new DbConnect();
	
	public void sawonDelete() {
		//사원명 입력 후 해당 사원 삭제
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 사원을 입력하세요:");
		String n = new String(sc.nextLine());
		//결과
		String sql = "DELETE FROM SAWON WHERE NAME ='"+n+"'";
		
		Connection conn = null;
		Statement stmt = null;
		
		conn=db.getMysqlConnection();
		try {
			stmt = conn.createStatement();
//			stmt.execute(sql);
			int c = stmt.executeUpdate(sql);
			if (c==0) {
				System.out.println(n+"사원은 없습니다.");
			}
			else{
				System.out.println(c+"명의 사원("+n+")이(가) 삭제되었습니다.");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(stmt, conn);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex4_MysqlSawonDelete ex = new Ex4_MysqlSawonDelete();
		ex.sawonDelete();
		
	}
}
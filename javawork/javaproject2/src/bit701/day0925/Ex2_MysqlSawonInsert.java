package bit701.day0925;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import db.DbConnect;

public class Ex2_MysqlSawonInsert {
	DbConnect db=new DbConnect();
	
	public void sawonInsert() {
		Scanner sc=new Scanner(System.in);
		System.out.println("이름");
		String name=sc.nextLine();
		System.out.println("1~100 사이 점수");
		int score = Integer.parseInt(sc.nextLine());
		System.out.println("성별");
		String gender = sc.nextLine();
		System.out.println("부서");
		String buseo=sc.nextLine();
		
		String sql="INSERT INTO SAWON(NAME,SCORE,GENDER,BUSEO) VALUES ('"+name+"',"+score+",'"+gender+"','"+buseo+"')"; // -> (num 값 생성위해서 sawon앞에 컬럼안줘도 돼고 대신 num 자리에 null 쓰면 됨)
		System.out.println(sql);
		System.out.println(sql);
		
		
		Connection conn =null;
		Statement stmt = null;
		
		conn = db.getMysqlConnection();
		
		try {
			stmt= conn.createStatement();
			stmt.execute(sql);
			
			
			System.out.println("데이터 추가완료");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("sql문 오류:" + e.getMessage());
		} finally {
			db.dbClose(stmt, conn);
		}
	}
	public static void main(String[] args) {
		Ex2_MysqlSawonInsert ex = new Ex2_MysqlSawonInsert();
		ex.sawonInsert();

	}

}

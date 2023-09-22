package bit701.day0922;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex3_MysqlGroupSawon {
	static final String MYSQL_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String MYSQL_URL = "jdbc:mysql://localhost:3306/bit701?serverTimezone=Asia/Seoul";
	public Ex3_MysqlGroupSawon() {
		// TODO Auto-generated constructor stub
		try {
			Class.forName(MYSQL_DRIVER);
			System.out.println("Mysql 드라이버 성공");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Mysql 드라이버 실패:" + e.getMessage());
		}
	}
	
	public void sawonBunseok() {
		Connection conn = null;
		Statement stmt = null; //
		ResultSet rs = null;// select일때에만 필요 db로 부터 데이터 가져올때 필요\
		String sql="select buseo,count(*) count,max(score) maxscore,min(score) minscore,avg(score) avgscore from sawon group by buseo";
		try {
			conn = DriverManager.getConnection(MYSQL_URL, "root", "1234");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql); // select 일 경우는 무조건 executeQuery(반환타입이 ResultSet)
			// rs.next() : 다음데이터로 이동을 하고 true 반환, 이동할 데이터가 없을경우 false 반환
			System.out.println("부서\t개수\t최대점수\t최소점수\t평균점수");
			System.out.println("=".repeat(70));
			int n = 0;
			int c = 0;
			double avg;

			while (rs.next()) {
				String buseo=rs.getString("buseo");
				int count = rs.getInt("count");
				int maxscore = rs.getInt("maxscore");
				int minscore = rs.getInt("minscore");
				double avgscore = rs.getDouble("avgscore");


				System.out.println(buseo+"\t"+count + "\t" + maxscore + "\t\t" + minscore + "\t\t" + avgscore);
			}
			
			
//			System.out.println("Mysql 연결 성공");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Mysql 연결 실패:" + e.getMessage());
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException | NullPointerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex3_MysqlGroupSawon ex=new Ex3_MysqlGroupSawon();
		ex.sawonBunseok();
	}

}

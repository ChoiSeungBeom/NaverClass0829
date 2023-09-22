package bit701.day0922;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex2_MysqlJdbc {
	static final String MYSQL_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String MYSQL_URL = "jdbc:mysql://localhost:3306/bit701?serverTimezone=Asia/Seoul";

	public Ex2_MysqlJdbc() {
		// TODO Auto-generated constructor stub
		try {
			Class.forName(MYSQL_DRIVER);
			System.out.println("Mysql 드라이버 성공");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Mysql 드라이버 실패:" + e.getMessage());
		}
	}

	public void sawonAllDatas() {
		Connection conn = null;
		Statement stmt = null; //
		ResultSet rs = null;// select일때에만 필요 db로 부터 데이터 가져올때 필요\
		String sql = "select * from sawon order by name";
		try {
			conn = DriverManager.getConnection(MYSQL_URL, "root", "1234");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql); // select 일 경우는 무조건 executeQuery(반환타입이 ResultSet)
			// rs.next() : 다음데이터로 이동을 하고 true 반환, 이동할 데이터가 없을경우 false 반환
			System.out.println("번호\t이름\t점수\t성별\t부서");
			System.out.println("=".repeat(40));
			int n = 0;
			int count = 0;
			double avg;

			while (rs.next()) {
				String no=rs.getString("num");
				String name = rs.getString("name");
				int score = rs.getInt("score");
				String gender = rs.getString("gender");
				String buseo = rs.getString("buseo");

				n += score;
				count++;
				System.out.println(no+"\t"+name + "\t" + score + "\t" + gender + "\t" + buseo);
			}
			avg=(double)n/count;
			System.out.printf("\n평균점수: %3.1f\n",avg);
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

		Ex2_MysqlJdbc ex = new Ex2_MysqlJdbc();
		ex.sawonAllDatas();
	}
}

package bit701.day0925;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import db.DbConnect;

public class Ex6_MysqlSawonUpdate {
	DbConnect db = new DbConnect();

	public void sawonUpdate() {
		Scanner sc = new Scanner(System.in);
		// num,name,score,buseo 를 입력받은 후 num에 해당하는 name,score,buseo 수정하기

		EXIT:
		while (true) {
			System.out.print("고유번호를 입력하세요 : ");

			int num = Integer.parseInt(sc.nextLine());

			if (num == 0) {
				System.out.print(num + "번에 해당하는 데이터가 없어요, 다시 입력하세요");
				System.out.println();
				continue;
			}
			System.out.print("이름을 입력하세요 : ");
			String name = sc.nextLine();

			System.out.print("점수를 입력하세요 : ");
			int score = Integer.parseInt(sc.nextLine());

			System.out.print("부서를 입력하세요 : ");
			String buseo = sc.nextLine();

			String sql = "UPDATE SAWON SET NAME ='" + name + "', SCORE = " + score + ", BUSEO = '" + buseo + "' WHERE NUM=" + num + ";";
			// num이 없으면 해당 데이터가 없어요

			Connection conn = null;
			Statement stmt = null;

			try {
				conn = db.getMysqlConnection();
				stmt = conn.createStatement();
				stmt.execute(sql);

				System.out.println(num + "번의 데이터를 수정했어요");
				while (true) {
					System.out.println("수정 더 하실 겁니까? 1 : 다시하기 2: 종료");
					int s = Integer.parseInt(sc.nextLine());

					if (s == 1) {
						 break;
					}

					else if (s == 2) {
						System.out.println("프로그램을 종료합니다.");
						System.exit(0);
//						break EXIT;
						
					}

					else {
						System.err.println("-----------------");
						System.err.println("다시입력하세요.");
						System.err.println("-----------------");
						continue;
					}
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				db.dbClose(stmt, conn);
			}

		}
	}


	public static void main(String[] args) {
		Ex6_MysqlSawonUpdate ex = new Ex6_MysqlSawonUpdate();
		ex.sawonUpdate();
	}
}

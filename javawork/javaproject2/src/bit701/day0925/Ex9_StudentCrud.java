package bit701.day0925;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import db.DbConnect;

public class Ex9_StudentCrud {
	// dbconnect
	DbConnect db = new DbConnect();
	// scanner
	Scanner sc = new Scanner(System.in);

	// getmenu class 1.추가 2.삭제 3.수정 4.전체출력 5.검색 6.종료
	public int getMenu() {
		System.out.println("1.추가	2.삭제	3.수정	4.전체출력	5.검색	6.종료");
		int menu = Integer.parseInt(sc.nextLine());
		return menu;
	}

	public void insertStudent() {
		System.out.println("학생이름 : ");
		String name = sc.nextLine();
		System.out.println("학생혈액형 : ");
		String blood = sc.nextLine();
		System.out.println("학생번호 : ");
		String ph  = sc.nextLine();
//		System.out.println("입학날짜 : ");
//		String day = sc.nextLine();
		String sql ="INSERT into student values(NULL,?,?,?,now())";
		Connection conn = db.getMysqlConnection();
		PreparedStatement pstmt = null;
		try {
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, blood);
			pstmt.setString(3, ph);

			pstmt.execute();
			System.out.println("데이터가 추가됩니다.("+ name + ")");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			System.out.println("오류발생"+ e.getMessage());
		} finally {
			db.dbClose(pstmt, conn);
		}
		
	}

	public void deleteStudent() {
		System.out.println("삭제할 학생 번호를 입력하세요");
		int num = Integer.parseInt(sc.nextLine());
		String sql = "delete from student where num = ?";
		Connection conn = db.getMysqlConnection();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			
			pstmt.execute();
			System.out.println(num+"번이 삭제됐습니다");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} finally {
			db.dbClose(pstmt, conn);
		}
	}

	public void updateStudent() {
		System.out.println("데이터 변경을 시작합니다!");
		System.out.println("변경할 번호를 입력하세요");
		String num = sc.nextLine();
		System.out.println("이름 : ");
		String name = sc.nextLine();
		System.out.println("혈액형 : ");
		String blood = sc.nextLine();
		System.out.println("전화번호 : ");
		String ph = sc.nextLine();
		String sql="update student set name=?, blood=? , phone=? where num = ?";
		Connection conn = db.getMysqlConnection();
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, name);
			pstmt.setString(2, blood);
			pstmt.setString(3, ph);
			pstmt.setString(4, num);
			int n=pstmt.executeUpdate();
			if (n==0) {
				System.out.println("해당 데이터가 없습니다");
			}
			else {
				System.out.println(n+"개의 데이터가 수정되었습니다.");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			db.dbClose(pstmt, conn);
		}
		
	}

	public void selectAllStudent() {
		
		
		String sql="select * from student order by num";
		
		Connection conn =db.getMysqlConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			System.out.println("번호\t이름\t혈액형\t전화번호\t시작일");
			System.out.println("-".repeat(40));
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			
			while(rs.next()) {
				int num=rs.getInt("num");
				String name = rs.getString("name");
				String blood = rs.getString("blood");
				String ph = rs.getString("phone");
//				String day = rs.getString("writeday"); // 날짜타입도 String 타입으로 가져와도된다
				Timestamp ts=rs.getTimestamp("writeday");
				
				System.out.println(name+"\t"+blood+"\t"+ph+"\t"+ts);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(rs, pstmt, conn);
		}

	}

	// 검색 - 번호 끝 4자리를 검색
	public void searchPhone() {
		System.out.println("전화번호 끝 4자리를 입력하세요");
		String searchPhone=sc.nextLine();
		String sql="select * from student where phone like ?";
		
		
		Connection conn =db.getMysqlConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			//바인딩
			pstmt.setString(1, "%"+searchPhone);
			rs=pstmt.executeQuery();
			
			System.out.println("전화번호"+ searchPhone+"검색 결과");
			System.out.println("번호\t이름\t혈액형\t전화번호\t시작일");
			System.out.println("-".repeat(40));
			
			while(rs.next()) {
				int num=rs.getInt("num");
				String name = rs.getString("name");
				String blood = rs.getString("blood");
				String ph = rs.getString("phone");
//				String day = rs.getString("writeday");
				Timestamp ts=rs.getTimestamp("writeday");
				
				System.out.println(name+"\t"+blood+"\t"+ph+"\t"+ts);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(rs, pstmt, conn);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex9_StudentCrud ex = new Ex9_StudentCrud();
		while (true) {
			System.out.println("-".repeat(40));
			int menu = ex.getMenu();
			System.out.println("-".repeat(40));
			switch (menu) {
			case 1:
				ex.insertStudent();
				break;
			case 2:
				ex.deleteStudent();
				break;
			case 3:
				ex.updateStudent();
				break;
			case 4:
				ex.selectAllStudent();
				break;
			case 5:
				ex.searchPhone();
				break;
			default:
				System.out.println("**프로그램을 종료합니다**");
				System.exit(0);
			}

		}
	}

}

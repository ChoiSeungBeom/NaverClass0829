package myshop.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import mysql.db.DbConnect;

public class MyShopDao {
	DbConnect db = new DbConnect();

	// 전체 출력
	public List<MyShopDto> getAllSangpums() {
		
		List<MyShopDto> list = new Vector<MyShopDto>();
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from myshop order by num";

		try {
			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				MyShopDto dto = new MyShopDto();
				dto.setNum(rs.getInt("num"));
				dto.setSangpum(rs.getString("sangpum"));
				dto.setPrice(rs.getInt("price"));
				dto.setPhoto(rs.getString("photo"));
				dto.setColor(rs.getString("color"));
				dto.setWriteday(rs.getTimestamp("writeday"));
				// list에 추가
				list.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(rs, pstmt, conn);
		}
		return list;

	}

	// insert
	public void insertShop(MyShopDto dto) {
		String sql = "insert into myshop (sangpum,color,price,photo,writeday) values (?,?,?,?,now())";
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getSangpum());
			pstmt.setString(2, dto.getColor());
			pstmt.setInt(3, dto.getPrice());
			pstmt.setString(4, dto.getPhoto());
			// 실행
			pstmt.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}

	}

	// num에 해당하는 dto 반환
	public MyShopDto getSangpum(String num) {
		MyShopDto dto = new MyShopDto();
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from myshop where num=?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, num);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				dto.setNum(rs.getInt("num"));
				dto.setSangpum(rs.getString("sangpum"));
				dto.setPrice(rs.getInt("price"));
				dto.setColor(rs.getString("color"));
				dto.setPhoto(rs.getString("photo"));
				dto.setWriteday(rs.getTimestamp("writeday"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(rs, pstmt, conn);
		}

		return dto;
	}

	
	  public void updateShop(MyShopDto dto) { 
		  String sql="update myshop set sangpum=?, price=?, photo=?, color=? where num=?";
	  
	  
	  Connection conn = db.getConnection(); 
	  PreparedStatement pstmt=null;
	  
	  try { 
		  pstmt=conn.prepareStatement(sql); //바인딩 pstmt.setString(1, num);
		  pstmt.setString(1, dto.getSangpum());
		  pstmt.setInt(2, dto.getPrice()); 
		  pstmt.setString(3, dto.getPhoto()); 
		  pstmt.setString(4, dto.getColor());
		  pstmt.setInt(5, dto.getNum());
		  
		  pstmt.execute();
	  
		  //실행 pstmt.execute(); 
		  } catch (SQLException e) { // TODO Auto-generated catch
		  System.out.println(e.getMessage()); }
	  finally { db.dbClose(pstmt, conn); }
	  
	  }
	 

	// delete
	public void deleteShop(String num) {
		String sql = "delete from myshop where num=?";
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(sql);
			// 바인딩
			pstmt.setString(1, num);

			// 실행
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}

	}
}

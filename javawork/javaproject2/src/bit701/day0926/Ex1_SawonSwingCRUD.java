package bit701.day0926;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import db.DbConnect;

public class Ex1_SawonSwingCRUD extends JFrame {
	JTextField tfName, tfScore;
	JComboBox<String> cbGender, cbBuseo;
	JTable table;
	DefaultTableModel tableModel;
	JButton btnAdd, btnDel, btnSearch, btnAll, btnSearchBuseo;

	DbConnect db = new DbConnect();

	public Ex1_SawonSwingCRUD() {
		// TODO Auto-generated constructor stub
		super("부서관리");
		this.setBounds(1000, 100, 550, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setDesign();
		this.setVisible(true);
	}

	private void setDesign() {
		// TODO Auto-generated method stub

		// 상단
		tfName = new JTextField(4);
		tfScore = new JTextField(4);
		String[] cbTitle = { "남자", "여자" };
		cbGender = new JComboBox<String>(cbTitle);
		String[] cbBTitle = { "홍보부", "인사부", "교육부" };
		cbBuseo = new JComboBox<String>(cbBTitle);

		JPanel pTop = new JPanel();
		pTop.add(new JLabel("이름"));
		pTop.add(tfName);
		pTop.add(new JLabel("점수"));
		pTop.add(tfScore);
		pTop.add(new JLabel("성별"));
		pTop.add(cbGender);
		pTop.add(new JLabel("부서"));
		pTop.add(cbBuseo);

		this.add("North", pTop);

		// 하단
		btnAdd = new JButton("추가");
		btnDel = new JButton("삭제");
		btnSearch = new JButton("이름검색");
		btnAll = new JButton("전체조회");
		btnSearchBuseo = new JButton("부서검색");

		JPanel pBottom = new JPanel();
		pBottom.add(btnAdd);
		pBottom.add(btnDel);
		pBottom.add(btnSearch);
		pBottom.add(btnAll);
		pBottom.add(btnSearchBuseo);

		// 버튼 이벤트
		btnSearchBuseo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// 검색할 이름 입력받기
				String searchBuseo = JOptionPane.showInputDialog("검색할 부서를 입력해주세요");
				System.out.println(searchBuseo);
				if (searchBuseo == null) {
					JOptionPane.showMessageDialog(Ex1_SawonSwingCRUD.this, "취소합니다");
					return;
				}
				// 취소누를경우 이벤트 종료
				else {
					searchBuseo(searchBuseo);// 이름이 포함된 모든 데이타 테이블에 출력
				}

			}
		});

		btnAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// 데이타를 가져온다
				String name = tfName.getText();
				int score = 0;

				try {
					score = Integer.parseInt(tfScore.getText());
				} catch (NumberFormatException e1) {
					score = 0; // 점수에 문자를 넣으면 그냥 0점으로
				}

				String gender = (String) cbGender.getSelectedItem();
				String buseo = (String) cbBuseo.getSelectedItem();
				// 이름이나 전화번호 입력 안했을경우 종료
				if (score < 0 || score > 100) {
					JOptionPane.showMessageDialog(Ex1_SawonSwingCRUD.this, "점수는 0~100 사이값을 입력하세요");
					return;
				}

				// db 에 insert 하는 메서드 호출
				insertSawon(name, score, gender, buseo);
				// db로부터 다시 데이타를 가져와서 출력
				SawonSelectAll();
				// 입력값 초기화
				tfName.setText("");
				tfScore.setText("");

			}
		});

		btnDel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// 선택한 행번호를 얻는다
				int row = table.getSelectedRow();
				System.out.println(row);// 선택안했을겨우 -1
				if (row == -1) {
					JOptionPane.showMessageDialog(Ex1_SawonSwingCRUD.this, "삭제할 행을 선택해주세요");
				} else {
					// row행의 0번열이 num 값
					String num = table.getValueAt(row, 0).toString();
					deleteSawon(num);
					// 삭제후 데이타 다시 불러온다
					SawonSelectAll();
				}
			}
		});

		// 조회
		btnSearch.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// 검색할 이름 입력받기
				String searchName = JOptionPane.showInputDialog("검색할 이름을 입력해주세요");
				System.out.println(searchName);
				if (searchName == null)
					return; // 취소누를경우 이벤트 종료
				else
					searchSawon(searchName);// 이름이 포함된 모든 데이타 테이블에 출력
			}
		});

		// 전체조회
		btnAll.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				SawonSelectAll();
			}
		});

		this.add("South", pBottom);

		// Center Table
		String[] title = { "번호", "이름", "점수", "성별", "부서" };
		tableModel = new DefaultTableModel(title, 0);
		table = new JTable(tableModel);
		this.add("Center", new JScrollPane(table));

		// 초기 db 데이타 가져오기
		SawonSelectAll();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex1_SawonSwingCRUD ex = new Ex1_SawonSwingCRUD();
	}

	// db method
	// db 에서 전체 데이타를 가져와서 테이블에 출력하는 메서드
	public void SawonSelectAll() {
		// 기존 테이블의 데이타를 모두 지운다
		tableModel.setRowCount(0);

		Connection conn = db.getMysqlConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from Sawon order by num desc";

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Vector<String> data = new Vector<String>();
				String num = rs.getString("num");
				String name = rs.getString("name");
				String score = rs.getString("score");
				String gender = rs.getString("gender");
				String buseo = rs.getString("buseo");

				// Vector 에 순서대로 추가한다
				data.add(num);
				data.add(name);
				data.add(score);
				data.add(gender);
				data.add(buseo);

				// 테이블에 추가
				tableModel.addRow(data);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(rs, pstmt, conn);
		}
	}

	// db 에 추가
	public void insertSawon(String name, int score, String gender, String buseo) {
		// System.out.println(name);
		// System.out.println(gender);
		// System.out.println(score);

		Connection conn = db.getMysqlConnection();
		PreparedStatement pstmt = null;
		String sql = "insert into Sawon values (null,?,?,?,?)"; // num,name,score,gender,buseo

		try {
			pstmt = conn.prepareStatement(sql);
			// ? 3개 바인딩
			pstmt.setString(1, name);
			pstmt.setInt(2, score);
			pstmt.setString(3, gender);
			pstmt.setString(4, buseo);
			// 실행
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}

	}

	// db 삭제하는 메서드
	public void deleteSawon(String num) {
		// System.out.println(num);
		Connection conn = db.getMysqlConnection();
		PreparedStatement pstmt = null;
		String sql = "delete from Sawon where num=?";

		try {
			pstmt = conn.prepareStatement(sql);
			// ? 1개 바인딩
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

	public void searchSawon(String searchName) {
		// TODO Auto-generated method stub
		// 기존 테이블의 데이타를 모두 지운다
		tableModel.setRowCount(0);

		Connection conn = db.getMysqlConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from Sawon where name like ?";

		try {
			pstmt = conn.prepareStatement(sql);
			// 바인딩
			pstmt.setString(1, "%" + searchName + "%");
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Vector<String> data = new Vector<String>();
				String num = rs.getString("num");
				String name = rs.getString("name");
				String score = rs.getString("score");
				String gender = rs.getString("gender");
				String buseo = rs.getString("buseo");

				// Vector 에 순서대로 추가한다
				data.add(num);
				data.add(name);
				data.add(score);
				data.add(gender);
				data.add(buseo);

				// 테이블에 추가
				tableModel.addRow(data);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(rs, pstmt, conn);
		}
	}

	public void searchBuseo(String searchBuseo) {
		// TODO Auto-generated method stub
		// 기존 테이블의 데이타를 모두 지운다
		tableModel.setRowCount(0);

		Connection conn = db.getMysqlConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from Sawon where buseo = ?";

		try {
			pstmt = conn.prepareStatement(sql);
			// 바인딩
			pstmt.setString(1, searchBuseo);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Vector<String> data = new Vector<String>();
				String num = rs.getString("num");
				String name = rs.getString("name");
				String score = rs.getString("score");
				String gender = rs.getString("gender");
				String buseo = rs.getString("buseo");

				// Vector 에 순서대로 추가한다
				data.add(num);
				data.add(name);
				data.add(score);
				data.add(gender);
				data.add(buseo);

				// 테이블에 추가
				tableModel.addRow(data);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(rs, pstmt, conn);
		}
	}

}
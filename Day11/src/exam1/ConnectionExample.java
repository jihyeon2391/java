package exam1;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class ConnectionExample {
	public static void main(String[] args) throws SQLException {
		
		//1. DB 연결
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/mydb";
		String id = "root";
		String pwd = "0000";
		PreparedStatement pst = null;
		try {
			//드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, id, pwd);
			System.out.println("연결 성공");
			
		//2-1.users table에 사용자 정보 저장
		/*String sql = "INSERT INTO users(userid, username, userpassword, userage, useremail)" + "VALUES(?, ?, ?, ?, ?);";
		*/
		//2-2.boards 테이블에 새로운 게시물 정보 저장
		String sql2 = "INSERT INTO boards(btitle, bcontent, bwriter, bdate, bfilename, bfiledata)" + "VALUES(?, ?, ?,now(), ?, ?);";
		
		
		//3.전송 객체
		pst = con.prepareStatement(sql2, Statement.RETURN_GENERATED_KEYS);
		pst.setString(1, "눈 오는 날");
		pst.setString(2, "함박눈이 내린다.");
		pst.setString(3, "winter");
		pst.setString(4, "a.txt");
		pst.setBlob(5, new FileInputStream("a.txt"));
		
		//4.Data 전송
		int n = pst.executeUpdate();
		
		if(n == 1) {
			System.out.println("저장 성공");
			//현재 row 의 bno 값 확인하기
			ResultSet rs = pst.getGeneratedKeys();
			if(rs.next()) {
			int bno = rs.getInt(1);
			System.out.println("저장된 bno : " + bno);
			}
			rs.close();
			
		}else {
			System.out.println("저장 실패");
		}
		
		}catch(Exception e) {
			System.out.println("연결 실패");
			e.getMessage();
		}finally {
			if(con != null) {
			
			con.close();
				System.out.println("연결 끊기");
			
		}
	}
		
		//
}

}

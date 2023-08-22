package exam1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class BoardUpdateExample {
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
			

		//2.boards 테이블에 bno=3 게시물 정보 수정
		/*String sql2 = "UPDATE boards SET btitle=?, bcontent=?, bfilename=?, bfiledata=? WHERE bno=?";*/
		String sql3 = "DELETE FROM boards WHERE btitle=?";
		
		
		//3.전송 객체
		pst = con.prepareStatement(sql3);
		pst.setString(1, "눈사람");
		/*pst.setString(2, "눈으로 만든 사람");
		pst.setString(3, "b.txt");
		pst.setBlob(4, new FileInputStream("b.txt"));
		pst.setInt(5, 3);*/
		
		
		//4.Data 전송
		int n = pst.executeUpdate();
		
		if(n == 1) {
			System.out.println("삭제 성공");		
			
		}else {
			System.out.println("삭제 실패(해당 제목 존재하지 않음)");
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

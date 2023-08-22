package exam1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserSelectExample {
	
	//필드
	static Connection con = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	
	//dburl, id, pwd
	String url = "jdbc:mysql://localhost:3306/mydb";
	String id = "root";
	String pwd = "0000";
	String sql = "";
	
	//생성자
	public UserSelectExample() {
		
		//드라이버 로딩
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, id, pwd);
			System.out.println("연결 성공");
		}catch(Exception e) {
			e.getMessage();
			System.out.println("연결 실패");
		}
	}
	
	//조회 메소드
	public List<User> selectAll() {
		sql = "SELECT * FROM users;";
		List<User> list = new ArrayList();
		try {
		pst = con.prepareStatement(sql);
		
		rs = pst.executeQuery();
		
		User user1;
		
		while(rs.next()) {
			String id = rs.getString(1);
			String name = rs.getString(2);
			String pwd = rs.getString(3);
			int age = rs.getInt(4);
			String email = rs.getString(5);
		
			user1 = new User(id, name, pwd, age, email);
			
			list.add(user1);
		}
		
		
		}catch(SQLException e) {
			e.getMessage();
		}
		return list;
	}
	
	//저장 메소드
	public int userInsert(User user) {
		int n= 0;
		sql = "INSERT INTO users(userid, username, userpassword, userage, useremail) VALUES (?, ?, ?, ?, ?)";
		try {
			pst = con.prepareStatement(sql);
			
			pst.setString(1, user.getUserid());
			pst.setString(2, user.getUsername());
			pst.setString(3, user.getUserpassword());
			pst.setInt(4, user.getUserage());
			pst.setString(5, user.getUseremail());
			
			n = pst.executeUpdate();
			System.out.println("저장 성공");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 1;
		
	}

	public static void main(String[] args) {
		UserSelectExample use = new UserSelectExample();
		List<User> list = use.selectAll();
		
		for(User u : list) {
			System.out.println("아이디 : " + u.getUserid() + "\t이름 : " + u.getUsername() + "\t비밀번호 :  " + u.getUserpassword() + "\t나이 : " + u.getUserage() + "\t이메일 : " + u.getUseremail());
			
		}
		
		//저장
		User user = new User("summer", "여름", "0000", 20, "summer@a.net");
		
		int result = use.userInsert(user);
		
		if(result == 1) {
			System.out.println("저장 성공");
		}
		else {
			System.out.println("저장 실패");
		}
	}

}

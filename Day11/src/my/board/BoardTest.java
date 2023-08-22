package my.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BoardTest {

	
		//필드
		
		Connection con = null;
		
		String url = "jdbc:mysql://localhost:3306/mydb";
		String id = "root";
		String pwd = "0000";
		
		PreparedStatement pst = null;
		ResultSet rs = null;
		String sql ="";

		Scanner scanner = new Scanner(System.in) ;
		
		//생성자
		public BoardTest() {
			connect();
		}

		public void connect() {
			try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, id, pwd);
			System.out.println("연결 성공");
			}catch(Exception e) {
				e.getMessage();
			}
		}
		
		public void list() {
			System.out.println();
			System.out.println("[게시물 목록]");
			System.out.println("-------------------------------------------------------");
			System.out.printf("%-6s%-12s%-16s%-40s \n", "no", "winter", "date", "title");
			System.out.println("-------------------------------------------------------");

			//boards 테이블에서 게시물 정보를 가져와서 출력
			try {
				sql = "SELECT bno, btitle, bcontent, bwriter, bdate FROM boards ORDER BY bno DESC";
				pst = con.prepareStatement(sql);
				rs = pst.executeQuery();
				
				while(rs.next()) {
					Board board = new Board();
					board.setBno(rs.getInt("bno"));
					board.setBtitle(rs.getString("btitle"));
					board.setBcontent(rs.getString("bcontent"));
					board.setBwriter(rs.getString("bwriter"));
					board.setBdate(rs.getDate("bdate"));
					System.out.printf("%-6s%-12s%-16s%-40s \n", board.getBno(), board.getBwriter(), board.getBdate(), board.getBtitle());
				}
				rs.close();
				pst.close();
			}catch(Exception e) {
				e.getMessage();
			}
				
			mainMenu();

		}
		
		public void mainMenu() {
			System.out.println();
			System.out.println("------------------------------------------------");
			System.out.println("메인 메뉴 : 1.Create | 2.Read | 3.Clear | 4.Join | 5.Login | 6.Exit");
			System.out.print("메뉴 선택 : ");
			String menuNo = scanner .nextLine();
			System.out.println();
			
			switch(menuNo) {
			case "1" -> create();
			case "2" -> read();
			case "3" -> clear();
			case "4" -> join();
			case "5" -> login();
			case "6" -> exit();
			}
		}
		
/////////////////////////////////////////////////////
		public void create() {
			//입력 받기
			Board board = new Board();
			System.out.println("[새 게시물 입력]");
			System.out.println("제목 : ");
			board.setBtitle(scanner.nextLine());
			System.out.println("내용 : ");
			board.setBcontent(scanner.nextLine());
			System.out.println("작성자 : ");
			board.setBwriter(scanner.nextLine());
			
			//보조 메뉴 출력
			System.out.println("------------------------");
			System.out.println("보조 메뉴 : 1.OK | 2.Cancel");
			System.out.println("메뉴 선택 : ");
			String menuNo = scanner.nextLine();
			if(menuNo.equals("1")) {
				//board 테이블에 게시물 정보 저장
				try {
					String sql = "INSERT INTO boards (btitle, bcontent, bwriter, bdate) VALUES (?, ?, ?, now())";
					pst = con.prepareStatement(sql);
					
					pst.setString(1, board.getBtitle());
					pst.setString(2, board.getBcontent());
					pst.setString(3, board.getBwriter());
					pst.executeUpdate();
					pst.close();
				}catch(Exception e) {
					e.printStackTrace();
					exit();
				}
			}
			list();
		}
/////////////////////////////////////////////////////
		
		public void read() {
			//입력 받기
			System.out.println("[게시물 읽기]");
			System.out.println("bno : ");
			int bno = Integer.parseInt(scanner.nextLine());
			
			
			//board 테이블에서 해당 게시물을 가져와 출력
			try {
				sql = "SELECT bno, btitle, bcontent, bwriter, bdate FROM boards WHERE bno=?";
				pst = con.prepareStatement(sql);
				pst.setInt(1, bno);
				rs = pst.executeQuery();
				if(rs.next()) {
					Board board = new Board();
					board.setBno(rs.getInt("bno"));
					board.setBtitle(rs.getString("btitle"));
					board.setBcontent(rs.getString("bcontent"));
					board.setBwriter(rs.getString("bwriter"));
					board.setBdate(rs.getDate("bdate"));
					System.out.println("################");
					System.out.println("번호 : " + board.getBno());
					System.out.println("제목 : " + board.getBtitle());
					System.out.println("내용 : " + board.getBcontent());
					System.out.println("작성자 : " + board.getBwriter());
					System.out.println("날짜 : " + board.getBdate());
					
					//보조 메뉴 출력
					System.out.println("------------------------");
					System.out.println("보조 메뉴 : 1.Update | 2.Delete | 3.List");
					System.out.println("메뉴 선택 : ");
					String menuNo = scanner.nextLine();
					System.out.println();
					if(menuNo.equals("1")) {
						update(board);
					}else if(menuNo.equals("2")) {
						delete(board);
					}
				}
				rs.close();
				pst.close();
			}catch(Exception e) {
				e.printStackTrace();
				exit();
			}
			list();
		}
	
		public void update(Board board) {
			//수정 내용 입력 받기
			System.out.println("[수정 내용 입력]");
			System.out.println("제목 : ");
			board.setBtitle(scanner.nextLine());
			System.out.println("내용 : ");
			board.setBcontent(scanner.nextLine());
			System.out.println("작성자 : ");
			board.setBwriter(scanner.nextLine());
			
			//보조 메뉴 출력
			System.out.println("------------------------");
			System.out.println("보조 메뉴 : 1.Update | 2.Delete | 3.List");
			System.out.println("메뉴 선택 : ");
			String menuNo = scanner.nextLine();
			System.out.println();
			if(menuNo.equals("1")) {
				//board 테이블에 게시물 정보 저장
				try {
					String sql = "UPDATE boards SET btitle=?, bcontent=?, bwriter=? WHERE bno=?";
					pst = con.prepareStatement(sql);
					
					pst.setString(1, board.getBtitle());
					pst.setString(2, board.getBcontent());
					pst.setString(3, board.getBwriter());
					pst.setInt(4, board.getBno());
					pst.executeUpdate();
					pst.close();
				}catch(Exception e) {
					e.printStackTrace();
					exit();
				}
			}

		}

		public void delete(Board board) {
			try {
				sql = "DELETE FROM boards WHERE bno=?";
				pst = con.prepareStatement(sql);
				
				pst.setInt(1, board.getBno());
				
				pst.executeUpdate();
				pst.close();
			}catch(Exception e) {
				e.printStackTrace();
				exit();
			}
			list();
		}
/////////////////////////////////////////////////////
		
		public void clear() {
			System.out.println("[게시물 전체 삭제]");
			System.out.println("------------------------");
			System.out.println("보조 메뉴 : 1.OK | 2.Cancel");
			System.out.println("메뉴 선택 : ");
			String menuNo = scanner.nextLine();
			
			if(menuNo.equals("1")) {
				try {
				//boards 테이블에 게시물 정보 전체 삭제
					sql = "TRUNCATE TABLE boards";
					pst = con.prepareStatement(sql);
					pst.executeUpdate();
					pst.close();
				}catch(Exception e) {
					e.printStackTrace();
					exit();
				}
			}	
			list();
		}
/////////////////////////////////////////////////////		
		
		public void join() {

			User1 user = new User1();
			
			System.out.println("[새 사용자 입력]");
			System.out.print("아이디 : ");
			user.setUser1Id(scanner.nextLine());
			System.out.print("이름 : ");
			user.setUser1Name(scanner.nextLine());
			System.out.print("비밀번호 : ");
			user.setUser1Password(scanner.nextLine());
			System.out.print("나이 : ");
			user.setUser1Age(Integer.parseInt(scanner.nextLine()));
			System.out.println("이메일 : ");
			user.setUser1Email(scanner.nextLine());
			
			System.out.println("------------------------");
			System.out.println("보조 메뉴 : 1.OK | 2.Cancel");
			System.out.print("메뉴 선택 : ");
			String menuNo = scanner.nextLine();
			if(menuNo.equals("1")) {
				try {
					sql = "INSERT INTO users (user1id, user1name, user1password, user1age, user1email) VALUES (?, ?, ?, ?, ?)";
					pst = con.prepareStatement(sql);
		            pst.setString(1,user.getUser1Id());
		            pst.setString(2, user.getUser1Name());
		            pst.setString(3, user.getUser1Password());
		            pst.setInt(4, user.getUser1Age());
		            pst.setString(5, user.getUser1Email());
		            pst.executeUpdate();
		            pst.close();
		            }catch(Exception e){
		            	e.printStackTrace();
		            	exit();
		            }
					list();
				}
		
		}

		public void login() {
			// 입력 받기
			User1 user = new User1();
			System.out.println("[로그인]");
			System.out.print("아이디: ");
			user.setUser1Id(scanner.nextLine());
			System.out.print("비밀번호: ");
			user.setUser1Password(scanner.nextLine());

			// 보조 메뉴 출력
			System.out.println("-------------------------------------------------------------------");
			System.out.println("보조 메뉴: 1.Ok | 2.Cancel");
			System.out.print("메뉴 선택: ");
			String menuNo = scanner.nextLine();
			if (menuNo.equals("1")) {
				//boards 테이블에 게시물 정보 저장
				try {
					sql = "SELECT userpassword FROM users WHERE userid= ?";
					pst = con.prepareStatement(sql);
					pst.setString(1, user.getUser1Id());
					rs = pst.executeQuery();
					if (rs.next()) {
						String dbPassword = rs.getString("userpassword");
						if (dbPassword.equals(user.getUser1Password())) {
							String loginOk = user.getUser1Id();
						} else {
							System.out.println("비밀번호가 일치하지 않습니다.");
						}
					} else {
						System.out.println("아이디가 존재하지 않습니다.");
					}
					rs.close();
					pst.close();
				} catch (Exception e) {
					e.printStackTrace();
					exit();
				}

				//게시물 목록 출력
				list();
			}
	}
			
/////////////////////////////////////////////////////
		
		public void exit() {
			if(con != null) {
				try {
					con.close();
				}catch(SQLException e) {
				}
			}
			System.out.println("**게시판 종료**");
			System.exit(0);
		}

//	public void list() {
//
//			try {
//			sql = "SELECT bno, btitle, bcontent, bwriter, bdate FROM boards ORDER BY bno DESC";
//			pst = con.prepareStatement(sql);
//			System.out.println("여기");
//			rs = pst.executeQuery();
//			
//			while(rs.next()) {
//				int no = rs.getInt(1);
//				String title = rs.getString(2);
//				String content = rs.getString(3);
//				String writer = rs.getString(4);
//				java.sql.Date date = rs.getDate(5);
//					
//				Board board = new Board(no, title, content, writer, date);
//				System.out.printf("%-6s%-12s%-16s%-40s \n",no,title,content,writer,date);
//			}
//			rs.close();
//			pst.close();
//			}catch(Exception e) {
//			e.getMessage();
//			}
//		}
		
		
		
		public static void main(String[] args) {
			BoardTest bt = new BoardTest();
			bt.list();
		}
	}

package exam5;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	
	//서버 소컷
	static ServerSocket server = null;
	
	//포트 번호
	static final int PortNumber = 50001;
	
	//소켓
	static Socket socket;
	
//	//생성자
//	public ServerExample(int PortNumber) {}
	
	public static void main(String[] args) {
		System.out.println("------------------------------------------------------------");
		System.out.println("서버를 종료하려면 q 또는 대문자 Q를 입력하고 ENTER 키를 입력");
		System.out.println("------------------------------------------------------------");
		
		
		try {
			server = new ServerSocket(PortNumber);
			System.out.println("서버 대기 중");
			
			socket = server.accept();
			InetAddress inet = InetAddress.getLocalHost();
			
			System.out.println(inet.getHostAddress() + "클라이언트 접속 성공");
		}
		catch (IOException e) {
			
		}
	}
}

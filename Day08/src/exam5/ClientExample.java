package exam5;

import java.io.IOException;
import java.net.Socket;

public class ClientExample {


	//소켓
	static Socket socket;
	
	public static void main(String[] args) {
		
	
		
		try {
			Socket socket = new Socket("localhost", 50001);
			System.out.println("클라이언트 연결 성공");
			
			socket.close();
			System.out.println("클라이언트 연결 끊음");
		}
		catch (IOException e) {
			
		}
	}
}

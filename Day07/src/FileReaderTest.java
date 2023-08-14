import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {   //xxxxxReader : 2바이트 데이터 처리 입력 객체, read()
								//xxxxxWriter : 2바이트 데이터 처리 출력 객체. write()
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader
		("C:\\Users\\COMPUTER\\elipse-workspace\\Day07\\src\\FileOutputTest.java");
		BufferedReader br = new BufferedReader(fr);
		String result = null;
		
		while((result = br.readLine()) != null) {
			System.out.println(result);
		}
	}
}

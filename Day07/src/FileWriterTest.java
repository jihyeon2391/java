import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterTest {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("Test2.txt");
		
		BufferedWriter br = new BufferedWriter(fw);
		
		String str = null;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader key = new BufferedReader(isr);
		
		while((str = key.readLine()) != null) {
			fw.write(str);
		}
		
		System.out.println("파일 저장 끝");
	}

}

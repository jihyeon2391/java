import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class MyResource {
	
	private String name;
	
	
	public MyResource(String name) {
		this.name = name;
		System.out.println("MyResource(" + name + ")열기");
	}
	
	public String read1() {
		System.out.println("MyResource(" + name + ")열기");
		return "100";
	}

	public String read2() {
		System.out.println("MyResource(" + name + ")읽기");
		return "abc";
	}
	
	
	public void close() throws Exception {
		System.out.println("MyResource(" + name + ")닫기");
	}
	

	public static void main(String[] args) throws IOException {
		
		File file = new File("Test.txt");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			
			int n;
			while((n=fis.read()) != -1) {
				System.out.println((char)n);
				
			}
			System.out.println((char)(fis.read()));
			
			
		}
		catch(IOException io) {
			io.printStackTrace();
		}
		finally {
			fis.close();
			
		}
		
		MyResource myresource = new MyResource("Test");
//		System.out.println(myresource.read1());
//		System.out.println(myresource.read2());
		
	}

}

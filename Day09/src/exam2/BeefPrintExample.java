package exam2;

import java.awt.Toolkit;

public class BeefPrintExample {
	public static void main(String[] args) {	
		
		Thread theread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep();
					try { Thread.sleep(500); } catch(Exception e) {}
				}
				
			}
		});
		
		theread.start();
		
		for(int i=0; i<5; i++){
			System.out.println("띵");
			try {Thread.sleep(500); } catch(Exception e) {}
		}
	}
}

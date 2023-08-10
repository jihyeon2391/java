package my.day6.exam4;

public class ButtonExample {
	public static void main(String[] args) {
		
	
	//Button 객체 생성
	
	Button btnOk = new Button();
	
	class OkListener implements Button.ClickListener{

		@Override
		public void onClick() {
			System.out.println("OK 버튼 클릭함");
			
		}
	}
		

	
	btnOk.setClickListener(new OkListener());
	
	btnOk.click();
	
	Button btnCancel = new Button();
	
	class CancelListener implements Button.ClickListener{
		
		@Override
		public void onClick() {
			System.out.println("Cancel 버튼 클림함");
		}
	}
	
	btnCancel.setClickListener(new CancelListener());
	
	btnCancel.click();
	}
	
}


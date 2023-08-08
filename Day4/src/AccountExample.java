
class Account{
	private int balance;
	private String owner;
	private String ano;   //계좌번호
	
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	//인자 생성자 (멤버 변수 초기화)
	public Account(int balance, String ano, String owner) {
		this.balance = balance;
		this.ano = ano;
		this.owner = owner;
	}
	
	//기본 생성자
	public Account () {}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		if(balance < MIN_BALANCE || balance > MAX_BALANCE) {
			return;
		}
		this.balance = balance;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}
}



public class AccountExample {
	
	public static void main(String[] args) {
		
	
	
	Account account = new Account();
	
	account.setBalance(10000);
	System.out.println("현재 잔고: " + account.getBalance());
	
	account.setBalance(-100);
	System.out.println("현재 잔고: " + account.getBalance());
	
	account.setBalance(2000000);
	System.out.println("현재 잔고: " + account.getBalance());
	
	account.setBalance(300000);
	System.out.println("현재 잔고: " + account.getBalance());
	

	}
}
	


package my.day6.exam1;

public class WeaponTest {
	public static void main(String[] args) {
		Weapon wp;
		
		wp = new Gun();
		wp.action();
		
		wp= new Bow();
		wp.action();
	}

}

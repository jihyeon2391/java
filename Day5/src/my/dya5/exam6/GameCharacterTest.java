package my.dya5.exam6;

import java.util.ArrayList;

public class GameCharacterTest {
	public static void main(String[] args) {
		
		Wizzard wizzard = new Wizzard();  //객체 생성
		wizzard.name = "간달프";
		wizzard.hp = 100;
		wizzard.mp = 80;
		wizzard.punch();
		wizzard.fireball();
		
		Knight knight = new Knight();
		knight.name = "킹아서";
		knight.hp = 200;
		knight.stamina = 50;
		knight.punch();
		knight.slash();
		
		ArrayList<Novice> gamelist = new ArrayList<Novice>();
		
		gamelist.add(knight);
		gamelist.add(wizzard);
		
		for(Novice n: gamelist) {
			if(n instanceof Knight) {
				((Knight)n).slash();
			}
			else if(n instanceof Wizzard) {
				((Wizzard)n).fireball();
			}
		
			
		}
	}

}

class Novice {
	String name;
	int hp;
	
	void punch() {
		System.out.printf("%s(HP : %d)의 펀치\n", name, hp);
	}
	
}

class Wizzard extends Novice {
	//필드 (속성) 선언
	int mp;
	
	void fireball() {
		System.out.printf("%s(MP : %d)의 파이어볼\n", name, mp);
	}
		
}

class Knight extends Novice {
	int stamina;
	
	void slash() {
		System.out.printf("%s(MP : %d)의 슬레시\n", name, stamina);
	}
	
}
	
	

package my.dya5.exam5;

public class Aquaman extends Human {
	public int speed;
	
	@Override
	public String getInfo() {
		String str = super.getInfo();
		str += "\n속도1" + speed;
		return str;
	}
	
	
}

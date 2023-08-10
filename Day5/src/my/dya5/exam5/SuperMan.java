package my.dya5.exam5;

public class SuperMan extends Human{
	public int power;
	
	@Override
	public String getInfo() {
		String str = super.getInfo();
		str +="\n초능력" + power;
		return str;
	
	}
}

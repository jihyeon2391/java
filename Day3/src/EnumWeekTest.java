import java.util.Calendar;

public class EnumWeekTest {

	public static void main(String[] args) {
		
		Week today = null;  //열거 타입 선언
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);    //1(일)~7(토)까지의 숫자 리턴
		
		switch(week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUSEDAY;
			break;
		case 4:
			today = Week.WENDSDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		
		System.out.println("오늘 요일: " + today);
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH );
		int date = cal.get(Calendar.DATE);
		System.out.println(year + "년" +( month + 1) + "월" + date + "일");
		
		if(today == Week.MONDAY) {
			System.out.println("월요일");
		}
		else {
			System.out.println("False");
		}
		
		Week weekday = Week.valueOf("SUNDAY");
		Week Weekday[] = Week.values();
		
//		for(Week days : weekday;) {
			System.out.println();
		}
		
	}
	

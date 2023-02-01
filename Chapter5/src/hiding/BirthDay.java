package hiding;

class BirthDay {
	
	private int day;
	private int month;
	private int year;
	
	// public, private 아무것도 안 쓰면 같은 패키지에서 사용 가능
	
	public int getDay() {
		return day;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setDay(int day) {
		
		if (month == 2) {
			if (day < 1 || day > 28) {
				System.out.println("날짜 오류입니다.");
			}
		} else {
			this.day = day;
		}
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
}

public class BirthDayTest{
	
	public static void main(String[] args) {
		
		BirthDay day = new BirthDay();
		
		day.setDay(30);
		day.setMonth(2);
		day.setYear(2018);
	}
}
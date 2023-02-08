package cooperation;

public class TakeTrans {
	
	public static void main(String[] args) {
		
		Student James = new Student("James", 5000);
		Student Thomas = new Student("Thomas", 10000);
		
		Bus bus100 = new Bus(100);
		James.takeBus(bus100);
		James.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway(2);
		Thomas.takeSubway(subwayGreen);
		Thomas.showInfo();
		subwayGreen.showInfo();
	}
}

package Classtest;

public class Mainclasss_car {
	public static void main(String[] args) {
	Car car1 = new Car("카니발", "회색", 120);
	Car car2 = new Car("펠리세이드", "검은색", 110);
	Car car3 = new Car("소나타", "흰색", 0);
	Car car4 = new Car("모닝", "노란색", 30);

	car1.showInfo();
	car2.showInfo();
	car3.showInfo();
	car4.showInfo();


	}
}

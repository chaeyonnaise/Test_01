package Classtest;

public class Car {
	String model;
	String colour;
	int speed;
	
	public Car(String model, String colour, int speed) {
		this.model = model;
		this.colour = colour;
		this.speed = speed;
	}
		public void showInfo() {
			System.out.println("모델 :" + model);
			System.out.println("색상 :" + colour);
			System.out.println("속도 :" + speed);
		}
		
	
		
		
	}



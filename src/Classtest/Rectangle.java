package Classtest;

public class Rectangle {
	int width;
	int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	
	}
	
	public void getArea() {
		System.out.println("직사각형의 넓이 :" + (width * height));
	
	}
	public void getPerimeter() {
		System.out.println("직사각형의 둘레 :" + (width + height)*2);
	}
}

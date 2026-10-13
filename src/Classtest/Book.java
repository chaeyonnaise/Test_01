package Classtest;

	public class Book {
		String title;
		String author;
		int price;
	
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = 28000;
	}
	public void showInfo() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(price);
	}

}

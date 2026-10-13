package Classtest;

public class Account__test {
	//필드 설정
	String owner;
	int balance;
	
	//생성자 설정
	public Account__test(String owner, int balance) {
		this.owner = owner;
		this.balance = balance;
		
	}
	//입금
	public void deposit(int money) {
		this.balance += money;
	}
	//출금
	public void withdraw(int money) {
		this.balance -= money;
	}
	//잔액 조회 
	public void showbalance() {
		System.out.println(owner + "님의 잔액 :" + balance + "원");
		
	}
}
